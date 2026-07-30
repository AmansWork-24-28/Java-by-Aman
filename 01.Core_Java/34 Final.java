final class A{
    // class cannot be inherited
    
}

class B{
    
    public final void show(){ // final method which cannot be Override
        System.out.println("I am in B");
    }
}

class Final {
    public static void main(String[] args) {
        System.out.println(" Final Keyword ");
        
        final int a = 10; // final variable a cannot be chnaged further.
        
    }
}