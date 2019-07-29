package character.statistics;

public class Exer {
    public static void dispalyCount(String str){
        int other=0;              //其他
        int num=0;                //数字
        int alpha=0;              //字母
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            // s=String.valueOf(c);
            if (c >='a'&& c<'z'){
                alpha++;
            }else if(c >='0' && c <='9'){
                num++;
            }else{
                other++;
            }
        }
      System.out.print("字母:"+alpha+"\t 数字:"+num+"\t 其他:"+other);

    }

}
