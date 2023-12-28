package Session1.Study.Lesson8.Exercises.Ex1;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass("Original string");
        System.out.println("Old string: " + myClass.getMyString());
        myClass.setMyString("New string");
        System.out.println("New string: " + myClass.getMyString());
    }
}
