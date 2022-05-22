// 課題3: ディレクトリの階層表示 ListRecursive.java
import java.io.*;

class ListRecursive{
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("How to Use : java ListRecursive [Directory_name]");
            System.out.println("Ex) java ListRecursive ./");
            System.exit(0);
        }

        String srcDir = args[0];

        printList(0,srcDir);
    }

    public static void printList(int depth, String dirname){

        File dir = new File(dirname);
        
        File[] dirlist = dir.listFiles();
        if(dirlist == null) return;

        for(int i = 0; i<dirlist.length; i++){
            for(int j = 0; j<depth; j++){
                System.out.print("  ");
            }
            if(dirlist[i].isDirectory()) {
                System.out.println(dirlist[i].getName() + "/");            
                printList(depth+1, dirlist[i].toString());
            }
            else{
                System.out.println(dirlist[i].getName());
            }
        }
        
    }
}