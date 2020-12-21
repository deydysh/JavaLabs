package ru.mirea.lab16;

class IllegalTableNumber extends RuntimeException {
    IllegalTableNumber(int numberOfTable){
        super("Can`t find table with number " + numberOfTable + ".");
    }
}