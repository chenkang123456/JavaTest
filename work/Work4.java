package work;

public class Work4 {
	/**
	 * 
	 * @param oldArray---������
	 * @param index---���뵽���������
	 * @param num---���������
	 * @return
	 */
	public static int[] newArray(int[] oldArray,int index,int num){
		//����������
		int [] newArray=new int[oldArray.length+1];
		 int  oldnum=0;//�����������
		for(int i=0;i<newArray.length;i++){//����������
			if(i!=index){//�������������겻��Ҫ�����λ�� ֱ���þ���������ݸ�ֵ
				newArray[i]=oldArray[oldnum];
				oldnum++;//�����������������һλ
			}
			else{
				newArray[i]=num;//����ǲ����λ�� ��ֱ�Ӳ��� Ҫ���������
			}
		}
		//��������
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
