package character.statement;

import java.util.Scanner;

public class Text {
    public static void main(String[] args){
        words w1=new words();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入英语句子:");
        String s=sc.nextLine();
        w1.count(s);
    }
}
