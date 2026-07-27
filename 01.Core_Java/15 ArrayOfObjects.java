class Students{
    int prn;
    int age;
    String name;
}

class Main {
    public static void main(String[] args) {
        System.out.println("Array of Object");
        
        // for the class of 3 students
        Students s1 = new Students();
        s1.name = "Aman";
        s1.age = 18;
        s1.prn = 1064;
        System.out.println("Name :"+s1.name+" Prn :"+s1.prn+" Age :"+s1.age);
        
        Students s2 = new Students();
        s2.name = "Suraj";
        s2.age = 18;
        s2.prn = 1066;
        System.out.println("Name :"+s2.name+" Prn :"+s2.prn+" Age :"+s2.age);
        
        Students s3 = new Students();
        s3.name = "Mizzak";
        s3.age = 18;
        s3.prn = 1069;
        System.out.println("Name :"+s3.name+" Prn :"+s3.prn+" Age :"+s3.age);
        
        // but when the class strength is greater like 50 - 100 the above method becomes hectic and not feasible. Therefor we use Array of Objects.
        
        Students[] stds = new Students[5];
        
        stds[0]=s1;
		stds[1]=s2;
		stds[2]=s3;
		
		for(int i=0;i<stds.length;i++)
		{
			System.out.println("Name :"+stds[i].name+" Prn :"+stds[i].prn+" Age :"+stds[i] .age);
		}
        
    }
}