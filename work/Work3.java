package work;

public class Work3 {
/**
 * 
 * @param oldArray---������
 * @param index---Ҫɾ�����������
 * @return
 */
	public int[] newArray(int[] oldArray,int index){
		int [] newArray=new int[oldArray.length-1];//����������
		int num=0;//���������������
		for(int i=0;i<oldArray.length;i++){//����������
			if(i!=index){//�������Ҫɾ��������  ֱ�Ӹ������鸳ֵ ������++
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
