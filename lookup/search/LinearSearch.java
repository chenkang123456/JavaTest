package lookup.search;

public class LinearSearch {
	public static void main(String[] args){
		//目标数组
		int[] arr=new int[]{2,3,4,5,22,0,11};
		//目标元素
		int target=0;
		//目标元素所在的下标
		int index=-1;
		//遍历数组
		for(int i=0;i<arr.length;i++){
			if(arr[i]==target){
				index=i;
				break;
			}
		}
		//打印目标元素下标
		System.out.println("index:"+index);
	}

}
