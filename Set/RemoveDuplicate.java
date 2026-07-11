import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr={10,20,20,40,40,50};

        Set<Integer> s=new LinkedHashSet<>();

        for(int num:arr){
            s.add(num);
        }
        System.out.println(s);
    }
}