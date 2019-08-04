package lookup.search;

public class BinarySearch {

	public static void main(String[] args) {
		//目标数组
		int[] arr=new int[]{1,2,3,4,5,6,7,8,9};
		//目标元素
		int target=8;
		//记录开始位置
		int begin=0;
		//记录结束位置
		int end=arr.length-1;
		//记录中间位置
		int mid=(begin+end)/2;
		//记录目标位置
		int index=-1;
		//循环查找
		while(true){
			//判断中间元素是不是要查找的元素
			if(arr[mid]==target){
				index=mid;
				break;
				//中间这个元素不是要查的元素
			}else{
				//判断中间这个元素是不是比目标元素大
				if(arr[mid]>target){
					end=mid-1;
				//判断中间这个元素是不是比目标元素小
				}else{
					begin=mid+1;
				}
				//取出新的中间位置
				mid=(begin+end)/2;
			}
		}
		System.out.println("index:"+index);
	}
}
