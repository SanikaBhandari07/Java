package Patterns;

import java.util.Scanner;

public class $P01_Heart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        // int mid = (n+1)/2;
        sc.close();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=((i+1)*2)-1; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i)-1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=((i+1)*2)-1; j++){
                if(i==n && j==1){
                    continue;
                }
                System.out.print("*");
                
            }
            System.out.println();
        }
        for(int k=1; k<=2*((n*2)+1)-1; k++){
            System.out.print("*");
        }
        System.out.println();
        int num = (n*2)+1;
        for(int i=num; i>=0; i--){
            for(int j=1; j<=(num-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(i*2)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
