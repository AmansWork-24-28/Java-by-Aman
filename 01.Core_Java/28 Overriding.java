// Method Overriding means same method name , same no. of parameters but different work

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Overriding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}