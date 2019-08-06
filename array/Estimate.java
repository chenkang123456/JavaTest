package Array;

public class Estimate {
    public static void main(String[] args){
        String str="abcd_ascdr_cnd_dedc";

            //char c=str.charAt(i);
            //String s=String.valueOf(c);

            int num1=str.lastIndexOf("_");
            int num2=str.lastIndexOf("_",num1-1);
            System.out.print(str.substring(num2+1,num1));

    }
}
