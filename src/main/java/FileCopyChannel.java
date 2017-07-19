package main.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/**
 * Created by Satheesh Reddy on 7/18/2017.
 */
public class FileCopyChannel {
    public static void main(String... args){
        File srcf= new File("e:/text.txt");
        File destf = new File(("e:/text4.txt"));
        FileChannel src =null;
        FileChannel dest = null;
        try{
            src = new FileInputStream(srcf).getChannel();
            dest = new FileOutputStream(destf).getChannel();
            dest.transferFrom(src,0,src.size());
            //src.transferTo(0,src.size(),dest);

        }catch (Exception e){

        }

    }

}
