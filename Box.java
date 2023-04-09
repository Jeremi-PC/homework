import java.util.Scanner;

public class Box {
    public static void main(String[] args) {


        Scanner a = new Scanner(System.in);
        System.out.println("Введите высоту коробки в см: ");
        int height = a.nextInt();
        System.out.println("Введите ширину коробки в см: ");
        int width = a.nextInt();
        System.out.println("Введите длину коробки в см: ");
        int lenth = a.nextInt();
        a.close();

        Box Volume = new Box (height, width, lenth);


    }

        public Box(int h, int w, int l)  {
        int volume = h * w * l;
        System.out.println("Объем коробки равен " + volume + " см^3");
    }
}
