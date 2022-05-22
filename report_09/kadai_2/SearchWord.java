// 課題2: ファイルの文字列検索 SearchWord.java

import java.io.*;
import java.nio.Buffer;
import java.util.StringTokenizer;

class SearchWord{
    public static void main(String[] args) {

        if(args.length != 2){
            System.out.println("How to Use : java SearchWord [filename] [Target_String]");
            System.out.println("Ex) java SearchWord java.txt Java");
            System.exit(0);
        }

        String srcFile = args[0];
        String objWord = args[1];

        try{
            BufferedReader reader = new BufferedReader(new FileReader(srcFile));     
            String s;
            int index = 0;

            while((s = reader.readLine()) != null){

                StringTokenizer str = new StringTokenizer(s);
                String[] TokenArray = new String[str.countTokens()];
                
                for(int i = 0; i<TokenArray.length; i++){
                    TokenArray[i] = str.nextToken();
                }

                for(int i = 0; i<TokenArray.length; i++){
                    if(TokenArray[i].indexOf(objWord) != -1 && i == 0){
                        System.out.println(index + " " + TokenArray[i] + " " +  TokenArray[i+1] + " " + TokenArray[i+2]);
                    }
                    else if(TokenArray[i].indexOf(objWord) != -1 && i == 1){
                        System.out.println(index + " " + TokenArray[i-1] + " " + TokenArray[i] + " " +  TokenArray[i+1] + " " + TokenArray[i+2]);
                    }
                    else if(TokenArray[i].indexOf(objWord) != -1 && i == TokenArray.length-2){
                        System.out.println(index + " " + TokenArray[i-3] + " " + TokenArray[i-2]+ " " + TokenArray[i] + " " +  TokenArray[i+1]);
                    }
                    else if(TokenArray[i].indexOf(objWord) != -1 && i == TokenArray.length-1){
                        System.out.println(index + " " + TokenArray[i-2] + " " +  TokenArray[i-1] + " " +  TokenArray[i]);
                    }
                    else if(TokenArray[i].indexOf(objWord) != -1){
                        System.out.println(index + " " + TokenArray[i-2] + " "  + TokenArray[i-1] + " " + TokenArray[i] + " " +  TokenArray[i+1] + " " + TokenArray[i+2]);
                    } 
                    
                    index += TokenArray[i].length()+1;
                }
            }
            reader.close();
        }
        catch(EOFException e){
            System.out.println(e.getMessage());
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}