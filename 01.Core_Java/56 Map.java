import java.util.Collection;
import java.util.*;

class Map {
    public static void main(String[] args) {
        System.out.println("Map");
        
        // Use map when u want to work with key value pairs
        
        Map<String,Integer> students = new HashMap<>();
        students.put("Aman",99);
        students.put("Suraj",89);
        students.put("Kartik",50);
        students.put("Aman",100); // keys cannot be repeated it updates the value of key .
        System.out.println(students);
        System.out.println(students.get("Aman"));
        
        System.out.println(students.keySet());// print all the keys
        // printing map
        for(String name : students.keySet()){
            System.out.println(name+" : "+students.get(name));
        }
    
      
    }
}