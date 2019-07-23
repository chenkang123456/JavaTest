import java.util.Scanner;

public class text06{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个四位数");
        int num = in.nextInt();
        int sum=0;
		while(num!=0){
			sum = sum + num%10;
			num = num/10;
		}
       System.out.println("这个四位数的各个位数字之和为："+sum);
        }
    }