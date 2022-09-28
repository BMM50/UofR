import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> oldList = new ArrayList<Integer>();
        oldList.add(1);
        oldList.add(2);
        oldList.add(3);
        //System.out.println(oldList);
        System.out.println(oldList.iterator());
        Collection c = oldList;
        c.toArray();
        c.iterator();
        //System.out.println(c);
        ArrayList<Integer> newList = new ArrayList<Integer>(oldList);
    }
}
