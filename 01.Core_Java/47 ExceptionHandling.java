
class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Exception Handling using try-catch block");
        
        int i = 0;
        int j = 0;
        
        // java says hey try this statement if it gives error or not , if it gives error it throws exception object .
        try 
        {
            j=10/i;
        }
        // the exception object thrown by try block is caught by catch block and it has the solution to solve that error.
        catch(Exception e)
        {
            System.out.println("something went wrong");
            i = 5;
        }
        
        System.out.println("Error solved ");
         
    
    }
}