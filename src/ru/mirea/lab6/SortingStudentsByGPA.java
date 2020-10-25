package ru.mirea.lab6;

import java.util.Arrays;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student>{
    public int compare(Student a, Student b) {
        if (a.GPA > b.GPA) return -1;
        if (a.GPA < b.GPA) return 1;
        return 0;
    }
    public static void quickSort(Student[] array, int low, int high) {
        SortingStudentsByGPA en = new SortingStudentsByGPA();
        if (array.length == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        Student opora = array[middle];

        int i = low, j = high;
        while (i <= j) {

            while (en.compare(array[i], opora) < 0) {
                i++;
            }

            while (en.compare(array[j], opora) > 0) {
                j--;
            }
            if (i <= j) {
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
    public static Student[] mergesort(Student[] array1) {

        Student[] buffer1 = Arrays.copyOf(array1, array1.length);
        Student[] buffer2 = new Student[array1.length];

        Student[] result = mergesortInner(buffer1, buffer2, 0, array1.length);
        return result;
    }

    public static Student[] mergesortInner(Student[] buffer1, Student[] buffer2,
                                           int startIndex, int endIndex) {
        SortingStudentsByGPA en = new SortingStudentsByGPA();
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        Student[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
        Student[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        Student[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            if (en.compare(sorted1[index1], sorted2[index2]) > 0)
                result[destIndex++] = sorted1[index1++]; else result[destIndex++] = sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
    public static void main(String[] args)
    {
        Student[] students = new Student[6];
        Student[] students2 = new Student[4];
        students[0] = new Student(1,"Иванов","Иван", 4);
        students[1] = new Student(5,"Петров","Алекснадр", 5);
        students[2] = new Student(4,"Сидоров" ,"Артем", 7);
        students[3] = new Student(3,"Кузнецов","Илья", 13);
        students[4] = new Student(6,"Попов","Поп", 10);
        students[5] = new Student(7,"Михайлов" ,"Василий", 1);


        students2[0] = new Student(1,"Соколов","Андрей", 2);
        students2[1] = new Student(5,"Пучков","Дмитрий", 28);
        students2[2] = new Student(4,"Жуков" ,"Клим", 4);
        students2[3] = new Student(3,"Дэйдыш","Илья", 29);

        quickSort(students, 0, 5);

        for(int i = 0; i < students.length; i++)
        {
            System.out.println(students[i].GPA + " " +
                    students[i].last_name + " " + students[i].first_name);
        }
        System.out.println("--------------");
        Student[] result = mergesort(students2);
        for(int i = 0; i < result.length; i++)
        {
            System.out.println(result[i].GPA + " " +
                    result[i].last_name + " " + result[i].first_name);
        }
    }
}
