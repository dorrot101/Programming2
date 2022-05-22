import java.io.File;
import java.io.FileNotFoundException;

// 課題1: テキストファイルの文字列変換  TextToUpperTester.java

public class TextToUpperTester{
    public static void main(String[] args) {
        try{
            File dir = new File("foobar.txt");
            TextToUpper.readAndConvert(dir.getPath());
        } catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}