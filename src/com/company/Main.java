package com.company;
/**
 * @author Николай Куприянов
 * */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);

        switch (x) {
            case -3:
                lessThanMinusThree(x);
                break;
            case 0:
                lessThanZero(x);
                break;
            default:
                moreThanZero(x);
                break;
        }
    }

    /**
     * Результат для значения X <= 3
     * @param x целочисленное значение
     */
    public static void lessThanMinusThree(int x) {
        double y = Math.pow(x, 3) + 1;
        double f = Math.exp(x + 1);
        System.out.println("Y = " + y + "\nF = " + f);
    }

    /**
     * Результат для значения X <= 0
     * @param x целочисленное значение
     */
    public static void lessThanZero(int x) {
        double y = 1 + Math.pow(2, Math.tan(x));
        double f = Math.pow(x, 4);
        System.out.println("Y = " + y + "\nF = " + f);
    }

    /**
     * Результат для значения X > 0
     * @param x целочисленное значение
     */
    public static void moreThanZero(int x){
        double y = Math.pow(1 / Math.tan(x), 2);
        double f = Math.pow(Math.tan(x), 1.0 / 5.0);
        System.out.println("Y = " + y + "\nF = " + f);
    }
}