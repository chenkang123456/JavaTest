package QuickSort;

public class QuickSort {
	public void quickSort(int[] a,int head,int tail){
		int[] arr=new int[tail-head+1];
		//确定比较值
		int compareVal=a[head];
		//计算大小的个数
		int lt=0;                              
		int gb=0;
		int compareindex;
		for(int i=head+1;i<=tail;i++){
				if(a[i]<=compareVal){
					lt++;
				}else{
					gb++;
				}
		}
		compareindex=lt;
		int ltindex=0;		
		int gqindex=compareindex+1;
		for(int i=head+1;i<=tail;i++){
			if(a[i]<=compareVal){
				arr[ltindex++]=a[i];
			}else{
				arr[gqindex++]=a[i];
			}
		}
		arr[compareindex]=compareVal; 
		 //将临时数组中的数据 回放 数组a中
		 int tempIndex=0;
		 for(int j=head;j<=tail;j++){
			 a[j]=arr[tempIndex++];
		 }
		//循环左边
		int lhead=head;
		int ltail=head+compareindex-1;
		if(ltail-lhead>=1){
			quickSort(a,lhead,ltail);
		}
		//循环右边
		int rhead=head+compareindex+1;
		int rtail=tail;
		if(rtail-rhead>=1){
			quickSort(a,rhead,rtail);
		}
	}
}
