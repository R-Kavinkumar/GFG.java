package com.company;
import java.io.*;

public class ques_1{
    public static void main(String[] args)throws IOException {
        StringBuffer str=new StringBuffer();
        File data = new File("C:\\Users\\kavin kumar\\IdeaProjects\\java1st\\src\\com\\company\\sample1.txt");
        FileInputStream file = new FileInputStream(data);
        FilterInputStream filter = new BufferedInputStream(file);
        int k = 0;
        while ((k = filter.read()) != -1) {
            System.out.print((char) k);
            str.append((char) k);
        }
        OutputStream outputStream = new FileOutputStream("C:\\Users\\kavin kumar\\IdeaProjects\\java1st\\src\\com\\company\\sample2.txt");
        Writer outputStreamWriter = new OutputStreamWriter(outputStream);
        outputStreamWriter.write(String.valueOf(str));
        outputStreamWriter.close();
        file.close();
        filter.close();
    }
}
