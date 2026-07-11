import java.util.*;

public class PriorityQueueEx{
    public static void main(String[] args) {
        Queue<Integer> pq=new PriorityQueue<>((a,b)->b-a);

        pq.offer(10);
        pq.offer(2);
        pq.offer(35);
        pq.offer(4);

        System.out.println(pq);
        System.out.println(pq.poll());


    }
}