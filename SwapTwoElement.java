import java.util.LinkedList;
import java.util.Collections;

public class SwapTwoElement {


    public static void main(String[] args){


        LinkedList<String>list = new LinkedList<String>();

        list.add("Table");
        list.add("Watch");
        list.add("Glass");
        list.add("Mobile");
        list.add("Banch");
        list.add("Tree");
        list.add("Home");

        Collections.swap(list, 2, 5);
        System.out.println("Results after swap operation" + list);
        

        for(String str:list){

            System.out.println(str);
        }





    }
    
}
