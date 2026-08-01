// class - class -> extends
// class - interface -> implements
// interface - interface -> extends

interface Computer{
    void code();
    int a = 5;
    // int a; X
}
interface X{
    void sample();
    
}

class Laptop implements Computer,X{ // can implement multiple interfaces
    public void code(){ 
        System.out.println("In lap");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("In desk");
    }
}

class Interface {
    public static void main(String[] args) {
        System.out.println(" INTERFACES ");
        
        Computer l = new Laptop();
        Computer d = new Desktop();
        
        l.code();
        d.code();
        
    }
}