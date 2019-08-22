package class0821;

public class MyThread {
    public static void main(String[] args)throws InterruptedException{
        Thread t1=new Thread() {
            public void run(){
            System.out.println("子线程开始");
            double sum=0;
            double num=0;
            for(int i=1;i<=10000;i++){
               num = (2*i-1)*Math.pow(-1,i-1);
               sum = sum+1.0/num;
            }
                System.out.println("前10000项和是"+sum);
                System.out.println("子线程结束");
        }
        };
        t1.start();
        t1.join();
        double sum=0;
        double num=1;
        for(int i=1;i<=1000;i++){
            num=num*i;
            sum=sum+1/num;
        }
        System.out.println("前1000项和是"+sum);
    }
}
