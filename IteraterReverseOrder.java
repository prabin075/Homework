import java.util.Iterator;
import java.util.LinkedList;

public class IteraterReverseOrder {

    public static void main(String[] args){

        LinkedList<String>l_List = new LinkedList<String>();


        l_List.add("Red");
        l_List.add("Green");
        l_List.add("Black");
        l_List.add("Pink");
        l_List.add("Orange");

        System.out.println("Original linkedlist:" + l_List);

        Iterator<String> it = l_List. descendingIterator();
         
        System.out.println("Element in Reverse Order.");
        while(it. hasNext()){
            System.out.println(it.next());
        }

    }
    
}
