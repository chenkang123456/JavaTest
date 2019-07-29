package statistics.parameter;

public class Exer {
    public void count(String str){
        str=str.toUpperCase();
        int [] num =new int[26];
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A' && ch<= 'Z'){
                num[ch-65]=num[ch-65]+1;
            }
        }
        for (int i=0;i<num.length;i++){
            System.out.println((char)(i+65)+":"+num[i]);
        }
    }
}
