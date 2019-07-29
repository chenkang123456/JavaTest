package work;

public class Work1 {

	public static void main(String[] args) {
		int oldArray[]={1,3,5,0,8,0,4,0,6,9,0,10};
		//查找零的个数
		int n=0;
		for(int s:oldArray){
			if(s==0){
				n++;
			}
		}
		
		
		//定义新数组
		
		int newArray[]=new int[oldArray.length-n];
		
		int index=0;
		//新数组赋值
		for(int i=0;i<oldArray.length;i++){
			if(oldArray[i]!=0){
				
				newArray[index]=oldArray[i];
				index++;//新数组坐标移到第二位
			}
			
		}
		//遍历输出
		
		for(int s:newArray){
			System.out.print(s+"\t");
		}
		

	}

}
