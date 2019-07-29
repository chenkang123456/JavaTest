package character.statement;

public class words {
    public  static void count(String str){
        str=str.toUpperCase();
        int count=1;                   //单词个数
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch >= 'A' && ch <= 'Z') {
                if (i>=1 && (str.charAt(i-1)<'A' || str.charAt(i-1)>'Z'))
                count++;
            }
        }

        /**boolean b1=true;
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z'){
                if(b1){
                    count++;
                    b1=false;
                }
            }else{
                b1=true;
            }
        }*/
        System.out.println(count+"\t");
    }
}
