package Patterns;

import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n = sc.nextInt();
    System.out.println();
    int mid = (n+1)/2;

    for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            if(j>=mid){
                if(j==mid || i==j || i+j==(n+1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
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
