package test;

import java.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.apache.commons.lang3.StringUtils;

public class StringTest {
    
    public static void write(String path, String content, String encoding)
            throws IOException {
        File file = new File(path);
        file.delete();
        file.createNewFile();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(file), encoding));
        writer.write(content);
        writer.close();
    }
 
    public static String read(String path, String encoding) throws IOException {
        String content = "";
        File file = new File(path);
        file.listFiles();//调试
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(file), encoding));
        String line = null;
        while ((line = reader.readLine()) != null) {
            content += line + "\n";
        }
        reader.close();
        
        return content;
    }
    
    

	public static void main(String[] args) throws IOException {
	    String content = "中文内容 测试5";
        String path = "d:/test/中文测试啊哈哈哈.txt";
        System.out.println(path);
        path = new String(path.getBytes("gbk"),"gbk");
        System.out.println(path);
        String utfPath = new String(path.getBytes("utf-8"),"utf-8");
        System.out.println(utfPath);
//        String encodingw = "gbk";
//        String encodingr = "utf-8";
//        write(path, content, encodingw);
//        System.out.println(read(path, encodingr));
//        String newPath = new String(path.getBytes("gbk"),"gbk");
//        System.out.println(newPath);
//        File file = new File(path);
//        Files dest = new File(newPath);
//        file.renameTo(dest);
//	    String path = "d:/test.txt";
//	    File f = new File(path);
//	    convertFileEncoding(f, "gbk", "utf-8");
//	    System.out.println(read(path, "utf-8"));
	    
//	    String[] ss = {"tom","fd"};
//	    for(int i= 0; i<ss.length; i++){
//	        ss[i] = "key";
//	        
//	    }
//	    System.out.println(ss[0]+"——"+ss[1]);
//	    convertFileEncoding(new File(path), "gbk", "utf-8");
	    
    }
	
	public static File convertFileEncoding(File f,String readEncoding, String writerEncoding) throws IOException{
	    String content = "";
	    BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(f), readEncoding));
        String line = null;
        while ((line = reader.readLine()) != null) {
            content += line + "\n";
        }
        reader.close();
        
        f.delete();
        f.createNewFile();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(f), writerEncoding));
        writer.write(content);
        writer.close();
        return f;
	}
	
}
