package Functions;

import java.util.Scanner;

public class F01_Prime_Number {
    
    public static void isPrime(int n){

        boolean flag = true;
        if(n==1){
            System.out.println("1 is Neither Prime Not Composite");
        }
        else if(n==2){
            System.out.println(n+ " is a Pime Number");
        }
        else{

            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i == 0){
                    flag = false;
                    break;
                }
            }

            if(flag == false){
                System.out.println(n+ " is a Composite Number");
            }
            else{
                System.out.println(n+ " is a Prime Number");
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No to check whether the given no is pime or not");
        int n = sc.nextInt();

        isPrime(n);
        sc.close();
    }
}
