import java.util.*;
public class PRACT {
//f(1) = 1;   f(n) = f(n-1) + f(n-2);
//f(2) = 1;
//f(3) = 2;
//f(4) = 3;
//f(5) = 5;
//f(6) = 8;
    static int Fibonacci(int i){
        if (i<=2){
            return 1;
        }
        return Fibonacci(i-1)+Fibonacci(i-2);
    }
//    static int sum(int n){
//        if (n==0){
//            return 0;
//        }
//        return n+sum(n-1);
//    }
//    static int Factorial(int n){
//        if (n==1){
//            return 1;
//        }
//        return n*Factorial(n-1);
//    }
//     static void Reverse_array(int i,int arr,int n){
//        if (i>=n/2){
//            return ;
//        }
////         Collections.swap(arr,i,n-i-1);
//         Reverse_array(i+1,arr,n);
//     }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        ton(1,n);
//        nto(n,n);
        System.out.println(Fibonacci(n));
//        System.out.println(sum(n));
//        System.out.println(Factorial(n));
//        List<Integer> arr = new ArrayList<>();
//        int a=0;
//        for(int i=0;i<n;i++){
////            System.out.println("Enter "+(i+1)+"th Element :: ");
////            a = sc.nextInt();
//            arr.add(i*10);
//        }
//        System.out.println(arr);
//        Collections.swap(arr, , n-a-1);
//        System.out.println(arr);
//        System.out.println(Reverse_array(0 ,arr,n));


    }
}
