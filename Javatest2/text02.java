/** 
 * int sum = 2;
	int result = sum == 0 ? 100 : 2 * sum;
    System.out.println("result=" + result);
 * */
    
public class text02{
    public static void main(String[] args) {
        int sum = 2;
	    int result = sum == 0 ? 100 : 2 * sum;     //判断sum是否等于0，是的话输出100，否的话输出2*sum的值。
        System.out.println("result=" + result);    //输出的结果为4.
    }
}