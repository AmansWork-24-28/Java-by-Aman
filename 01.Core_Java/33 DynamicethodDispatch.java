class A{
    public void show(){
        System.out.println("I am A");
    }
}

class B extends A{
    public void show(){
        System.out.println("I am B");
    }
}

class C extends A{
    public void show(){
        System.out.println("I am C");
    }
}

class DynamicMethodDispatch {
    public static void main(String[] args) {
        System.out.println("Dynamic method dispatch ");
        
        A oj = new A();
        oj.show();
        
        oj = new B();
        oj.show();
        
        oj = new C();
        oj.show();
        
        // Animal a = new Dog();
    }
}