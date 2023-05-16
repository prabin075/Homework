import java.util.*;

public class HasSetEmptyorNot {


    public static void main(String[] args){


        HashSet<Integer>nums = new HashSet<>();
        HashSet<Integer>nums1 = new HashSet<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        if (nums.isEmpty()){
            System.out.println("The HashSet nums is an empty collection");
        }else{
            System.out.println("The HashSet nums is not an empty collection");
        }
        if (nums1.isEmpty()){
            System.out.println("THe HashSet num1 is an empty collection");
        }else{
            System.out.println("The HashSet nums1 is not an empty collection");
        }






    }
    
}
