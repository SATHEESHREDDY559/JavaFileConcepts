package main.java;

import java.io.*;

/**
 * Created by Satheesh Reddy on 7/18/2017.
 */
public class FileCopy {



    public  static void main(String... args) throws IOException {
    File srcFile = new File("e:/text.txt");
    File destFile = new File("e:/text1.txt");
    FileInputStream fileInputStream =null;
    FileOutputStream fileOutputStream = null;

    try
    {
        fileInputStream = new FileInputStream(srcFile);
        fileOutputStream = new FileOutputStream(destFile);

    byte[] buffer = new byte[1024];
    int length;
while((length = fileInputStream.read(buffer)) != -1){
    fileOutputStream.write(buffer, 0, length);
}
    }
    catch (FileNotFoundException e){
        e.printStackTrace();

    }
    finally {
        {
            try {
                fileInputStream.close();
                fileOutputStream.close();

            }catch (NullPointerException e){
                e.printStackTrace();

            }
        }
    }
System.out.println("Success");
}
}
