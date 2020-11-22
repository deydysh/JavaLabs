package ru.mirea.lab9.task1;

public class TestPurchaseOnline {
    public static void main(String[] args) {
        PurchaseOnline customer = new PurchaseOnline("Gleb", 11111);
        try {
            UtilsINN.checkINN(customer);
        }
        catch (ExceptionNumberINN ex) {
            System.out.println("Wrong INN number");
            System.out.println(ex.getMessage());
        }
    }
}
