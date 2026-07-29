//  Types of Inheritance 
//  1.Single -> 1 parent has 1 child
//  2.Multilevel -> grandfather->father->child
//  3.Hierarchical -> 1 parent has multiple child

class Animal{
    
    public void eat(){
        System.out.println("eat man eat");
    }
}

class Dog extends Animal{
    
    public void bark(){
        System.out.println("bho bho");
    }
}

class cat extends Animal{
    
    public void mew(){
        System.out.println("meowww");
    }
}

class Labradour extends Dog{
    
    public void run(){
        System.out.println("Labradour runs faster than all");
    }
}



class TypesOfInheritance {
    public static void main(String[] args) {
        System.out.println(" INHERITANCE ");
        
        Dog d = new Dog();
        d.eat();
        d.bark();
        
        Labradour lb = new Labradour();
        lb.eat();
   
    }
}