class Human
{
	private int age;
	private String name;
	
	public Human(int age , String name)
	{
		this.age = age;
		this.name = name;
		System.out.println("in constructor");
	}
	public int getAge(){
		return age;
	}
	public void SetAge(int age)
	{
		this.age=age;
	}
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}

public class Constructor {
	public static void main(String[] args) 
	{
		Human obj = new Human(15,"AMan");
		
		System.out.println(obj.getName()+" : "+obj.getAge());
	//	Human obj1=new Human();
		obj.SetAge(30);
		obj.setName("Reddy");
		

		System.out.println(obj.getName()+" : "+obj.getAge());
	}
}