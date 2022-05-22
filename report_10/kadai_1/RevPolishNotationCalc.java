// 課題1: 逆ポーランド標記の四則演算器 RevPolishNotationCalc.java

import java.util.*;
import java.io.*;

class RevPolishNotationCalc{
    public static Scanner In = new Scanner(System.in);
    public static LinkedList<Integer> intStack = new LinkedList<Integer>();
    public static void main(String[] args) {
        
        try{
            String Exp = In.nextLine();
            In.close();

            StringTokenizer token = new StringTokenizer(Exp);
    
            while(token.hasMoreTokens() != false){
                char element = token.nextToken().charAt(0);
                calc(element);
            }

            //InvalidEquation Exception
            if(intStack.size() != 1){
                String message = "InvalidEquation: 式が不正: " + Exp;
                throw new Exception(message);
            }
            else System.out.println(Exp + " = " + intStack.removeFirst());
        } 
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void calc(char element) throws Exception{
        if(48 <= element && element <= 57){
            intStack.addFirst(element - 48);
        }
        else if(element == '*' || element == '+' || element == '-' || element == '/'){
            calculate(element);
        }
        //InvalidTerm Exception
        else throw new IllegalArgumentException("InvalidTerm: 項が不正:" + element);
    }

    public static void calculate(char sign) throws Exception {
        if(intStack.size() < 2) throw new Exception("InvalidEquation: 式が不正");

        int a = intStack.removeFirst();
        int b = intStack.removeFirst();
        switch(sign){
            case '*' : 
                intStack.addFirst(a*b);
                break;
            case '+' : 
                intStack.addFirst(a+b);
                break;
            case '-' :
                intStack.addFirst(b-a);
                break;
            case '/' :
                intStack.addFirst(b/a);
                break;
        }
    }
}