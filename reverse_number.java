import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        int i,n,r,s=0;
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        n=Sc.nextInt();
        i=n;
        while(n>0){
            r=n%10;
            s=s+r;
            n/=10;

        }
        System.out.print("The sum of "+i+" is : "+s);
        Sc.close();
    }
}
