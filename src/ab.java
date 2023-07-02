import java.util.*;
public class ab {
    static void count(int n){
        int count=0;
        while (n!=0){
            int last=n%10;
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
    static void revers(int n){
        int revers=0;
        while (n!=0){
            int last=n%10;
            revers=(revers*10)+last;
            n=n/10;
        }
        System.out.println(revers);
    }
    static void armstrong(int n){
        int sum =0;
        int dup=n;
        while (n!=0){
            int last_digit=n%10;
            sum=(last_digit*last_digit*last_digit)+sum;
            n = n/10;
        }
        if (dup==sum){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
    static void divisors(int n){
        for (int i = 1; i<=n;i++){
            if (n%i==0){
                System.out.println(i);
            }
        }

    }
    static void prime(int n){
        int count=0;
        for (int i=1;i<=n;i++){
            if (n%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("yaa");
        }
        else {
            System.out.println("no");
        }
    }
    static void gcd(int n1,int n2){
        int gcd=1;
        for (int i=1;i<=Math.min(n1,n2);i++){
         if (n1%i==0&&n2%i==0){
             gcd=i;
         }
        }
        System.out.println(gcd);

    }
    static void hcf(int n1,int n2){
for (int i=Math.min(n1, n2);i>=1;i--){
    if (n1%i==0&&n2%i==0){
        System.out.println(i);
        break;
    }
}
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2= sc.nextInt();
//        armstrong(n);
//        divisors(n1);
//        prime(n);
//        count(n);
//        revers(n);
//        gcd(n1,n2);
//        hcf(n1,n2);
    }
}
