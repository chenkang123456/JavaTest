package Insert.character.arrat;

public class Exer {
    public char[] convert2Array(String str){
        char arr[]=new char[str.length()];
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
             arr[i]=c;
        }
        return arr;
    }
}
