import java.util.*;

public class count_no_of_1 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n,cnt=0;
        System.out.println();
        System.out.print("Enter the number: ");
        n=Sc.nextInt();

        String s=Integer.toBinaryString(n);
        
        char[] count=s.toCharArray();
        for (char c : count) {
            if(c=='1'){
                cnt++;
            }
        }
            System.out.println();
        System.out.println("The number of 1's in the binary number is "+cnt);
        System.out.println();

        Sc.close();
    }
}
