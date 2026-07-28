// Getter and Setters are used to access or update the private members of class

class GetSet{
    
    private int a;
    
    public int getA(){ // getter 
        return a;
    }
    
    public void setA(int a){  // setter
        this.a = a;
    }
    
}

class Main {
    public static void main(String[] args) {
        System.out.println("getter and setter");
        
        GetSet gs = new GetSet();
        gs.setA(5);
        int res = gs.getA();
        
        System.out.println("Result is "+res);
    }
}