package class0822;
/*
生产者/消费者问题
涉及多线程
涉及共享数据
涉及线程通信
 */

class Clerk{//店员
    int product;
    public synchronized void addProduct(){//生产产品
        if (product>=20){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            product++;
            System.out.println(Thread.currentThread().getName()+"生产了第"+product+"个产品");
            notifyAll();
        }
    }
    public synchronized void consumeProduct(){
        if (product<=0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println(Thread.currentThread().getName()+"消费了第"+product+"个产品");
            product--;
            notifyAll();
        }
    }
}
class Producer implements  Runnable{//生产者
    Clerk clerk;
    public Producer(Clerk clerk){
        this.clerk=clerk;
    }

    @Override
    public void run() {
        System.out.println("生产者开始生产产品");
        while (true) {
            try {
                Thread.currentThread().sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.addProduct();

        }
    }
}
class Consumer implements Runnable{//消费者
    Clerk clerk;
    public Consumer(Clerk clerk){
        this.clerk=clerk;
    }

    @Override
    public void run() {
        System.out.println("消费者开始消费产品");
        while (true){
            try {
                Thread.currentThread().sleep(60000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.consumeProduct();
        }

    }
}
public class TestProduceConsume {
    public static void main(String[] arsg){
        Clerk clerk=new Clerk();
        Producer p1=new Producer(clerk);
        Consumer c1=new Consumer(clerk);
        Thread t1=new Thread(p1);
        Thread t2=new Thread(c1);

        t1.start();
        t2.start();
    }
}
