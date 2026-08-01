class A
{
	public void show() 
	{
		System.out.println("in A show");
	}
}
class B extends A
{
	public void show()
	{
		System.out.println("in B Show");
	}
}

class AnonymousInner {
    public static void main(String[] args) {
        System.out.println("");
        //A obj=new B();
    	
    	A obj=new A() 
    	{
    		public void show()
    		{
    			System.out.println("in new show");
    		}
    	};
    	obj.show();
    }
}