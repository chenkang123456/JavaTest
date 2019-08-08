package com.throw0808;

public class Test {
	public static void main(String[] args){
		FIFO ff=new FIFO(4);
		try{
			ff.get();
		}catch(QueueEmptyException e){
			System.out.println("不能出队，队列已空!");
			e.printStackTrace();
			try{
				ff.put(4);
				ff.put(4);
				ff.put(4);
				ff.put(4);
				ff.put(4);
				System.out.println(ff.toString());
			}catch(QueueFullException e2){
				System.out.println("不能入队，队列已满!");
				e2.printStackTrace();  
			}
		}finally{
			
		}
		
	}

}
