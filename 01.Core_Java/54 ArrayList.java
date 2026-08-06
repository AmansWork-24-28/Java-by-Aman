import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

class ArrayListDemo {
    public static void main(String[] args) {
        System.out.println("List");
        
        // Here when u insert the data in ArrayList the data is of differnet datatypes as well.
        // Collection nums = new ArrayList();
        // nums.add("Aman");
        // nums.add(5);
        // nums.add(4);
        
        // Use it just when u shave to only insert value and keep
        // Collection<Integer> nums = new ArrayList<Integer>();
        // nums.add(5);
        // nums.add(4);
        
        // Use it when u need to wrok with Indexes
        // List can contain duplicates 
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(4);
        
        System.out.println(nums);
        System.out.println(nums.get(0));
        System.out.println(nums.indexOf(4));
    }
}