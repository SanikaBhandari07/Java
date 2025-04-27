package Patterns;

import java.util.Scanner;

public class U {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println();


        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j==1 || j==n){
                    System.out.print(" ");
                }
                else{
                    if(i==n || j==2 || j==(n-1)){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}
