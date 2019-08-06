package Array;

public class Reciprocate {
    public static void main(String[] args){
        String oldstr="abcdabcdaeeff";
        String newstr="";
        for (int i=0;i<oldstr.length();i++) {
            char c=oldstr.charAt(i);
            String s=String.valueOf(c);
            boolean b1=false;
            if (newstr.contains(s)){
                b1=true;
            }else{
                newstr+=s;
            }

        }
        System.out.print(newstr);
    }
}
