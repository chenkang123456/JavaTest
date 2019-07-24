package com.yueqian.circulate;

public class text06 {

	public static void main(String[] args) {	
		for(int i=0;i<=20;i++){
			int sum=0;
			for(int j=0;j<=20-i;j++){
				if(20*i+5*j+(20-i-j)==100){
				sum=sum+1;
				System.out.println("20元的有:"+i+"\t5元的有:"+j+"\t1元的有:"+(20-i-j));
				System.out.println(sum);	
			}
			
	     }
	  }
   }
}
