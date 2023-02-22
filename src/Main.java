public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1");
        byte variableOne = 2;
        System.out.println("Значение переменной \"variabOne\" с типом byte равно: " + variableOne);
        short variableTwo = 3;
        System.out.println("Значение переменной \"variabTwo\" с типом short равно: " + variableTwo);
        int variableThree = 60;
        System.out.println("Значение переменной \"variabThree\" с типом int равно: " + variableThree);
        long variableFore = 123L;
        System.out.println("Значение переменной \"variabFore\" с типом long равно: " + variableFore);
        float variableFive = 1.34f;
        System.out.println("Значение переменной \"variabFive\" с типом float равно: " + variableFive);
        double variableSix = 13.49898d;
        System.out.println("Значение переменной \"variabSix\" с типом double равно: " + variableSix);
    }

    public static void task2() {
        System.out.println("Задача 2");
        float variableOne = 27.12f;
        System.out.println("Значение: " + variableOne);
        long variableTwo = 987678965549L;
        System.out.println("Значение: " + variableTwo);
        float variableThree = 2.786f;
        System.out.println("Значение: " + variableThree);
        short variableFore = 569;
        System.out.println("Значение: " + variableFore);
        short variableFive = -159;
        System.out.println("Значение: " + variableFive);
        short variableSix = 27897;
        System.out.println("Значение: " + variableSix);
        byte variableSeven = 67;
        System.out.println("Значение: " + variableSeven);
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte oneClass = 23;
        System.out.println("у Людмилы Павловны в классе " + oneClass + " ученика");
        byte twoClass = 27;
        System.out.println("у Анны Сергеевны в классе " + twoClass + " ученика");
        byte threeClass = 30;
        System.out.println("у Екатерины Андреевны в классе " + threeClass + " учеников");
        short paper = 480;
        System.out.println("Закупили всего " + paper + " листов бумаги");
        int paperStudent = paper / (oneClass + twoClass + threeClass);
        System.out.println("На каждого ученика выходит " + paperStudent + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte bottle = 16;
        byte time = 2;
        System.out.println("Производительность машины для изготовления бутылок — " + bottle + " бутылок за " + time + " минуты");
        short timeMinutes = 20; // можно задать 10, 20 или любое другое количество минут
        int time_1 = timeMinutes / time * bottle;
        System.out.println("За " + timeMinutes + " минут машина изготовила " + time_1 + " бутылок");
        short timeDay = 1; //сразу можно задать за 1,2 и тд суток
        int time_2 = 24 * 60 * timeDay / time * bottle;
        System.out.println("За " + timeDay + " суток машина изготовила " + time_2 + " бутылок");
        short timeMonth = 1; //сразу можно задать за 1,2 и тд месяцев
        int time_3 = 30 * 24 * 60 * timeMonth / time * bottle;
        System.out.println("За " + timeMonth + " месяцев машина изготовила " + time_3 + " бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte potTotal = 120;
        System.out.println("Всего банок краски: " + potTotal);
        byte potWhite = 2;
        byte potBrown = 4;
        System.out.println("На один класс уходит " + potWhite + " банки белой и " + potBrown + " банки коричневой краски");
        int classTotal = potTotal / (potWhite + potBrown);
        System.out.println("Всего классов покрашено: " + classTotal);
        int whiteTotal = classTotal * potWhite;
        int brownTotal = classTotal * potBrown;
        System.out.println("Было куплено " + whiteTotal + " банок белой краски и " + brownTotal + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6");
        byte weightBanana = 80;
        byte sumBanana = 5;
        int totalBanana = weightBanana * sumBanana;
        byte weightMilk = 105;
        byte sumMilk = 2;
        int totalMilk = weightMilk * sumMilk;
        byte weightPlombir = 100;
        byte sumPlombir = 2;
        int totalPlombir = weightPlombir * sumPlombir;
        byte weightEgg = 70;
        byte sumEgg = 4;
        int totalEgg = weightEgg * sumEgg;
        int grTotal = totalBanana + totalMilk + totalPlombir + totalEgg;
        float kgTotal = grTotal / 1000f;
        System.out.println("Завтрак спортсмена в граммах: " + grTotal + " (" + kgTotal + " кг)");
    }

    public static void task7() {
        System.out.println("Задача 7");
        short weight = 7000;
        short gramDay_1 = 250;
        short gramDay_2 = 500;
        int day_1 = weight / gramDay_1;
        System.out.println("Спортсмен сбросит 7 кг за " + day_1 + " дней, если будет сбрасывать по " + gramDay_1 + " грамм каждый день");
        int day_2 = weight / gramDay_2;
        System.out.println("Спортсмен сбросит 7 кг за " + day_2 + " дней, если будет сбрасывать по " + gramDay_2 + " грамм каждый день");
        float gramDay_3 = (gramDay_1 + gramDay_2) / 2f;
        float day_3 = weight / gramDay_3;
        System.out.println("Среднее число дней: " + day_3);
    }

    public static void task8() {
        System.out.println("Задача 8");
        // зп до повышения
        int salaryMasha = 67760;
        int salaryDen = 83690;
        int salaryKris = 76230;
        // ставка повышения
        float bet = 1.1f;
        // зп после повышения
        float newsalaryMasha = salaryMasha * bet;
        float newsalaryDen = salaryDen * bet;
        float newsalaryKris = salaryKris * bet;
        // зп выросла на
        float differenceMasha = 12 * newsalaryMasha - 12 * salaryMasha;
        float differenceDen = 12 * newsalaryDen - 12 * salaryDen;
        float differenceKris = 12 * newsalaryKris - 12 * salaryKris;
        System.out.println("Маша теперь получает " + newsalaryMasha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей.");
        System.out.println("Денис теперь получает " + newsalaryDen + " рублей. Годовой доход вырос на " + differenceDen + " рублей.");
        System.out.println("Кристина теперь получает " + newsalaryKris + " рублей. Годовой доход вырос на " + differenceKris + " рублей.");
    }

}
