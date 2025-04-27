package Patterns;
import java.util.*;
public class A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=(n-i); j>=1; j--){
                System.out.print(" ");
            }
            System.out.print("*");
            if(i!=1){
                for(int j=1; j<=((i-1)*2)-1 ; j++){
                    if(i==(n+1)/2){
                        System.out.print("*");
                    }
                    else{
    
                        System.out.print(" ");
                    }
                }
                System.out.print("*");
            }
            for(int j=1; j<=(n-i);j++){
                System.out.print(" ");
            }
    
            System.out.println();
        }

        sc.close();
    }
}
