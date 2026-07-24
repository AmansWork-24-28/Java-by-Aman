
class WhileLoop {
    public static void main(String[] args) {
        System.out.println("While Loop");
        
        Synatx
        while(condn){  o/p - t or f
            code;
        }
        
        while(true){
            System.out.println("Infinite prints");
        }
        
        int i = 1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
        
        int j=1;
        while(i<=4){
            System.out.println("HI "+i);
            i++;
            while(j<=3){
                System.out.println("Helli "+j);
                j++;
            }
        }
    }
}