package character;

import java.util.Scanner;

public class Exer {
    public boolean isPalindrome (String s){
        char[] data = s.toCharArray();
        boolean b1=false;
        int sum=0;
        for (int i=0;i<s.length()/2;i++){
            char c1=s.charAt(i);
            for (int j=s.length()-1;j>s.length()/2;j--){
                char c2=s.charAt(j);
                if (c1==c2){
                    b1=true;
                    break;
                }

            }

        }
        if (b1){
            System.out.println("是回文");
        }else {
            System.out.println("不是回文");
        }
        return b1;
    }
    public static void main(String[] args){
        Exer e1=new Exer();

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串:");
        String s=sc.next();
        boolean b1=e1.isPalindrome(s);
    }

}
