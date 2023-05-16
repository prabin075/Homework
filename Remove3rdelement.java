import java.util.ArrayList;

public class Remove3rdelement{

    public static void main(String[] args){

        ArrayList<String> liststrings = new ArrayList<String>();
        liststrings.add("Nepal");
        liststrings.add("India");
        liststrings.add("Pakistan");
        liststrings.add("Bhutan");
        System.out.println(liststrings);

        liststrings.remove(2);
        System.out.println(liststrings);
    }
}