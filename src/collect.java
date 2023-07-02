//import com.sun.jdi.Value;
//
//import javax.naming.NamingEnumeration;
//import java.util.*;
//public class collect {
//    public static void main(String[] args) {
//        ArrayList<String> empname = new ArrayList<>();
//        empname.add("xyz");
//        empname.add("abc");
//        empname.add(1,"raj");
//        System.out.println(empname);
//
//        ArrayList<Integer> rollno = new ArrayList<>();
//        rollno.add(1);
//        rollno.add(3);
//        rollno.add(2,2);
//        System.out.println(rollno);
//
//        ArrayList<String> name = new ArrayList<>();
//        name.add("abc");
//        name.add("wda");
//        name.add("afafa");
//        System.out.println(name);
//
//        empname.addAll(name);
//        System.out.println(empname);
//
//        ArrayList<Integer> number = new ArrayList<>();
//        number.add(1);
//        number.add(2);
//        number.add(3);
//        number.add(4);
//        number.add(5);
//        number.add(6);
//        System.out.println(number);
////        remove by index
//        number.remove(5);
//        System.out.println(number);
////        remove by value
//        number.remove(Integer.valueOf(5));
//        System.out.println(number);
////        remove all of arraylist
//        number.clear();
//        System.out.println(number);
//
//
//        ArrayList<Integer> number = new ArrayList<>();
//        add element
//        number.add(1);
//        number.add(2);
//        number.add(3);
//        number.add(4);
//        number.add(5);
//        number.add(6);
//        add element with index
//        number.add(6,7);
//        number.add(7,8);
//        number.add(9);
//        number.add(10);
//        System.out.println(number);
//        update element
//        number.add(12);
//        System.out.println(number);
//        number.set(10,11);
//        System.out.println(number);
//        //iterator
//        for (int i=0;i<number.size();i++){
//            System.out.println(number.get(i));
//
//
//        check element
//        System.out.println(number.contains(10));
//        System.out.println(number.contains(15));
//        remove element by index
//        number.remove(10);
//        System.out.println(number);
//        remove by value
//        number.remove(Integer.valueOf(10));
//        System.out.println(number);
//        remove all element
//        number.clear();
//        System.out.println(number);
//
//        stack collection
//        Stack<String> colour = new Stack<>();
//        colour.push("pink");
//        colour.push("black");
//        colour.push("green");
//        colour.push("red");
//        System.out.println(colour);
//        System.out.println(colour.peek());
//        colour.pop();
//        System.out.println(colour);
//        System.out.println(colour.peek());
//queue
//        Queue<Integer> id_no = new LinkedList<>();
//        id_no.offer(10);
//        id_no.offer(20);
//        id_no.offer(30);
//        id_no.offer(40);
//        System.out.println(id_no);
//        System.out.println(id_no.peek());
//        id_no.poll();
//        System.out.println(id_no);
//        System.out.println(id_no.element());
//
//  PriorityQueue
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//        pq.offer(20);
//        pq.offer(10);
//        pq.offer(50);
//        pq.offer(40);
//        pq.offer(30);
//        System.out.println(pq);
//        System.out.println(pq.peek());
//        pq.poll();
//        System.out.println(pq);
//ArrayDeque
//        ArrayDeque<Integer> adq = new ArrayDeque<>();
//        adq.offer(10);
//        adq.offerFirst(20);
//        adq.offer(40);
//        adq.offerLast(50);
//        adq.offerLast(30);
//        System.out.println(adq);
//        System.out.println(adq.peek());
//        System.out.println(adq.peekFirst());
//        System.out.println(adq.peekLast());
//        System.out.println(adq);
//        System.out.println(adq.poll());
//        System.out.println(adq.pollFirst());
//        System.out.println(adq.pollLast());
//        System.out.println(adq);
//
//        ArrayList<Integer> num = new ArrayList<>();
//        num.add(10);
//        num.add(20);
//        num.add(30);
//        num.add(40);
//        num.add(50);
//        num.add(5,60);
//        System.out.println(num);
//        num.remove(Integer.valueOf(60));
//        System.out.println(num);
//        num.set(3,500);
//        System.out.println(num);
//        for (int i=0;i<num.size();i++){
//            System.out.println(num.get(i));
//        }
//        System.out.println( num.contains(40));
//        Map<Integer,String> no = new HashMap<>();
//
//        no.put(1,"one");
//        no.put(2,"two");
//        no.put(3,"three");
//        no.put(4,"four");
//
//        System.out.println(no);
//
//    }
//}
//
