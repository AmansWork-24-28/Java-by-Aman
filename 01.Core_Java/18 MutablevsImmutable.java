public class Main {
    public static void main(String[] args) {
        String name = "Aman";
        name = name + "Gotad";
        System.out.println("hello" + name); // Prints: helloAmanGotad
/*
        String name = "navin"; creates a string object "navin" in the String Constant Pool (a special memory area in the Heap). 
        The variable name points to "navin".
        1.When you do name = name + "reddy";, Java does not edit "navin". 
        Instead, it creates a brand new String object "navinreddy" elsewhere in memory.
        2.The variable name now points to this new object "navinreddy".
        3.The original "navin" remains untouched in memory (and will eventually be collected by garbage collection if nothing
         else uses it).
 */
        
        String s1 = "Aman";
        String s2 = "Aman";
        
        System.out.println(s1 == s2); // Prints: true
    }
}