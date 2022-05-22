// 練習問題18-3 素数表の作成 Prime1.java
import java.io.*;

class Prime1{
    public static final int range = 1001;
    public static boolean[] arr = new boolean[range];

    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("How to Use : java Prime1 [filename]");
            System.out.println("Ex) java Prime1 prime.txt");
            System.exit(0);
        }
        
        String filename = args[0];

        try{
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
            
            initialize_PrimeNumArray();
            check_PrimeNum();

            for(int i = 0; i<range; i++){
                if(arr[i] == true) writer.println(i);
            }

            writer.close();

        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch(EOFException e){
            System.out.println(e.getMessage());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void check_PrimeNum(){

        for(int i = 2; i<range; i++){
            if(arr[i] == false) continue;
            for(int j = i+i; j<range; j += i){
                arr[j] = false;
            }
        }
    }

    //initialize the array
    public static void initialize_PrimeNumArray(){
        //0&1 are not Prime Number
        for(int i = 2; i<range; i++){
            arr[i] = true;
        }
    }
}