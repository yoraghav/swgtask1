import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Student a = new Student();
        Student b = new Student();
        System.out.println("hello world!!");
        System.out.println("enter name : ");
        a.name=s.next();
        System.out.println("enter roll number : ");
        a.rollnumber=s.next();
        System.out.println("enter marks : ");
        a.marks=s.nextInt();
        System.out.println("enter attendance : ");
        a.attendance=s.nextInt();
        System.out.println("enter name : ");
        b.name=s.next();
        System.out.println("enter roll number : ");
        b.rollnumber=s.next();
        System.out.println("enter marks : ");
        b.marks=s.nextInt();
        System.out.println("enter attendance : ");
        b.attendance=s.nextInt();
        a.printdata();
        b.printdata();
    }
}

class Student{
    String name,rollnumber;
    int marks,attendance;
    public Student(){
        System.out.println("done");
    }
    void printdata(){
        if(marks<0){
            marks=0;
        }
        if(attendance>75){
            double k = marks;
            marks = (int)(k * (1.1));
        }
        if(marks>100){
            marks=100;
        }
        System.out.println(name+" "+rollnumber+" "+marks+" "+attendance);
    }
}