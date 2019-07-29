package character.statement2;

import character.statement.words;

import java.util.Scanner;

public class Text {
    public static void main(String[] args){
        word w1=new word();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入英语句子:");
        String s=sc.nextLine();
        w1.count(s);
    }
}
