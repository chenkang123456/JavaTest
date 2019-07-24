public class test02{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
			// 打印每行第一个*之前的空格，第i行对应有n-i个
			
			// 打印对应每行的"*"+空格,对应第i行打印i次
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			// 换行
			System.out.println("");
		}

    }
    
}