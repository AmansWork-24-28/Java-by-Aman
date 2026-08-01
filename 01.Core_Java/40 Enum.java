enum Status{
    Running,Success,Failed;
}

class Enum {
    public static void main(String[] args) {
        System.out.println(" ENUM ");
        
        // Status s1 = Status.Running;
        // System.out.println(s1);
        // System.out.println(s1.ordinal());
        
         Status[] arr = Status.values();
        // System.out.println(arr[1]);
        
        for(Status s:arr)
    	{
    		System.out.println(s);
    		System.out.println(s+" : "+s.ordinal());
    	}
        
        
        
    }
}