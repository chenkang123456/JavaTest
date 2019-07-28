import java.util.Arrays;

public class hello {
   public static void main(String[] args) {
       String str[] = new String[] {"ab","cd","ef","yf"};

       Arrays.sort(str);

       int index = Arrays.binarySearch(str,0,2,"cd");
       System.out.println("cd的索引位置是："+ index);
   }

}