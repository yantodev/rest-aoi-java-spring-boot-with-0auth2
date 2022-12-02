package com.yantodev.api.worker;

public class ST_DEV {

    public static void main(String[] args) {
        double[] numArray = {151,156,176,152,187,147,189,156,174,172
        };
        double SD = calculateSD(numArray);

        System.out.println("Standard Deviation = " + SD);
    }

    public static double calculateSD(double numArray[])
    {
        double sum = 0.0, standardDeviation = 0.0;

        for(double num : numArray) {
            sum += num;
        }

        double mean = sum/numArray.length;

        System.out.println("Mean = " + mean);

        for(double num: numArray) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/numArray.length);
    }
}

