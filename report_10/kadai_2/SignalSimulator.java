// 課題2: 信号待ちシミュレータ SignalSimulator.java

import java.util.*;
import java.io.*;

public class SignalSimulator{

    // LoopRange
    public static final int TIME = 10000;
    // true == Green false == Red
    public static boolean SIGNAL = false;


    public static Queue<Car> cars = new LinkedList<Car>();



    public static void main(String[] args) {
        
        if(args.length != 2){
            System.out.println("How to Use : java SignalSimulator [sigFreq] [carFreq]");
            System.out.println("Ex) java SignalSimulator 5 3");
            System.exit(0);
        }

        // Initialize each of Frequency
        int sigFreq = Integer.parseInt(args[0]);
        int carFreq  = Integer.parseInt(args[1]);

        // Sum of Passed Cars Number
        double passedCars_Sum = 0;
        // Sum of Waiting Time
        double waitingTime_Sum = 0;
        
         //Loop (1step = 1second)
        for(int step = 1; step<=TIME; step++){

            if(step%carFreq == 0) {
                cars.add(new Car(step));
            }

            if(SIGNAL == true && cars.isEmpty() == false){
                int T_waitingTime = cars.remove().getStep();
                ++passedCars_Sum;
                waitingTime_Sum += (step - T_waitingTime);
            }   

            if(step%sigFreq == 0) SIGNAL = !SIGNAL;
        }
             // Print the Average of passedCars for unit time
             System.out.println("The Average of PassedCars is : " + passedCars_Sum/TIME);
            // Print the Average of waitingTime divided into passedCars_Sum
            System.out.println("The Average of waitingTime is : " + waitingTime_Sum/passedCars_Sum);
       
    }
}

class Car{
    private int currentStep;
    Car(int currentStep){this.currentStep = currentStep;}

    public int getStep() {return this.currentStep;}
};