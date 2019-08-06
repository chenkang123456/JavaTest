package Array;

import java.util.Scanner;

public class Mainbox {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入邮箱：");
        String str=sc.next();

        String str1=str.substring(str.length()-4);



        for(int i=0;i<str.length();i++){
            char c1=str.charAt(i);
            if (String.valueOf(i)=="@"){
                i++;
            }
        }
    }
}
