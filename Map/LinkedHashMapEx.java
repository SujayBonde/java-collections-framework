import java.util.*;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        Map<String, String> m= new LinkedHashMap<>();

        m.put("name","Sujay");
        m.put("age","21");

        System.out.println(m.get("name"));
        System.out.println(m.get("age"));

        System.out.println(m);

        System.out.println(m.containsKey("name"));
        System.out.println(m.containsValue("Sujay"));
        m.remove("name","Sujay");
        System.out.println(m);

        m.putIfAbsent("name","Sujay");
        System.out.println(m);

        System.out.println(m.getOrDefault("name","Sujay"));

        System.out.println(m.keySet());
        System.out.println(m.values());
    }
}