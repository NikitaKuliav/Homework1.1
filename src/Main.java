public class Main {
    public static void main(String[] args) {

        // Первое задание

        byte dogs = 5;
        short cats = 9;
        int rubles = 1_000_000;
        long peoples = 8_000_000_000L;

        float pi = 3.14f;
        double e = 2.7;

        char a = 97;

        boolean learn = true;


        // Второе задание

        double weightFirst = 78.2;
        double weightSecond = 82.7;

        double weightSummary = weightFirst + weightSecond;
        double weightDifference = Math.abs(weightFirst - weightSecond);

        System.out.println("Общий вес двух боксёров " + weightSummary);
        System.out.println("Разница в весе между двумя боксёрами " + weightDifference);
    }
}