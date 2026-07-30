class Animal {

    String color = "White";

    Animal() {
        System.out.println("Animal Constructor");
    }
}

class Dog extends Animal {

    String color = "Black";

    Dog() {
        super();    // Calls parent class constructor
        System.out.println("Dog Constructor");
    }

    void display() {
        System.out.println("Current Class Color : " + this.color);
        System.out.println("Parent Class Color  : " + super.color);
    }
}

public class this_super {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.display();
    }
}