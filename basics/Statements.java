package basics;
public class Statements {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x);
        x = x + 1;
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);
        x = x * 5;
        System.out.println(x);

        int y = 4;
        System.out.println("x >= y : " + (x >= y));
        System.out.println("y > x : " + (y > x));
        y = 30;
        System.out.println("x > y : " + (x > y));
        System.out.println("x == y : " + (x == y));
        System.out.println("x != y : " + (x != y));
        System.out.println("-------------------------------");
        // and &&
        // or ||
        x = 30;
        y = 30;
        int z = 5;
        System.out.println(x < z && y < z);

        // if statements

        if (x < y) {
            System.out.println("y is bigger");
        } else if (y < x) {
            System.out.println("x is bigger");
        } else if (x == y) {
            System.out.println("x = y");
        } else {
            System.out.println("hiçbir koşul  gerçekleşmedi");
        }

        // switch
        int day = 2;
        String dayString = "";
        switch (day) {
            case 1:
                dayString = "monday";
                break;
            case 2:
                dayString = "tuesday";

                break;
            case 3:
                dayString = "wendnesday";

            default:
                dayString = "Sunday";
                break;
        }
        System.out.println(dayString);
    }
}
