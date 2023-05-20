public class Variables {
    public static void main(String[] args) {
        // Variables

        // Integer - Long
        System.out.println("integer - long");
        int age = 20;
        System.out.println(10 * age);
        System.out.println(age / 5);
        int x = 5;
        int y = 11;
        System.out.println(y / x);// 2 sonucunu verir cunku sayilar int tanimli

        long myLong = 10;
        System.out.println(myLong / 5 + "\n");

        // Double - Float
        System.out.println("double - float");
        double z = 5;
        double a = 11.0;
        System.out.println(a / z);

        float myFloat = 10.0f;
        double pi = 3.14;
        int r = 5;
        System.out.println(2 * r * pi + "\n");

        // String
        System.out.println("String");

        String name = "ozgur";
        String surname = "vurgun";
        String fullName = name + " " + surname;
        System.out.println(fullName);

        // Boolean
        boolean isAlive = true;
        isAlive = false;
        System.out.println(isAlive + "\n");

        // Final
        System.out.println("final");
        int myInteger = 5;
        System.out.println("myInteger: " + myInteger);
        myInteger = 3;
        System.out.println("myInteger: " + myInteger);

        final int finalInt = 10;
        // finalInt = 15; hata patlatır. javada sabit tanımlama final on eki ile yapilir
        System.out.println("adfdddlşdsöfşlölclwe");
    }

}