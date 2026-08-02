enum Animal{
    Dog ("Bark"),Cat("meow"),Tiger("Roar1"),Lion("Roar2"),Bear("Growl");
    String color;
    private Animal(String color){
        this.color = color;
    }
    
    public String getcolor(){
        return color;
    }
}

class EnumClass {
    public static void main(String[] args) {
        System.out.println("Enum Class");
        
        Animal a = Animal.Dog;
        System.out.println(a + " : "+a.getcolor());
        
    }
}