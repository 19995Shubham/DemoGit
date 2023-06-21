package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Collection before reverse: " + list);
        Collections.reverse(list);
        System.out.println("Collection after reverse"+list);
    }
}
