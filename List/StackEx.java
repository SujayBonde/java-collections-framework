import java.util.*;

public class StackEx{
    public static void main(String[] args) {
//        List<String> names= new Stack<>();
//        names.add("Sujay");
//        names.add("Ajay");
//        names.add("Vishal");
//        names.add("Ram");
//
//        System.out.println("ArrayList is: "+names);
//
//        System.out.println("The Element at index 2 is: "+names.get(2));
//        names.add(2,"Pratik");
//        System.out.println("Names ArrayList is "+names);
//        names.remove("Vishal");
//
//        names.set(3,"Rameshwar");
//        System.out.println("Names ArrayList is "+names);
//
//        Iterator<String> it=names.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

        Stack<String> books=new Stack<>();

        books.push("DBMS");
        books.push("CNS");
        books.push("Java");

        System.out.println("Books is: "+books);

        books.pop();
        System.out.println("Books is: "+books);

        System.out.println(books.peek());

        System.out.println(books.empty());

    }
}
