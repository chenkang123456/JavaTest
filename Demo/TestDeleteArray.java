package Demo;

import java.util.Arrays;

public class TestDeleteArray {
	//删除数组的元素
	public static void main(String[] args){
		
		//目标数组
		int arr[] =new int []{9,8,5,3,21,4};
		//要删除元素下标
		int dst=3;
		System.out.println(Arrays.toString(arr));
		//创建一个新的数组，长度为原数组长度-1，
		int[] newarr=new int[arr.length-1];
		//复制原数组中除了要删除的那个元素以外的其他元素
		
		for(int i=0;i<newarr.length;i++){
			if(i<dst){
				newarr[i]=arr[i];
			}else{
				newarr[i]=arr[i+1];
			}
		}
		//新数组替换旧数组
		arr=newarr;
		System.out.println(Arrays.toString(arr));
		
	}

}
