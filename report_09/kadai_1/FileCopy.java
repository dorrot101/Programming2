// 課題1: ファイルのコピー FileCopy.java

import java.io.*;

class FileCopy{
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("How to Use : java FileCopy [filename1] [filename2]");
            System.out.println("Ex) java FileCopy sample_utf8.txt sample_utf8-copy.txt");
            System.exit(0);
        }

        String srcfile = args[0];
        String dstfile = args[1];

       try{

            File temp = new File(dstfile);
            if(temp.exists()){
                System.out.println("This file exists.");
                System.exit(0);
            }
            
            DataInputStream reader = new DataInputStream(new BufferedInputStream(new FileInputStream(srcfile)));
            DataOutputStream writer = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dstfile)));

            

            if(srcfile.substring(srcfile.length()-4, srcfile.length()) == ".txt"){
                char c = 0;
                Byte bye;

                while(reader.readByte() != -1){
                    for(int i = 1; i>=0; i--){
                        bye = reader.readByte();
                        c += bye<<(8*i);
                    }
                    writer.write(c);
                }
            }
            else{
                int b;

                while((b = reader.read()) != -1){
                    writer.write(b);
                }
            }
            
            reader.close();
            writer.close();
       }
       catch(IOException e){
           System.out.println(e.getMessage());
       }
        
    }
}