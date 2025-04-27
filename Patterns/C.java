package Patterns;
import java.util.*;
public class C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println();
        
        for(int i=1; i<=n; i++){
            for(int j=2; j<=n; j++){
                if(j==2 || i==1 || i==n){
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
