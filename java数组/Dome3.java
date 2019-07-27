package java0725;

public class Dome3 {

	public static void main(String[] args) {
		int []nums={4,5,7,8,9,23,45,56,78};
		//遍历数组中的内容
		for(int i=0;i<nums.length;i++){
			int n=nums[i];//数组中的每一个元素
			System.out.println(n);
			
		}
		//foreach  for(数组的数据类型  数组中的每一个元素 :需要变量的数组名 )
		for(int n:nums){
			System.out.println(n+"----");
			
		}
	}

}
