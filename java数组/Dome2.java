package java0725;

public class Dome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         int nums[]=new int[10];
         // 数组中的值是 1--100；
         for(int i=0;i<10;i++){
        	 nums[i]=i+1;
         }
         System.out.println(nums[9]);
         
        /* for(int j=0;j<10;j++)
         {
        	 System.out.println(nums[j]+"nums"+j+"的值");
         }*/
         
         //数组的属性 ----length--长度   数组变量名.length
         System.out.println(nums.length);
         
         
         for(int j=0;j<nums.length;j++)
         {
        	 System.out.println(nums[j]+"nums"+j+"的值");
         }
         
         
         //遍历数组总的数据  ---for each
         
	}

}
