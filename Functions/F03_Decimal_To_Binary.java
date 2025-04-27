package Functions;

import java.util.Scanner;

public class F03_Decimal_To_Binary {

    public static int decimal_to_binary(int n){

        int res = 0;
        int i = 0;
        
        while(n>0){

            int p = n % 2;
            res += p * (int)Math.pow(10,i) ;
            i++;
            n /= 2;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Decimal No : ");

        int n = sc.nextInt();

        
        int res = decimal_to_binary(n);

        System.out.println("Binary Converted No : "+res);
        
        
        sc.close();
    }
        
}
