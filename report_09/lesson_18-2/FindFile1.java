// 練習問題18-2: ファイルの文字検索 FindFile1.java
import java.io.*;

public class FindFile1{
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("How to Use : java FindFile1 [Target_String] [Filename]");
            System.out.println("Ex) java FindFile1 System FindFile1.java");
            System.exit(0);
        }
        
        String target = args[0];
        String filename = args[1];  
        int linenum = 0;

        try{
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while((line = reader.readLine()) != null){
                ++linenum;
                if(line.contains(target)){
                    System.out.println(linenum + ": \t " + line);
                }
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}