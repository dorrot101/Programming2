//import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;

// 練習19-3: myStringArrayListの作成 MyStringArrayList.java

class MyStringArrayList{
    private int INITIAL_CAPACITY;
    private String[] ar;
    private static int TAILPOINTER = 0;

    MyStringArrayList(){
        this.INITIAL_CAPACITY = 1;
        ar = new String[INITIAL_CAPACITY];
    }

    MyStringArrayList(int INITIAL_CAPACITY){
        this.INITIAL_CAPACITY = INITIAL_CAPACITY;
        ar = new String[INITIAL_CAPACITY];
    }

    public void add(String arg){
        if(TAILPOINTER == ar.length){
            String[] temp = new String[ar.length * 2];
            for(int i = 0; i<ar.length; i++){
                temp[i] = ar[i];
            }
            ar = temp;
        }
        
        ar[TAILPOINTER] = arg;
        ++TAILPOINTER;
    }

    public String get(int index) throws IndexOutOfBoundsException{
        if(index >= ar.length || index < 0) throw new IndexOutOfBoundsException("Index is out of range for array.");
        return ar[index];
    }

    public int size(){
        return ar.length;
    }
}

public class MyStringArrayListTester{
    public static void main(String[] args) {
        try{
            MyStringArrayList MSAL = new MyStringArrayList(3);
            MSAL.add("item1");
            MSAL.add("item2");
            MSAL.add("item3");

            System.out.println("Add item1, item2, item3 to MSAL by ar.add()");
            System.out.println("ar.size() -> " + MSAL.size());
            for(int i = 0; i<MSAL.size(); i++){
                System.out.println("ar.get(" + i + ") -> " + MSAL.get(i));
            }

            MSAL.add("item4");
            MSAL.add("item5");
            MSAL.add("item6");
            MSAL.add("item7");

            System.out.println("\nAdd item4, item5, item6, item7 to MSAL by ar.add()");
            System.out.println("ar.size() -> " + MSAL.size());
            for(int i = 0; i<MSAL.size(); i++){
                System.out.println("ar.get(" + i + ") -> " + MSAL.get(i));
            }

            System.out.println("\nReference array element out of range -> MSAL.get(10)");
            System.out.println(MSAL.get(10));
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}