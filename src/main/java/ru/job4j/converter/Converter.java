package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");
        System.out.println();

        float inputE = 140;
        float expectedE = 2;
        float outputE = Converter.rubleToEuro(inputE);
        boolean passedE = expectedE == outputE;
        System.out.println("140 rubles are 2. Test result : " + passedE);
        System.out.println();

        float inputD = 120;
        float expectedD = 2;
        float outputD = Converter.rubleToDollar(inputD);
        boolean passedD = expectedD == outputD;
        System.out.println("140 rubles are 2. Test result : " + passedD);
    }
}