package com.yueqian.Tree0731;

public class TestTree {
	public static void main(String[] args) {
		Tree bt=new Tree(7);
		int[] arr={7,4,13,3,15,15,18,9};
		for(int i=1;i<arr.length;i++){
			bt.addTree(arr[i]);
		}
		String s=bt.show();
		System.out.println(s);
	}
}
