package ru.mirea.lab10.task2;

import java.util.Scanner;

public class Client {
    public Chair chair;
    public void sit() {
        if(chair instanceof MagicChair) {
            System.out.println("Sitting on MagicChair");
            ((MagicChair) chair).doMagic();
        }
        else if(chair instanceof VictorianChair) {
            System.out.println("Sitting on VictorianChair");
            System.out.println(((VictorianChair) chair));
        }
        else if(chair instanceof FunctionalChair) {
            System.out.println("Sitting on FunctionalChair");
            int a = 0; int b = 0;
            Scanner in = new Scanner(System.in);
            System.out.println("Input two integers");
            a = in.nextInt();
            b = in.nextInt();
            System.out.println("Sum: " + ((FunctionalChair) chair).sum(a, b));
        }
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
