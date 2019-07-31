package com.yueqian.Tree0731;

public class Tree {
	int val;
	//定义左树
	private Tree lTree;
	//定义右树
	private Tree rTree;
	//构造器
	public Tree(int val){
		this.val=val;
	}
	
	//添加数组
	public void addTree(int val){
		if(val<=this.val){
			if(lTree==null){
				Tree tree=new Tree(val);
				lTree=tree;
			}else{
				lTree.addTree(val);
			}
		}else{
			if(rTree==null){
				Tree tree=new Tree(val);
				rTree=tree;
			}else{
				rTree.addTree(val);
			}
		}
	}
	public String show(){
		StringBuffer sbuff=new StringBuffer();
		appendString(sbuff);
		return sbuff.toString();
	}
	private void appendString(StringBuffer subff){
		if(lTree!=null){
			lTree.appendString(subff);
		}
		//自己
		subff.append(this.val+",");
		//右
		if(rTree!=null){
			rTree.appendString(subff);
		}
	}
}