package com.yueqian.zuoye2;

public class text05 {

	public static void main(String[] args) {		
		int size=4;
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size - i; j++) {
				System.out.print(" ");
			}			
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		for (int i = 1; i <= size-1; i++) {
			for (int j = 1; j <= i; j++){
				System.out.print(" ");
			}			
			for (int k = 2*size-3; k >= 2 * i - 1; k--){
				System.out.print('*');
			}
			System.out.println();
		 }
	       }
}
