import java.util.*;

interface Calculator{
    Scanner sc = new Scanner(System.in);
    void addition();
    void substraction();
    void multiplication();
    void division();
}
class Kid1 implements Calculator{
    public void addition(){
        System.out.print("Enter the first value: ");
        int a=sc.nextInt();
        System.out.print("Enter the second value: ");
        int b=sc.nextInt();
        System.out.println(a+b);
        
    }
    public void substraction(){

    }
    public void multiplication(){

    }
    public void division(){

    }
}

public class Interface {
    public static void main(String[] args) {
        
    }
}
