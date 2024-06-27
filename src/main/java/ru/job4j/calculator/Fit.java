package ru.job4j.calculator;

public class Fit {

    // Константы для расчетов
    private static final int MAN_BASE_HEIGHT = 100;
    private static final int WOMAN_BASE_HEIGHT = 110;
    private static final double WEIGHT_MULTIPLIER = 1.15;

    /**
     * Метод для расчета идеального веса для мужчин на основе роста
     * @param height Рост в сантиметрах
     * @return Идеальный вес для мужчин
     */
    public static double manWeight(short height) {
        return (height - MAN_BASE_HEIGHT) * WEIGHT_MULTIPLIER;
    }

    /**
     * Метод для расчета идеального веса для женщин на основе роста
     * @param height Рост в сантиметрах
     * @return Идеальный вес для женщин
     */
    public static double womanWeight(short height) {
        return (height - WOMAN_BASE_HEIGHT) * WEIGHT_MULTIPLIER;
    }

    public static void main(String[] args) {
        short height = 187; // Заданный рост

        // Расчет веса для мужчин
        double manWeight = Fit.manWeight(height);
        System.out.printf("Man 187 cm has ideal weight of %.2f kg%n", manWeight);

        // Расчет веса для женщин
        double womanWeight = Fit.womanWeight(height);
        System.out.printf("Woman 187 cm has ideal weight of %.2f kg%n", womanWeight);
    }
}
