
class StringBufferAndStringBuilder {
    public static void main(String[] args) {
        System.out.println("--String Builder & String Buffer--\n");
        
        StringBuffer sb = new StringBuffer("Aman"); // its like creating mutable string
        System.out.println(sb);
        
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        
        sb.append(" Gotad");
        sb.deleteCharAt(2);
        sb.insert(2,"SS");
        System.out.println(sb);
        sb.setLength(30);
        sb.ensureCapacity(100);
        
    }
}