package ru.mirea.lab5;

import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Rec {
    private static Scanner in = new Scanner(System.in);

    public static void rec12 () {
        int n = parseInt(in.nextLine());
        if (n % 2 != 0) System.out.println(n);
        if (n!= 0) rec12();
    }

    public static void rec13 () {
        int n = parseInt(in.nextLine());
        if (n != 0) {
            System.out.println(n);
            int m = parseInt(in.nextLine());
            if (m!=0) rec13();
        }
    }

    public static void rec14(int n) {
        if (n != 0) {
            rec14(n/10);
            System.out.println(n % 10);
        }
    }
    public static void rec15(int n) {
        if (n != 0) {
            System.out.println(n % 10);
            rec15(n/10);
        }
    }
    public static int rec17() {
        int n = parseInt(in.nextLine());
        if (n != 0) return Math.max(n, rec17());
        else return 0;
    }
    public static void main(String[] args) {
        //rec12();
        //rec13();
        //rec14(123456789);
        //rec15(123456789);
        System.out.println(rec17());
    }
}
