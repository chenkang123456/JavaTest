package java0725;

public class Dome1 {

	public static void main(String[] args) {
		
		int [] nums;
		int num[];
		
		//�ȶ����ֵ---Ĭ��ֵ
		nums=new int[4];// 4������  ---����  0,1,2,3
       System.out.println(nums[0]);
       System.out.println(nums[1]);
       //��ֵ---��ʼֵ
       num=new int[]{2,4,6,7,8,9};
       System.out.println(num[0]);
       
       //���岢��ֵ
       int score[]={5,7,8,9,35};//0,1,2,3,4
       System.out.println(score[4]);
       
       //���� ȡֵ  ��ֵ
       score[4]=88;
       System.out.println(score[4]);
       
       
       
       
       
	}

}
