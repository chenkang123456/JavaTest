package java0725;

public class Dome3 {

	public static void main(String[] args) {
		int []nums={4,5,7,8,9,23,45,56,78};
		//���������е�����
		for(int i=0;i<nums.length;i++){
			int n=nums[i];//�����е�ÿһ��Ԫ��
			System.out.println(n);
			
		}
		//foreach  for(�������������  �����е�ÿһ��Ԫ�� :��Ҫ������������ )
		for(int n:nums){
			System.out.println(n+"----");
			
		}
	}

}
