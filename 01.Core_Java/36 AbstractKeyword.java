
// 1. Abstract method → Abstract class is compulsory.
// 2.Abstract class → Abstract method is NOT compulsory.

abstract class Car{ // abstract keyword
    public void race(){
        System.out.println("Fast and Furious");
    }
    
    public abstract void horn(); // abstract function
}

class Gwagon extends Car{
    public void horn(){
        System.out.println("forceee-->");
    }
}


class AbstractKeyword {
    public static void main(String[] args) {
        System.out.println("Abstract keyword");
        
        Gwagon g = new Gwagon();
        g.race();
        g.horn();
    }
}