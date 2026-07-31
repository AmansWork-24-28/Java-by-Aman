class Outer{
    
    public void ot(){
        System.out.println("I am outer");
    }
    
    class Inner{
        
        public void in(){
            System.out.println("I am inner");
        }
        
    }
}

class InnerClass{ 
    public static void main(String[] args) {
        System.out.println("Inner Class");
        
        Outer ot = new Outer();
        Outer.Inner in = ot.new Inner();
        ot.ot();
        in.in();
        //ot.in(); X
        in.ot();
        
    }
}