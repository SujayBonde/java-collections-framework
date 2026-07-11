import java.util.*;

public class EnumSetEx {

    enum Color {
        RED,
        BLUE,
        YELLOW
    }

    public static void main(String[] args) {
        EnumSet<Color> e = EnumSet.allOf(Color.class);

        e.add(Color.RED);
        e.add(Color.BLUE);
        e.add(Color.YELLOW);
        System.out.println(e);
    }
}