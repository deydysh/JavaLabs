package ru.mirea.lab9.task1;

public class UtilsINN {
    public static void checkINN(PurchaseOnline customer) throws ExceptionNumberINN {
        if (customer.getNumberINN() < 100000000000L)
            throw new ExceptionTooShortNumberINN(customer.getNumberINN() + "");
        else if (customer.getNumberINN() < 999999999999L)
            throw new ExceptionTooLongNumberINN(customer.getNumberINN() + "");
        System.out.println("INN: " + customer.getNumberINN() +" accepted!");
    }
}
