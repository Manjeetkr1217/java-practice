package java8Features.streamAPI.Filter;

import java.util.List;

class Student {
    int id;
    String name;
    String subject;
    int price;

    Student(int id, String name, String subject, int price) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public String getSubject(){
        return subject;
    }

    public int getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return "\nStudent(id=" + id +
                ", name=" + name +  
                ", subject=" + subject + 
                ", price=" + price + ')';
    }

}

public class FilterCode2 {

    public static void main(String[] args) {

        List<Student> studentList = List.of(
                new Student(101, "S1", "Core Java", 3500),
                new Student(102, "S2", "HTML", 1000),
                new Student(103, "S3", "Oracle", 3500),
                new Student(104, "S4", "Core Java", 2500),
                new Student(105, "S5", "HTML", 1000),
                new Student(103, "S6", "Oracle", 3500),
                new Student(104, "S7", "Core Java", 1500),
                new Student(105, "S8", "HTML", 1000));

        // ============1. print all student ================
        System.out.println(studentList);


        System.out.println();

        // ========= 2. Retrieve and print all student============

        studentList.stream()
                .forEach(System.out::println);

        System.out.println();

        // ===============3.  Retrieve and print all student with subject Core Java

        studentList.stream()
                 .filter(student ->  student.getSubject().equalsIgnoreCase("Core Java"))
                .forEach(System.out::println);

        System.out.println();

        // ===============4. Retrieve and print all student with fee paid less than 2000

        studentList.stream()
            .filter(student -> student.getPrice() <= 2000)
            .forEach(System.out::println);

        // ===============4. Retrieve and print all student of core java with fee paid less than 2000

        studentList.stream()
            .filter(student -> student.getSubject().equalsIgnoreCase("Core Java"))
            .filter(student -> student.getPrice() <= 2000)
            .forEach(System.out::println);



            //==================================
            //map

            // retrieve eaxh student and find name

            studentList.stream()
                .map(ele -> ele.getName())
                .forEach(ele -> System.out.print(ele + ", "));

            System.out.println();


            // retrieve name of student who have fee <2000

            studentList.stream()
                .filter(ele -> ele.getPrice() < 2000)
                .map(ele -> ele.getName())
                .forEach(ele -> System.out.print(ele +", "));


    }

}
