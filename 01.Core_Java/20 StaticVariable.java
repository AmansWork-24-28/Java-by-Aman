class Static{
    String city ;
    int age ;
    
    String name;
    static String nickname ;
    
}
class StaticVariable {
    public static void main(String[] args) {
        System.out.println("Static Variable");
        
        Static sc1 = new Static();
        sc1.city = "Pune" ;
        sc1.age = 20;
        sc1.name = "Aman";
        
        Static sc2 = new Static();
        sc2.city = "Mumbai";
        sc2.age = 21;
        sc2.name = "Aman";
        
        // common variable between both classes
        String s = Static.nickname = "Goated";
        
        System.out.println(s);
        
    }
}