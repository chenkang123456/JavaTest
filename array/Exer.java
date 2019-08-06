package Array;

import java.util.Scanner;

public class Exer {
    public char[] reverse() {
        // 原始字符串
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串:");
        String s=sc.next();
        System.out.println("原始的字符串：" + s);
        char[] data = s.toCharArray();
        System.out.print("反转后字符串：");
        for (int i = data.length; i > 0; i--) {
            System.out.print(data[i - 1]);
        }
        return data;
    }

    public static void main(String[]args){
        Exer e1=new Exer();

        e1.reverse();
    }
}
