@FunctionalInterface
interface A{ // interface having only 1 method is called functional interface
    void show(int i);
}

public class LamdaExpression {
    public static void main(String[] args) {
        
        System.out.println("Lamda EXpressions");
        
        // A obj =() ->
        //     {
        //         System.out.println("This is show 1");
                   System.out.println("This is show 2");
        //     };
            
        // A obj = () -> System.out.println("This is show");
        
        // A obj = (int i) -> System.out.println("This is show"+i);
        
        obj.show(0);
        
    }
}