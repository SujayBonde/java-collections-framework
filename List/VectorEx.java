import java.util.*;

public class VectorEx{
    public static void main(String[] args) {
        List<String> names= new Vector<>();
        names.add("Sujay");
        names.add("Ajay");
        names.add("Vishal");
        names.add("Ram");

        System.out.println("ArrayList is: "+names);

        List<String> surnames=new ArrayList<String>(Arrays.asList("Bonde","Kharche","Varade"));
        System.out.println("Surnames ArrayList is "+surnames);

        System.out.println("The Element at index 2 is: "+names.get(2));
        names.add(2,"Pratik");
        System.out.println("Names ArrayList is "+names);
        names.remove("Vishal");

        names.set(3,"Rameshwar");
        System.out.println("Names ArrayList is "+names);

        Iterator<String> it=names.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}