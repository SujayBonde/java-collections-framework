import java.util.*;

public class HashSetEx {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(10);
        s.add(20);
        s.add(30);

        System.out.println(s);
        System.out.println(s.size());

        System.out.println(s.contains(10));
        System.out.println(s.contains(20));

        System.out.println(s.remove(30));

        System.out.println(s);
    }
}