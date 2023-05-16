import java.util.HashMap;



public class HashMapTest {


    public static void main(String[] args){



        HashMap<String,String> countries = new HashMap<>();{

        }

        countries.put("Nepal","Kathmandu");
        countries.put("India","New Delhi");
        countries.put("Bangladesh","Dhaka");
        countries.put("Russia","Mascow");
        countries.put("Bhutan","Thimpu");


        System.out.println("HashMap:" + countries);

        int size = countries.size();

        System.out.println("size of HashMap:" + size);


    }
    
}
