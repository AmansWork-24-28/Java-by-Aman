
class AssignmentOperators {
    public static void main(String[] args) {
        System.out.println("Assignment Operators");
        
        // =
        int a = 5;
        int b = 10;
        
        // +=
        int add = a+b;
         System.out.println("Addition "+add);
        
        // -=
        int sub = b-a;
        System.out.println("Subtraction "+sub);
        
        // *=
        int mul = a*b;
        System.out.println("Multiplication "+mul);
         
         // /=
        int div = b/a;
        System.out.println("Division "+div);
         
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);
         
    }
}