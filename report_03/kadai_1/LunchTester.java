// 課題1: カレー店のランチクラス LunchTester.java
import java.util.Scanner;

public class LunchTester{
    public static void main(String[] args){
        int curry, topping, salad;
        char next;
        Scanner In = new Scanner(System.in);
        LunchA[] orderset = new LunchA[3];

        String[] Curry = new String[] {"Bean Curry", "Chicken Curry", "Seafood Curry"};
        String[] Topping = new String[] {"Soft-boiled Egg", "Pickle", "Sausage"};
        String[] Salad = new String[] {"Vegetable Salad", "Potato Salad", "Tuna Salad"};   

        int[] Curryprice = new int[] {600, 700, 750};
        int[] Toppingprice = new int[] {100, 150, 200};
        int[] Saladprice = new int[] {200, 300, 350};
        // Select Curry
        for(int i = 0; i<orderset.length; i++){
            System.out.println('\n' + "Order Num" + (i+1));
            System.out.println(">>Select Curry");
            System.out.println("[Curry Menu]");
            for(int j = 0; j<3; j++){
                System.out.println("Num" + j + " : " + Curry[j] + "(" + Curryprice[j] + "円" + ")");            }
            do{
                System.out.print("Enter the number 0 to 2 : ");
                curry = In.nextInt();
            }while(0 > curry || curry > 2); 
            do{
                System.out.print("If you want Topping, enter 'y'. If you don't want topping, enter 'n' : ");
                next = In.next().charAt(0);
            }while(next != 'y' && next != 'n');

            // If entered 'y', select Topping
            if(next == 'y'){
                System.out.println(">>Select Topping");
                System.out.println("[Topping Menu]");
                for(int j = 0; j<3; j++){
                System.out.println("Num" + j + " : " + Topping[j] + "(" + Toppingprice[j] + "円" + ")");
                }
                System.out.print("Enter the number :");
                do{
                    System.out.print("Enter the number 0 to 2 : ");
                    topping = In.nextInt();
                }while(0 > topping || topping > 2);

                do{
                    System.out.print("If you want Topping, enter 'y'. If you don't want topping, enter 'n' : ");
                    next = In.next().charAt(0);
                }while(next != 'y' && next != 'n');
                // If selected Topping and entered 'y', select Salad
                    if(next == 'y'){
                    System.out.println(">>Select Salad");
                    System.out.println("[Salad Menu]");
                    for(int j = 0; j<3; j++){
                    System.out.println("Num" + j + " : " + Salad[j] + "(" + Saladprice[j] + "円" + ")");
                }
                System.out.print("Enter the number :");
                do{
                    System.out.print("Enter the number 0 to 2 : ");
                    salad = In.nextInt();
                }while(0 > salad || salad > 2);

                orderset[i] = new LunchC(Curry[curry], Curryprice[curry], Topping[topping], Toppingprice[topping], Salad[salad], Saladprice[salad]);

                } else orderset[i] = new LunchB(Curry[curry], Curryprice[curry], Topping[topping], Toppingprice[topping]);

            }else orderset[i] = new LunchA(Curry[curry], Curryprice[curry]);
        }

        for(int i = 0; i<orderset.length; i++){
            System.out.println("---------------");
            orderset[i].print();
        }
    }
    
}
