package ru.mirea.lab9.task2;

public interface IStudent {
    void quickSort(Student[] arr, int left, int right);
    Student search(Student[] arr, String name) throws StudentNotFoundException;
}