package Functions;

import java.util.Scanner;

public class F02_Binary_To_Decimal {

    public static int binary_to_decimal(int n){
        int res = 0;
        int i = 0;
        while(n>0){
            int p = n % 10
            ;
            res += (p * Math.pow(2, i));
            i++;
            n /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Binary No : ");

        int n = sc.nextInt();

        int res = binary_to_decimal(n);

        System.out.println("Decimal Converted No : "+res);
        sc.close();
    }
   
}
