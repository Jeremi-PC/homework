import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Введите число для перевода его в двоичную систему: ");
        int dec = a.nextInt();
        int d, rem;
        String binar = " ";
        d = dec;
        while (dec > 0)  {

            rem = dec % 2;
            dec = dec / 2;
            binar = rem + binar;

        }
        System.out.println("Число " + d +" в двоичной системе исчисления равно: " + binar);
        System.out.println();
        a.close();
    }
}
