package statistics.parameter;

import java.util.Scanner;

public class Text {
    public static void main(String[] args){
        Exer e1=new Exer();
        Scanner sc=new Scanner(System.in);
        System.out.println("输入字符串:");
        String s=sc.next();
        e1.count(s);
    }
}
