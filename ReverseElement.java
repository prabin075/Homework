import java.util.ArrayList;
import java.util.Collections;

public class ReverseElement {
    public static void main(String[] args){
        ArrayList<String> liststrings = new ArrayList<String>();
        liststrings.add("Nepal");
        liststrings.add("India");
        liststrings.add("Pakistan");
        liststrings.add("Bhutan");
        System.out.println(liststrings);

        Collections.reverse(liststrings);
        System.out.println(liststrings);
    }
}
