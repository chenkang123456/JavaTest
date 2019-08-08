package com.throw0808;

public class QueueFullException extends Exception{
	String message;
	public QueueFullException(String Message){
		message=Message;		
	}
	
	public static void main(String[] args)throws QueueFullException{
		FIFO ff=new FIFO(4);
		ff.put(2);
		ff.put(3);
		ff.put(4);
		ff.put(5);
		ff.put(2);
		System.out.println(ff.toString());

		
		
		
		
	}

}
