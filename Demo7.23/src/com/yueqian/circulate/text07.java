package com.yueqian.circulate;

public class text07 {
	public static void main(String[] args){
     for(int i=18;i<40;i++){//i位男的
    	 for(int j=18;j<=40;j++)  //j为女的
    	 if(i*i+j==1053 && i+j*j==873){
    		 System.out.println("男的年龄"+i+"\t女的年龄"+j);		
    	 }
      }	
   }
}
