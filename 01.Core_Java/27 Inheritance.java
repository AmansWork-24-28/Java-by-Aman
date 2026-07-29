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

class Inheritance{
    public static void main(String[] args) {
        System.out.println("INHERITANCE");
        
        Dog d = new Dog();
        d.eat();
        d.bark();
   
    }
}