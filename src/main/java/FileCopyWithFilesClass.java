package main.java;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Created by Satheesh Reddy on 7/18/2017.
 */
public class FileCopyWithFilesClass {
public static void main(String... arg) throws IOException {

    File srcF= new File("e:/text.txt");
    File destF = new File("e:/text3.txt");
    Files.copy(srcF.toPath(),destF.toPath());
    System.out.println("success");

}
}


