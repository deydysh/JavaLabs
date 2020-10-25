package ru.mirea.lab6;

public class Student implements Comparable
{
    public int student_id;
    public String last_name;
    public String first_name;
    public int GPA;

    public Student(int student_id, String last_name, String first_name, int GPA)
    {
        this.student_id = student_id;
        this.last_name = last_name;
        this.first_name = first_name;
        this.GPA = GPA;
    }

    public int getGPA() {
        return GPA;
    }

    public int compareTo(Object obj)
    {
        Student tmp = (Student)obj;
        if (this.student_id < tmp.student_id)
        {
            return -1;
        }
        else if(this.student_id >= tmp.student_id)
        {
            return 1;
        }
        return 0;
    }
    public static void insertSorted(Comparable[] list) {
        for (int left = 0; left < list.length; left++) {
            Comparable value = list[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value.compareTo(list[i]) < 0) {
                    list[i + 1] = list[i];
                } else {
                    break;
                }
            }
            list[i + 1] = value;
        }
    }
    public static void main(String[] args)
    {
        Student[] students = new Student[6];
        students[0] = new Student(1,"Иванов","Иван", 4);
        students[1] = new Student(5,"Петров","Алекснадр", 5);
        students[2] = new Student(4,"Сидоров" ,"Артем", 7);
        students[3] = new Student(3,"Кузнецов","Илья", 13);
        students[4] = new Student(6,"Попов","Поп", 10);
        students[5] = new Student(7,"Михайлов" ,"Василий", 1);



        insertSorted(students);

        for(int i = 0; i < students.length; i++)
        {
            System.out.println(students[i].student_id + " " +
                    students[i].last_name + " " + students[i].first_name);
        }
    }
}
