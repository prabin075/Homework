import java.util.LinkedList;

public class ConvertToanArrayList {
    


    public static void main(String[] args){


        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("Apurva");
        linkedList.add("Ramesh");
        linkedList.add("Hari");
        linkedList.add("Binod");
        linkedList.add("Chetan");


        String[]array = linkedList.toArray(new String[linkedList.size()]);

        for(int i=0; i<array.length;i++){

        System.out.println(array[i]);
        }


    }

    
}
