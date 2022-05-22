// 演習問題1: 文字コードの表示 PrintCode.java

public class PrintCode{
    public static void main(String[] args) {

        if(args.length == 0) System.out.println("Enter like Java PrintCode String1 String2....");
        else{
            for (String string : args) {
                System.out.println("java PrintCode " + string);
                for(int i = 0; i<string.length(); i++){
                    System.out.printf("%c : %d%n", string.charAt(i), string.charAt(i)-0);
                }
                for(int i = 0; i<string.length(); i++){
                    System.out.printf("%c : 0x%04X%n", string.charAt(i), string.charAt(i)-0);
                }
            }
        }
    }
}