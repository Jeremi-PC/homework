public class HomeWork5 {
    public static void main(String[] args) {
    char nine = '9';

        int nineInt = Integer.parseInt(String.valueOf(nine));
        System.out.println(nineInt);

        int nineInteg = Character.getNumericValue (nine);
        System.out.println(nineInteg);
        System.out.println(nineInt + nineInteg);
}
}
