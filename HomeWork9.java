public class HomeWork9 {
    public static double countEnergy(int d, int kkal) {
        double energy = Math.PI * Math.pow(d/2,2) * kkal;
        return energy;
    }
    public static void main(String[] args) {

        double result1 = countEnergy(28, 40);
        double result2 = countEnergy(24, 40);
        double res = result1 - result2;
        System.out.println("Разница в калориях между пиццей диаметром 24 и 28 см равна: " + (int)res + " Ккал");
    }


}
