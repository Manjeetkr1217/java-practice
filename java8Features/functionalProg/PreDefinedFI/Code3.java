package java8Features.functionalProg.PreDefinedFI;
import java.util.function.Supplier;
// Develop a LE to return 5 student object

class Student{
    int roll;
    String name;
    String course;
    int fee;

    Student(int roll, String name, String course, int fee){
        this.roll =roll;
        this.name = name;
        this.course =  course;
        this.fee = fee;
    }
}

public class Code3 {

    public static void main(String[] args) {

        Supplier<Student[]> studentSuplier = () -> {
            return new Student[] {
                new Student(101, "S1", "CJ", 3500),
                new Student(102, "S2", "Oracle", 2500),
                new Student(103, "S3", "HTML", 4500),
                new Student(104, "S4", "AJ", 5500)
            };
        };

        Student[] students = studentSuplier.get();

        for(Student student : students ){
            System.out.println(student);
        }


        
    }
    
}
