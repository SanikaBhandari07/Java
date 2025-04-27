package Patterns;

import java.util.Scanner;

public class R {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println();
        int mid = (n+1)/2;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j==mid ||
                    j>mid && (i==1 || i== mid) ||
                    i<=mid && j==n  ||
                    i>=mid && i==j
                ){
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
