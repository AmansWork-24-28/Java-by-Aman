class customex extends Exception {
    public customex(String s){
        super(s);
    }
}

class CustomException {
    public static void main(String[] args) {
        System.out.println("Custom Exception ");
        
        int i = 10;
        int j =0;
        
        try{
            j=10/i;
            if(j==0){
                throw new customex("custom exception is thrown");
            }
        }
        
        catch(customex e){
            System.out.println("Custom Exception "+e);
        }
        catch(Exception e1){
            System.out.println("Exception "+e1);
        }
        
        System.out.println("Custom Exception ");
    }
}