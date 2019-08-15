package class0815;

import org.junit.Test;

import java.io.*;
import java.util.Date;

public class PutStream {
    @Test
    public void FileInputStream() {

        FileInputStream fis=null;
        try {
            fis=new FileInputStream("txt1.txt");
            byte[] b=new byte[127];
            int a=0;
            while ((a=fis.read(b, 0, b.length)) != -1) {
                System.out.print(new String(b, 0, a));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
    @Test
    public void FileInputStream2(){
        FileInputStream fis=null;
        try {
            fis=new FileInputStream("txt1.txt");
            int b=fis.read();
            while(b!=-1){
                System.out.println(b);
                b=fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                fis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    @Test
    public void FileOutputStream(){
        FileOutputStream fis=null;
        try {
            fis =new FileOutputStream("txt2.txt",true);
            byte a[]={39,43,54,65,67,89,90};
            fis.write(a,1,4);
            String str="自古多情空余恨，此恨绵绵无绝期。";
            fis.write(str.getBytes());
            fis.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    @Test
    public void FileInputStream3(){
        FileInputStream fis=null;
        try {
            fis = new FileInputStream("txt2.txt");
            byte [] b=new byte[127];
            int a=0;
            while ((a=fis.read(b,0,b.length))!=-1){
                System.out.print(new String(b,0,a));
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
    @Test
    public void FileInputStream4(){
        FileInputStream fis=null;
        FileInputStream fis1=null;
        try{
            fis=new FileInputStream("txt2.txt");
            fis1=new FileInputStream("txt3.txt");
            byte[] b=new byte[127];
            byte[] b1=new byte[127];
            int a=-1;
            int a1=-1;
            while((a=fis.read(b,0,b.length))!=-1){
                System.out.print(new String(b,0,a));
            }
            while((a=fis.read())!=-1 & (a1=fis1.read())!=-1 ){
                if (a!=a1){
                    System.out.println("false1");
                }
            }
            if (a!=a1){
                System.out.println("false2");
            }else{
                System.out.println("true");
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fis.close();
                fis1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void FileOutputStream2() {
        FileOutputStream fis=null;
        try {
            fis=new FileOutputStream("txt3.txt", true);
            String str="天行健，君子以自强不息;地势坤，君子以厚德载物。";
            fis.write(str.getBytes());
            fis.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
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