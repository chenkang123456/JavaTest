package work;

public class Work4 {
	/**
	 * 
	 * @param oldArray---旧数组
	 * @param index---插入到数组的坐标
	 * @param num---插入的数据
	 * @return
	 */
	public static int[] newArray(int[] oldArray,int index,int num){
		//定义新数组
		int [] newArray=new int[oldArray.length+1];
		 int  oldnum=0;//旧数组的坐标
		for(int i=0;i<newArray.length;i++){//遍历新数组
			if(i!=index){//如果新数组的坐标不是要插入的位置 直接用就数组的数据赋值
				newArray[i]=oldArray[oldnum];
				oldnum++;//旧数组的坐标向下移一位
			}
			else{
				newArray[i]=num;//如果是插入的位置 就直接插入 要插入的数据
			}
		}
		//遍历数据
		for(int s:newArray){
			System.out.print(s+"\t");
		}
		
		
		
		return newArray;
		
	} 

	public static void main(String[] args) {
		int[] nums={1,2,3,4,5,6};
		newArray(nums,3,55);

	}

}
