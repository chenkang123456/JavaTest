package recursive0731;
import java.util.Scanner;
public class Recursive {
	public  int function(int n){
		int sum;
		if(n==1||n==2){
			sum=  1;
		}else{
			sum= function(n-1)+function(n-2);
		}
	 System.out.print(sum+"\t");
	return sum;	
	}
	
	public static void main(String[] args){
		 Recursive  R1=new Recursive();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("请输入月份:");
		 int n=sc.nextInt();
		 R1.function(n);
		 
	}
}
