import java.util.Scanner;

public class text05{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int num =sc.nextInt();      
        if(num/10>0 && num/10<1){
            System.out.println(num+"是1位数");
        }else if(num/10>1 && num/10<10){  
            System.out.println(num+"是2位数");
        }else if(num/100>1 && num/100<10){
            System.out.println(num+"是3位数");
        }else if(num/1000>1 && num/1000<10){
            System.out.println(num+"是4位数");
        }else{
            System.out.println(num+"是5位数");
        }
    }
}