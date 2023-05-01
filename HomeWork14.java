import java.util.Random;

public class HomeWork14 {
    public static void main(String[] args) {
        writeFor();
        writeWhile();
        writeWhileDo();

    }
        public static void writeFor (){

        Random random =  new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int value = random.nextInt(1, 11);

            arr[i] = value;
            System.out.print(arr[i] +" ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            arr[i] += 10;
            System.out.print(arr[i] +" ");

        }
        System.out.println();

    }
    public static void writeWhile (){

        Random random =  new Random();
        int[] arr = new int[10];
        {
            int i = 0;
            while (i < arr.length) {
                int value = random.nextInt(1, 11);

                arr[i] = value;
                System.out.print(arr[i] +" ");
                i++;
            }
        }
        System.out.println();

        int i = 0;
        while (i < arr.length) {
            arr[i] += 10;
            System.out.print(arr[i] +" ");

            i++;
        }
        System.out.println();

    }
    public static void writeWhileDo (){

        Random random =  new Random();
        int[] arr = new int[10];
        {
            int i = 0;
            if (i < arr.length) {
                do {
                    int value = random.nextInt(1, 11);

                    arr[i] = value;
                    System.out.print(arr[i] + " ");
                    i++;
                } while (i < arr.length);
            }
        }
        System.out.println();

        int i = 0;
        if (i < arr.length) {
            do {
                arr[i] += 10;
                System.out.print(arr[i] + " ");

                i++;
            } while (i < arr.length);
        }
        System.out.println();

    }
}
