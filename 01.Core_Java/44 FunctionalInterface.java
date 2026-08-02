@FunctionalInterface
interface A{ // interface having only 1 method is called functional interface
    void show();
}

class B implements A {
   
    public void show() {
        System.out.println("This is B");
    }
}

public class {
    public static void main(String[] args) {
        
        System.out.println("Functional Inteface");

        // A obj = new B();
       
        
        A obj = new B()
        {
            public void show()
            {
                System.out.println("This is show");
            }
        };
        obj.show();
        
    }
}