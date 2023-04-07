
public class HomeWork3 {
    public static void main(String[] args) {
        int d , rem;
        String binar = " ";
        d = 637;
        // Перевод в двоичную систему исчисления
        while (d > 0)  {

        rem = d % 2;
        d = d / 2;
        binar = rem + binar;

         }
        System.out.println("Число 637 в двоичной системе исчисления равно: " +binar);
        System.out.println();

        // Перевод в троичную систему исчисления
        String ternary = " ";
        d = 637;
        while (d > 0)  {

            rem = d % 3;
            d = d / 3;
            ternary = rem + ternary;
        }
        System.out.println("Число 637 в троичной системе исчисления равно: " +ternary);

    // Перевод из двоичной системы в десятичную
        double dec = 0;
        binar = "11100111";
        for (int i = binar.length() - 1; i > -1; i--) {
         if (binar.charAt(i) != '0') {
            dec += Math.pow(2, i);

         }
      }
        System.out.println();
        System.out.println("Число в 11100111 в десятичной системе исчисления равно: " +(int) dec);

    }
}

