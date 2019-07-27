package java0725;

public class Dome1 {

	public static void main(String[] args) {
		
		int [] nums;
		int num[];
		
		//先定义后赋值---默认值
		nums=new int[4];// 4个数字  ---坐标  0,1,2,3
       System.out.println(nums[0]);
       System.out.println(nums[1]);
       //赋值---初始值
       num=new int[]{2,4,6,7,8,9};
       System.out.println(num[0]);
       
       //定义并赋值
       int score[]={5,7,8,9,35};//0,1,2,3,4
       System.out.println(score[4]);
       
       //数组 取值  赋值
       score[4]=88;
       System.out.println(score[4]);
       
       
       
       
       
	}

}
