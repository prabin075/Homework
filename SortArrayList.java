import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args){
        ArrayList<String> liststrings = new ArrayList<String>();
        liststrings.add("Nepal");
        liststrings.add("India");
        liststrings.add("Pakistan");
        liststrings.add("Bhutan");
        System.out.println(liststrings);

        Collections.sort(liststrings);
        System.out.println(liststrings);
    }
}
