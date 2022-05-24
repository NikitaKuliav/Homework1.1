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


        // Третье задание

        short bananas = 5 * 80;
        short milk = 105 * 2;
        short iceCream = 100 * 2;
        short eggs = 70 * 4;

        int summary = bananas + milk + iceCream + eggs;
        float summaryKilogramm = (float) summary / 1000;
        System.out.println("Общий вес спорт-завтрака в граммах = " + summary + " гр");
        System.out.println("Общий вес спорт-завтрака в килограммах = " + summaryKilogramm + " кг");


        // Четвертое задание

        int weightLose = 7;
        int weightLoseGramm = 7 * 1000;
        int var1 = 250;
        int var2 = 500;

        int result1 = weightLoseGramm / var1;
        int result2 = weightLoseGramm / var2;

        int averageResult = (result1 + result2) / 2;
        System.out.println("Если худеть по 250 грамм в день, то получится " + result1 + " дней");
        System.out.println("Если худеть по 500 грамм в день, то получится " + result2 + " дней");
        System.out.println("В среднем получится " + averageResult + " день");


        // Пятое задание

        int salaryMas = 67760;
        int salaryDen = 83690;
        int salaryKrist = 76230;

        double salaryIncrease = 1.10;

        double salaryMasIncrease = salaryMas * salaryIncrease;
        double salaryDenIncrease = salaryDen * salaryIncrease;
        double salaryKristIncrease = salaryKrist * salaryIncrease;

        int salaryMasYear = salaryMas * 12;
        int salaryDenYear = salaryDen * 12;
        int salaryKristYear = salaryKrist * 12;

        double salaryMasYearIncrease = salaryMasYear * salaryIncrease;
        double salaryDenYearIncrease = salaryDenYear * salaryIncrease;
        double salaryKristYearIncrease = salaryKristYear * salaryIncrease;

        double differenceMas = salaryMasYearIncrease - salaryMasYear;
        double differenceDen = salaryDenYearIncrease - salaryDenYear;
        double differenceKrist = salaryKristYearIncrease - salaryKristYear;

        System.out.println("Маша теперь получает " + (int)salaryMasIncrease + " рублей. Годовой доход вырос на " + (int)differenceMas);
        System.out.println("Денис теперь получает " + (int)salaryDenIncrease + " рублей. Годовой доход вырос на " + (int)differenceDen);
        System.out.println("Кристина теперь получает " + (int)salaryKristIncrease + " рублей. Годовой доход вырос на " + (int)differenceKrist);
    }
}