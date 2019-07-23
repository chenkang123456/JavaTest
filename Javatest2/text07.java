import java.util.Scanner;

public class text07{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //默认a>b>c;
        System.out.println("请输入第一个数");
        int a = in.Int();
        System.out.println("请输入第二个数");
        int b = in.nextInt();
        System.out.println("请输入第三个数");
        int c = in.nextInt();
        if(a<b+c && a-c<b){
            System.out.println("能构成三角形");
        }else{
            System.out.println("不能构成三角形");
        }
        }
    }