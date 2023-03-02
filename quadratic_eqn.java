import java.util.*;
import java.io.*;

public class quadratic_eqn {

    Scanner sc= new Scanner(System.in);
    protected double a,b,c;
    protected double D;
    public void getValues(){
        System.out.print("Enter the coefficient for x2: ");
        a=sc.nextInt();
        System.out.print("Enter the coefficient for x: ");
        b=sc.nextInt();
        System.out.print("Enter the value of c: ");
        c=sc.nextInt();
    }
    public void Solver(){
        D=(b*b) - (4*(a*c));
        System.out.println("The value of the discriminant is :"+ D);
        if (D<0){
            System.out.println("This equation has no roots"); 
        }
        else if(D==0){
            double root=(-b)/2*a;
            System.out.println("The root of the equation are : "+root+ " and "+(-root));
        }
        else{
            double root1=( (-b) + Math.pow(D,0.5)) / (2*a);
            double root2=( (-b) - Math.pow(D,0.5)) / (2*a);
            System.out.println("The roots of the equation are : "+root1+" and "+root2);
        }
    }
    public static void main(String[] args)throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        quadratic_eqn obj1=new quadratic_eqn();
        obj1.getValues();
        obj1.Solver();
    }
}
