package work;

public class Work3 {
/**
 * 
 * @param oldArray---旧数组
 * @param index---要删除数组的坐标
 * @return
 */
	public int[] newArray(int[] oldArray,int index){
		int [] newArray=new int[oldArray.length-1];//定义新数组
		int num=0;//定义新数组的坐标
		for(int i=0;i<oldArray.length;i++){//遍历就数组
			if(i!=index){//如果不是要删除的坐标  直接给新数组赋值 并坐标++
				newArray[num]=oldArray[i];
				num++;
			}
			
			
		}
		
		for(int s:newArray){
			System.out.print(s+"\t");
		}
		
		
		return newArray;
		
	}
	public static void main(String[] args) {
		Work3 w3=new Work3();
		int [] nums={1,2,3,4,5,6};
		w3.newArray(nums, 2);

	}

}
