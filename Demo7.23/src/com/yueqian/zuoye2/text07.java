package com.yueqian.zuoye2;

public class text07 {

	public static void main(String[] args) {
		String str1="A";
		String str2="B";
		String str3="C";
		String str4=" ";
		int row=3;
		int col=5;
		for(int i=1;i<=row;i++){
		for(int j=1;j<=col;j++){
			if(i==1&&j!=3){
				System.out.print(str4);
			}
		    else if(i==1&&j==3){
				System.out.print(str1);
			}else if(i==2&&(j==2||j==3||j==4)){
				System.out.print(str2);
			}else if(i==2&&(j==1||j==5)){
				System.out.print(str4);
			}else{
				System.out.print(str3);
			}
		}
			  System.out.println(" ");
		}

	}
}
