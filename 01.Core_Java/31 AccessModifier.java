class Student {

    public String college = "MMCOE";

    protected String branch = "Computer Engineering";

    String city = "Pune";          // Default access modifier

    private int rollNo = 101;

    public void displayRollNo() {
        System.out.println("Roll No : " + rollNo);
    }
}

public class AccessModifier {

    public static void main(String[] args) {

        Student s = new Student();

        // Public - Accessible everywhere
        System.out.println("College : " + s.college);

        // Protected - Accessible in the same package
        System.out.println("Branch : " + s.branch);

        // Default - Accessible in the same package
        System.out.println("City : " + s.city);

        // Private - Not directly accessible
        // System.out.println(s.rollNo); // Error

        // Access private data using a public method
        s.displayRollNo();
    }
}