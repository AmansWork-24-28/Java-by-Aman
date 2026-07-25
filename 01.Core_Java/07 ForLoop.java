
class ForLoop {
    public static void main(String[] args) {
        System.out.println("For Loop");
        
        for(int i=0;i<=5;i++){
            System.out.println(i);
        }
        
        for(int i=1;i<=2;i++)
		{
			System.out.println("Shift "+i);
			for(int j=1;j<=5;j++)
			{
				System.out.println(" "+(j+4)+"-"+(j+5));
			}
		}
		
		int i=1;
		for(;i<=5;){
		    System.out.println("hi "+i);
		    i++;
		}
    }
}