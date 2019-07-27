package java0725;

public class Dome4 {

	public static void main(String[] args) {
		int score[]={56,67,78,89,90,12,23,34};
		//输出没有元素
		for(int i=0;i<score.length;i++){
			int s=score[i];
			System.out.println(s);
		}
		
		for(int n:score){
			System.out.println(n);
		}

	}

}
