
class Sample{
    
    public void add(int a,int b){
        System.out.println("Addition : "+(a+b));
    }
    
}

class ClassObject{
    public static void main(String[] args) {
        System.out.println("Class & Object");
        
        Sample s = new Sample(); // object of Sample class
        s.add(3,2); 
        
        
    }
}