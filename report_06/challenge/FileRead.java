// チャレンジ課題: しりとりアプリ FileRead.java
// ファイルを読み込むサンプルプログラム
import java.util.Scanner;
import java.io.*;

public class FileRead {

    public static void main( String[] args){
	
	int maxWordNum = 187366;
	String filename = "worddict.txt";
	String kanji[] = new String[maxWordNum];
	String kana[] = new String[maxWordNum];
	int num = 0;

	Scanner scanner;
	try{
        	scanner = new Scanner(new File(filename), "utf-8");
		//		while (scanner.hasNextLine()) {
		while (scanner.hasNext()) {		
		    String line = scanner.nextLine();
		    String elem[] = line.split(" ", 0);
		    kanji[num] = elem[0];
		    kana[num] = elem[1];
		    num++;
		}
		scanner.close();
	}
	catch ( ??? ){
	    System.out.println( e);
	}
	System.out.println( num + "読み取りました");
    }
}
