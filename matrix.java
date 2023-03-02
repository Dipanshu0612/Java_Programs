// import java.lang.ProcessBuilder.Redirect.Type;
import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b;
        System.out.print("Enter the row size: ");
        a=sc.nextInt();
        System.out.print("Enter the column size: ");
        b=sc.nextInt();
        int[][] arr=new int[a][b];

        System.out.println("Enter the elements of Matrix 1=> ");
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print("Matrix"+"["+i+"]"+"["+j+"]"+":");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Matrix is => ");
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        sc.close();
    }
}
