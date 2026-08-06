import java.util.Collection;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;


class Set {
    public static void main(String[] args) {
        System.out.println("Set");
        
        // It not give the values in sorted form and no indexes
        // Set cannot contain duplicates 
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(5);
        nums.add(4);
        nums.add(14);
        nums.add(40);
        
        // tree set - sorted values
        Set<Integer> nums1 = new TreeSet<Integer>();
        nums1.add(5);
        nums1.add(4);
        nums1.add(14);
        nums1.add(40);
        
        System.out.println(nums);
        System.out.println(nums1);
        
        
        
        
      
    }
}