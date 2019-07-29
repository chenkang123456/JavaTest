package work;

public class Work2 {

	public static void main(String[] args) {
		int [] sums={1,2,3,4,3,2,1,8};
		boolean b=true;
		for(int i=0;i<sums.length/2;i++){//遍历数组的一班
			if(sums[i]!=sums[sums.length-1-i]){//判断收尾 是否相等
				b=false;//说明不对称
			}
		}
		if(b){
			System.out.println("是对称");
		}else{
			System.out.println("不是对称");
		}

	}

}
