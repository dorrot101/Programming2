// 課題1: テキストファイルの文字列変換  TextToUpper.java

import java.util.Scanner;
import java.io.*;

class TextToUpper{
    static void readAndConvert(String filename) throws FileNotFoundException{
                Scanner scanner = new Scanner(new File(filename));
                while(scanner.hasNextLine()){
                    String line = scanner.nextLine();
                    System.out.println(line.toUpperCase());
                }
                scanner.close();
    }
}