import java.util.*;

class Student{
    Scanner sc=new Scanner(System.in);
    String name;
    int stud_div;
    int stud_no,sub1,sub2,sub3,sub4,sub5;
    public void Stud_Det(){
        System.out.print("Enter the name of the student: ");
        name=sc.nextLine();
        System.out.print("Enter the student number: ");
        stud_no=sc.nextInt();
        System.out.print("Enter the student division: ");
        stud_div=sc.nextInt();
    }

    public void Stud_Marks(){
        System.out.print("Enter the marks of DAA: ");
        sub1=sc.nextInt();
        System.out.print("Enter the marks of Java: ");
        sub2=sc.nextInt();
        System.out.print("Enter the marks of Maths: ");
        sub3=sc.nextInt();
        System.out.print("Enter the marks of CN: ");
        sub4=sc.nextInt();
        System.out.print("Enter the marks of OS: ");
        sub5=sc.nextInt();
    }

    public void display_info(){
        System.out.println("The marks of "+name+"studying in "+stud_div+" with enr number "+stud_no+" are:-");
        System.out.println("Marks in DAA: "+sub1);
        System.out.println("Marks in Java: "+sub2);
        System.out.println("Marks in Maths: "+sub3);
        System.out.println("Marks in CN: "+sub4);
        System.out.println("Marks in OS: "+sub5);
    }
}
public class hello {
    
    public static void main(String[] args) {
         Student s1=new Student();
         s1.Stud_Det();
         s1.Stud_Marks();
         s1.display_info();
}
}
