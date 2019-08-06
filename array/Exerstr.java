package Array;

public class Exerstr {
    public static void main(String[] arsg){
        String str = "HelloWorld";
        int strLength = str.length();//字符长度
        int wordLength = 0;//每个单词的长度
        int stStrIndex = 0;//结果字符集下标

        char[] strs = str.toCharArray();
        char[] rtStr = new char[strLength];

        for(int i = 0;i < strLength;i++) {
            if(strs[i] == ' ') {
                for(int j=0;j < wordLength;j++) {
                    rtStr[stStrIndex] = strs[i-j-1];
                    stStrIndex++;
                }
                rtStr[i] = ' ';
                stStrIndex++;
                wordLength = 0;
            }else if(i == strLength-1) {
                for(int j=0;j < wordLength+1;j++) {
                    rtStr[stStrIndex] = strs[i-j];
                    stStrIndex++;
                }
            }else {
                wordLength++;
            }
        }

        StringBuffer sb = new StringBuffer();
        for(char s:rtStr) {
            sb.append(Character.toString(s));
        }

        System.out.println(sb);

    }
    }

