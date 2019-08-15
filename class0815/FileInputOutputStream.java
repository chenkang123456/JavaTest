package com.throw0809;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import org.junit.Test;
import java.io.DataInputStream;
import java.io.DataOutputStream;
public class FileInputOutputStream {
	@Test
	public void testFileInputStream3(){
		FileInputStream fis=null;
		//File file=new File("hello.text");
		try {
			fis=new FileInputStream("hello.text");
			byte []b=new byte[127];
			int a=0;
			while((a=fis.read(b,0,b.length))!=-1){
				System.out.print(new String(b,0,a));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				fis.close();
			}catch(IOException e){
				e.printStackTrace();
			}
			
		}
		
	}
	@Test
	public void FileInputStream1(){
		FileInputStream fis=null;
		try {
			fis = new FileInputStream("hello.text");
			int b=fis.read();
			System.out.println((char)b);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try{
				fis.close();
			}catch (IOException e){
				e.printStackTrace();
		}
		}
		
	}
	@Test
	public void FileInputSteam(){
	
		//File file=new File("hello.text");
		FileInputStream fis=null;
		try {
			fis = new FileInputStream("hello.text");
			int b=fis.read();

		while(b!=-1){
			System.out.println(b);
			b=fis.read();
		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				fis.close();
			}catch (IOException e){
				e.printStackTrace();
		}
	}
	}
	@Test
    public void DataOutputStream(){
        DataOutputStream fis=null;

        try {
            fis = new DataOutputStream(new FileOutputStream("txt4.txt"));
            fis.writeByte(1);
            fis.writeDouble(12345.3);
            fis.writeInt(12);
            fis.writeUTF("自古多情空余恨，此恨绵绵无绝期.");
            fis.writeChars("路婧");
            fis.flush();
        } catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void DataInputStream(){
        DataInputStream fis=null;
        try {
            fis=new DataInputStream(new FileInputStream("txt4.txt"));
            System.out.println(fis.readByte());
            System.out.println(fis.readDouble());
            System.out.println(fis.readInt());
            System.out.println(fis.readUTF());
            System.out.println(fis.readChar());
        } catch(IOException e){
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
