class Methods{
    
    public void greet(){
        System.out.println("Hello Aman");
    }
    
    public int add(int a , int b){
        int sum = a+b;
        return sum;
    }
    
    public void printnumber(int i){
        System.out.println("The number is "+i);
    }
}

class Method{ 
    public static void main(String[] args) {
        System.out.println("Method in java");
        
        Methods m = new Methods();
        m.greet();
        int sum = m.add(1,5);
        System.out.println("The sum is "+sum);
        m.printnumber(10);
    }
}