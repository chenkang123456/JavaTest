package Insert.character.arrat;

import java.util.Scanner;

public class Text {
    public static void main(String[] args){
        Exer e1=new Exer();
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个字符串:");
        String str=sc.next();
        e1.convert2Array(str);
        char []arr=e1.convert2Array(str);
        for (char s:arr){
            System.out.print(s+"\t");
        }
    }
}
