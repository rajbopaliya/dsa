import java.util.*;
public class recursion {
    int count =0;
//    void print(){
//        if (count==5) return;
//        System.out.println(count);
//        count++;
//        print();
//    }
    static  void name(int i ,int a){
        if (i>a) return;
        System.out.println("raj");
        name(i+1,a);
    }
    static void num(int i,int a){
        if (i>a) return;
        System.out.println(a-i);
        num(i+1,a);

    }
    public static void main(String[] args) {
//        recursion r1 = new recursion();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        name(1,a);
        num(1,a);
//        r1.print();
//        return;

    }
}
