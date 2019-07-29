package character.statement2;

public class word {
    public static void count(String str){
        str=str.toUpperCase();
        boolean b1=true;
        int count=0;
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch>='A' && ch<='Z'){
                if(b1){
                    count++;
                    b1=false;
                }
            }else{
                b1=true;
            }
        }
        System.out.println(count+"\t");
    }
}
