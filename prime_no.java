import java.util.Scanner;

public class prime_no {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int i,no,count,n;
        System.out.print("Enter the value of N:");
        n=Sc.nextInt();
        System.out.println("The prime numbers between 1 to"+n+" are: ");
        for(no=1;no<=n;no++){
            count=0;
            for(i=2;i<=no/2;i++){
                if (no%i==0){
                    count++;
                    break;
                }
                
            }
            if (count==0 && no!=1){
                System.out.print(no+" ");
            }
        }
    }
}
