package com.throw0808;

public class QueueEmptyException extends Exception{
	String message;
	public QueueEmptyException(String Message){
		message=Message;		
	}
	public static void main(String[] args)throws QueueEmptyException{
		FIFO ff=new FIFO(4);
		ff.get();
		
	}

}
