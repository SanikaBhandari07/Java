package Patterns;
import java.util.*;
public class P {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int mid = (n+1)/2;
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j==mid ||
                    j>mid && (i==1 || i== mid) ||
                    i<=mid && j==n
                ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print("\n");
        }
        sc.close();
    }
}
