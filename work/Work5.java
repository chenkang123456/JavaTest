package work;

public class Work5 {
	// 判断数组a 中是否存在 num 数字
	public boolean disArray(int [] a,int num){
		boolean b=false;
		for(int i=0;i<a.length;i++){
			if(a[i]==num){
				b=true;
			}
		}
		return b;		
	}
	//  
	public void joinarray(int [] a,int[] b){
		int num=0;
		//判断重复数字的个数
		for(int i=0;i<a.length;i++){
			if(disArray(b,a[i])){
				num++;
			}
		}
		//定义新数组
		int[] newArray=new int[a.length+b.length-num];
		//前半部分 数组赋值
		   for(int i=0;i<a.length;i++){
			   
			   newArray[i]=a[i];
			   
		   }
		   //后半部分赋值
		 int   index=a.length;//
		   for(int j=0;j<b.length;j++){
			   
			   if(!disArray(a,b[j])){
				   newArray[index]=b[j];
				   index++;
				   
			   }
			   
		   }
		   
		   for(int s:newArray){
			   System.out.print(s+"\t");
		   }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Work5 w5=new Work5();
		int [] a={1,2,3,4,5,6};
		int [] b={5,6,7,8,9};
		w5.joinarray(a, b);
	}

}
