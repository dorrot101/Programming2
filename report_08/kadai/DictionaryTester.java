// 課題: 英和・和英辞書アプリの作成 DictionaryTester.java
// 以下に必要な記述を追加せよ
// 以下の記述は例であるため，変更してもよい

import java.util.Scanner;

import javax.naming.directory.SearchResult;

//import org.graalvm.compiler.nodes.ReturnNode;

//import jdk.tools.jaotc.binformat.pecoff.JPECoffRelocObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

class Dictionary{
    private int wordNum = 46725;
	// 辞書に含まれる行数

    // 他に課題で必要なフィールドを追加すること
	private String[] EngWordset = new String[46725];
	private String[] JpnWordset = new String[46725];
	private String[] TempStrings;

    

    public Dictionary(String filename){
	// 講義資料に記載されているものと同じである．
	// 適宜記述を追加すること
	try{
	    Scanner scan = new Scanner(new File(filename));
	    for (int i=0;i<wordNum;i++){
		if (!scan.hasNextLine()){
		    // 次の行が読み込めない場合の処理
		    // 辞書ファイルが想定よりも短い場合に実行
		    // 通常は実行されない
		    break;
		}
		String line = scan.nextLine();
		// line には1行全ての文字が含まれるため
		// 英単語と和訳に適切に分割して格納すること
		// 以下に記述を追加

		TempStrings = line.split("\t");
		EngWordset[i] = TempStrings[0];
		JpnWordset[i] = TempStrings[1];
	}
	
	System.out.println("Dictionary has been loaded");
	    
	}catch(java.io.FileNotFoundException e){
	    System.out.println(e);
	    System.exit(0);
	}
    }

	// 以下に Dictionary クラスで指定されたメソッドを追加すること

	public String searchEWord(String s){

		for(int i = 0; i!=wordNum; i++){
			if(EngWordset[i].equals(s)) {
				String eng = EngWordset[i];
				return eng + JpnWordset[i];
			}
		}
		return null;
	}

	
	public String searchREWord(String s){

		for(int i = 0; i!=wordNum; i++){
			int length = EngWordset[i].length();
			//if(s.contains(EngWordset[i]) && s.startsWith(EngWordset[i],0) && s.charAt(length-1) == EngWordset[i].charAt(length-1)) {
			if(s.indexOf(EngWordset[i]) == 0){
				String eng = EngWordset[i];
				eng += "-" + s.substring(EngWordset[i].length(),s.length());
				return eng + JpnWordset[i];
			}
		}
		return null;
	}
	

	public String searchJWord(String s){
		String result = "";

		for(int i = 0; i!=wordNum; i++){
			if(JpnWordset[i].indexOf(s) != -1){
				result = result + EngWordset[i]  + JpnWordset[i] + "\n";
			} 
		}
		if(result.length()>0) return result;
		else return null;
	}
	
    
}

public class DictionaryTester{
    public static void main(String[] args){
		Scanner In = new Scanner(System.in);

		File target = new File("ejdic-hand-utf8.txt");
		Dictionary dict = new Dictionary(target.getPath());
		
		System.out.print("Enter the English Word : ");
		String input = In.nextLine();
		System.out.println(dict.searchEWord(input));

		System.out.print("Enter the Japanese Word : ");
		input = In.nextLine();
		System.out.print(dict.searchJWord(input));

		System.out.print("Enter the English(trans) Word : ");
		input = In.nextLine();
		System.out.println(dict.searchREWord(input));	
    }
}
