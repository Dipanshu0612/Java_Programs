import java.util.*;

public class even_odd {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int i,n,cnt1=0,cnt2=0;
        System.out.print("Enter the value of N : ");
        n=Sc.nextInt();
        Sc.close();
        int[] arr1= new int[n/2];
        int[] arr2= new int[n/2];
        for(i=1;i<=n;i++){
            if (i%2==0){
                arr1[cnt1]=i;
                cnt1++;
            }
            else{
                arr2[cnt2]=i;
                cnt2++;
            }
        }
        System.out.println();
        System.out.print("The even numbers in the range of 1 to "+n+" are: ");
        for (int j : arr1) {
            System.out.print(j+" ");
        }
        System.out.println();
        System.out.print("The odd numbers in the range of 1 to "+n+" are: ");
        for (int v : arr2) {
            System.out.print(v+" ");
        }
        System.out.println();
        System.out.println();
    }
}
