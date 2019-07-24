package com.yueqian.zuoye2;

public class text08 {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3 - i; j++) {
				System.out.print(" ");
			}			
			for (int k = 1; k <= 2 * i - 1; k++) {
				if(i==1){
					System.out.print('A');
				}else if(i==2){
					System.out.print('B');
				}else{
					System.out.print('C');
				}
				
			}
			System.out.println();
		}

	}

}
