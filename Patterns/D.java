package Patterns;
import java.util.*;
public class D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println();
        
        for(int i=1; i<=n; i++){
            for(int j=2; j<=n; j++){
                if(i==1 && j==n|| i==n && j==n){
                    System.out.print(" ");
                    continue;
                }
                if(j==2 || i==1 || i==n || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
