import java.util.*;
public class atozdsa {
    static void digit(int n) {
        int count = 0;
        while (n > 0) {
            int last = n % 10;
            n = n / 10;
            System.out.println(last);
            count++;
        }
        System.out.println("NO OF ELEMENT IN THIS NUMBER" + " " + count);
    }

    static void reverse(int n) {
        int reverse = 0;
        while (n > 0) {//jajaf
            int last = n % 10;
            reverse = last + (reverse * 10);
            n = n / 10;
        }
        System.out.println(reverse);
    }

    static void palindrome(int n) {
        int dup = n;
        int reverse = 0;
        while (n > 0) {
            int last = n % 10;
            reverse = last + (reverse * 10);
            n = n / 10;
        }
        if (dup == reverse) {
            System.out.println("yes,number is palindrome");
        } else {
            System.out.println("No,number is not palindrome");
        }
    }

    static void divisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    static void prime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("yes prime Number");
        } else {
            System.out.println("No not prime Number");
        }
    }

    static void armstrong(int n) {
        int sum = 0;
        int dup = n;
        while (n > 0) {
            int last = n % 10;
            sum = sum + (last * last * last);
            n = n / 10;
        }
        if (dup == sum) {
            System.out.println("yes armstrong");
        } else {
            System.out.println("Not armstrong");
        }
    }

    static int printname(int i, int n) {
        if (i > n) {
            return 0;
        }
        System.out.println("raj");
        return printname(i + 1, n);
    }

    static int ton(int i, int n) {
        if (i > n) {
            return 0;
        }
        System.out.println(i);
        return ton(i + 1, n);
    }
    static int nto(int n){
        if (n==0){
            return 0;
        }
        System.out.println(n);
        return nto(n-1);
    }
    static int sum(int n,int sum){
        if (n==0){
            System.out.println(sum);
            return sum;
        }
        return sum(n-1,sum+n);
    }
    static int sum1(int n){
        if (n==0){
            return 0;
        }
       return n+sum1(n-1);
    }
    static int factorial(int n){
        if (n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    static int fibonacci(int  n){
        if (n<=2) {
            return 1;
        }
        else {
             return fibonacci(n-1)+fibonacci(n-2);
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        digit(n);
//        reverse(n);
//        palindrome(n);
//        divisors(n);
//        prime(n);
//        armstrong(n);
//        printname(1,n);
//        ton(1,n);
//        nto(n);
//        sum(n,0);
//        System.out.println(sum1(n));
//        System.out.println(factorial(n));
        System.out.println(fibonacci(n));
    }
}
