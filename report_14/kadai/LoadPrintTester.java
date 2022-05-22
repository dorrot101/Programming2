// 課題1: 重み付き無向グラフのクラス LoadPrintTester.java

public class LoadPrintTester{
    public static void main(String[] args) {

        if(args.length != 1){
            System.out.println("How to Use : java LoadPrintTester [filename]");
            System.out.println("Ex) java LoadPrintTester wug_6.txt");
            System.exit(0);
        }

        try{
            WUGraph w = new WUGraph();
            w.loadGraph(args[0]);
            w.printGraph();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}