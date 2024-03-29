package jobsheet4Minggu5.BruteForceDivideConquer.Tugas;

import java.util.Arrays;

public class Find {
    int elemen;
    double keuntungan[];

    public Car findHighestAccelDC(Car[] cars) {
        if (cars.length == 1) {
            return cars[0];
        }

        int mid = cars.length/2;

        Car leftMax = findHighestAccelDC(Arrays.copyOfRange(cars, 0, mid));
        Car rightMax = findHighestAccelDC(Arrays.copyOfRange(cars, mid, cars.length));

        if (leftMax.accel > rightMax.accel) {
            return leftMax;
        } else {
            return rightMax;
        }
    }

    public Car findLowestAccelDC(Car[] cars) {
        if (cars.length == 1) {
            return cars[0];
        }

        int mid = cars.length/2;

        Car leftMax = findLowestAccelDC(Arrays.copyOfRange(cars, 0, mid));
        Car rightMax = findLowestAccelDC(Arrays.copyOfRange(cars, mid, cars.length));

        if (leftMax.accel < rightMax.accel) {
            return leftMax;
        } else {
            return rightMax;
        }
    }

    public double AveragePowerBF(Car[] cars) {
        int totalPower = 0;
        for (Car car : cars) {
            totalPower += car.power;
        }

        double averagePower = (double) totalPower / cars.length;
        return averagePower;
    }
}
