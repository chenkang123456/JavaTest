package work;

public class Work2 {

	public static void main(String[] args) {
		int [] sums={1,2,3,4,3,2,1,8};
		boolean b=true;
		for(int i=0;i<sums.length/2;i++){//���������һ��
			if(sums[i]!=sums[sums.length-1-i]){//�ж���β �Ƿ����
				b=false;//˵�����Գ�
			}
		}
		if(b){
			System.out.println("�ǶԳ�");
		}else{
			System.out.println("���ǶԳ�");
		}

	}

}
