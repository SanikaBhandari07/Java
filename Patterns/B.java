package Patterns;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int mid = (n+1)/2;
        for(int i=1; i<=n; i++){
            for(int j=2; j<=(n-1); j++){
                if(i==1 && j==(n-1)  || i==n && j==(n-1)){
                    System.out.print(" ");
                    continue;
                }
                if(i==1 || i==mid || i==n || j==2 || j==(n-1)){
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
