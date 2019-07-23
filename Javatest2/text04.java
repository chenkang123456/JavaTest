import java.util.Scanner;

public class text04{
    public static void main(String[] args) {
        Scanner sc = new SCanner(System.in);
        System.out.println("请输入一个字符");
        char s=in.nextInt();
        if(s >= 'a' && s <= 'z'){
            System.out.println(s=(char)(s+32));
        }else{
            System.out.println(s);
        }
    }
}