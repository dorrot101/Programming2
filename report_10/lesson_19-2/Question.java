// 練習問題19-2: ArrayListの操作 Question.java

import java.util.*;
import java.io.*;

public class Question{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> listRev = new ArrayList<String>();
        
        list.add("Alice");
        list.add("Bob");
        list.add("Chris");
        list.add(1234);

        list.add("Diana");
        list.add("Elen");

        for(int i = list.size()-1; i>=0; i--){
            listRev.add(list.get(i));
        }

        /* 
        System.out.println(list.get(2));

        System.out.println(list.size());
        */

        System.out.println("Elements of list");
        for(String name : list){
            System.out.println(name);
        }
        
        System.out.println("\nElements of listRev");
        for(String name : listRev){
            System.out.println(name);
        }
    }
}

