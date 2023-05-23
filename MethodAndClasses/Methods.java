package MethodAndClasses;

public class Methods {
    String userName = "ozgur";

    public static void main(String[] args) {
        print();
        System.out.println(testMethod(4, 15));
        System.out.println(stringMethod("ece"));
        Methods myOBJ = new Methods();
        myOBJ.userName = "ece";
        System.out.println(myOBJ.userName);
        makeMusicians();
        makeSimpons();
    }

    public static void makeSimpons() {
        Simpons homer = new Simpons("Homer", 50, "Nuclear");
        homer.age = 51;
        System.out.println(homer.age);
    }

    public static void makeMusicians() {

        // instance
        Musicians musiciansOBJ = new Musicians("ozgur", "gutar", 23);
        System.out.println(musiciansOBJ.instrument);
    }

    public static int testMethod(int a, int b) {
        return a + b;
    }

    static String stringMethod(String name) {
        return "Hello " + name;
    }

    public static void print() {
        System.out.println("hello");
    }

}
