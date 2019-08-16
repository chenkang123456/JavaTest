package class0816;

import org.junit.Test;

import java.io.*;
import java.nio.channels.Channel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class BufferedReaderWriter {

    @Test
    public void testBufferedReader() {
        BufferedReader br=null;
        try {
            br= new BufferedReader(new FileReader("txt1.txt"));
            StringBuffer sb=new StringBuffer();
            String str;
            while ((str=br.readLine())!=null){
                sb.append(str);
            }
        System.out.println(sb.length());
            int sum=0;
            for (int i=0;i<sb.length();i++){
                if (sb.charAt(i)=='三'&&sb.charAt(i+1)=='菱'){
                    sum++;
                }
            }
            System.out.println("三菱"+sum+"个");
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testInputStream() {
        File file1=new File("D:\\");

        File[] listFiles=file1.listFiles();

        for (File file2 : listFiles) {


            if (file2.isDirectory()) {

                System.out.println(file2);

            }else {
                System.out.println();
            }
        
        /*
        if(!file1.exists()) {
            file1.mkdirs();
        }else {
            String[] str = file1.list();
            System.out.println(Arrays.toString(str));
        }*/
/*
        File[] fs1 = file1.listFiles();
        for (File f : fs1) {
            System.out.println(f.getName());
        }
        */
        }
    }
}
