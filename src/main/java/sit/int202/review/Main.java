package sit.int202.review;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Word");
        Student s = new Student();
//        s.setId(10001);
//        s.setName("Somchai");
//        s.setGpax(2.95);
        System.out.println(s);
        System.out.println(Long.toHexString(s.hashCode()));
    }
}
