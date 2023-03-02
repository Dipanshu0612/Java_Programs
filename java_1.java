import java.util.Scanner;

public class java_1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.print("Enter the size of array: ");
        n=sc.nextInt();
        // int[] arr=new int[n];
         String[] arr=new String[n];

        //Integer
        // for(int i=0;i<n;i++){
        //     System.out.print("Enter the value:");
        //     arr[i]=sc.nextInt();
        // }

        //String
        for(int i=0;i<n;i++){
            System.out.print("Enter the value:");
            arr[i]=sc.next();
        }

        System.out.println("The array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        sc.close();
    }
}