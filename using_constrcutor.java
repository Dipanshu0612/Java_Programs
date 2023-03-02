import java.util.Scanner;

public class using_constrcutor {
        int age;
        String name;

        using_constrcutor(int age, String name){
            this.age=age;
            this.name=name;
        }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        using_constrcutor P1= new using_constrcutor(20,"Dipanshu");
        System.out.println(P1.age +" "+ P1.name);    
        Sc.close();
    }
}
