import java.util.Scanner;

public class Homework12 {
    public static void main(String[] args) {
        String res = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Press the relevant button [1-Espresso; 2-Americano; 3-Cappuchino; 4-Tea]: ");
        int Choice = sc.nextInt();

        sc.close();
        switch (Choice) {
            case 1 -> res = espresso();
            case 2 -> res = americano();
            case 3 -> res = cappuchino();
            case 4 -> res = tea();
            default -> System.out.println("You entered non correct value");
        }
        System.out.println(res);
    }
    public static String espresso() {
        String string = "Cooking espresso ";
        return string;
    }
    public static String americano() {
        espresso();
        String string = espresso() + "+ add water ";
        return string;
    }
    public static String cappuchino() {
        americano();
        String string = americano() + "+ add milk";
        return string;
    }
    public static String tea() {
        String string = "Coocking tea ";
        return string;
    }

}
