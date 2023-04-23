public class HomeWork10 {
    public static void main(String[] args) {
        double sec = Math.random() * 2880;
        int hours = ((int)sec - ((int)sec % 3600)) / 3600;
        System.out.println("For end of work rest: "+ (int)sec +" sec");
        if (hours == 1)
            System.out.println("Or "+ hours +" hour");
        else if (hours < 1)
            System.out.println("Rest less than 1 hour");
        else
            System.out.println("Or "+ hours +" hours");
    }
}
