package com.vitiya.java.lecture7;

import java.io.*;

public class FileHandling {

    public static void main(String[] args) throws IOException {
        File newDir = new File("./NewTextFile.txt"); // create new file
        System.out.println(newDir.getAbsolutePath()); //get the absolute path of the file
        System.out.println(newDir.getPath()); //get the path of the file

        FileOutputStream reader = new FileOutputStream("TextFile.txt");
        reader.write(201911257);
        reader.close();

        FileInputStream writer = new FileInputStream("TextFile.txt");
        System.out.println(writer.read());
        writer.close();
    }
}
