package jobsheet4Minggu5.BruteForceDivideConquer.Tugas;

public class MainShow {
    public static void main(String[] args) {
        Car showCar[] = new Car[8];

        showCar[0] = new Car("BMW","M2 Coupe", 2016, 6816, 728);
        showCar[1] = new Car("Ford", "Fiesta ST", 2014, 3921, 575);
        showCar[2] = new Car("Nissan", "370Z", 2009,4360, 657);
        showCar[3] = new Car("Subaru", "BRZ", 2014, 4058, 609);
        showCar[4] = new Car("Subaru", "Impreza WRX STI", 2013, 6255, 703);
        showCar[5] = new Car("Toyota", "AE86 Trueno", 1986, 3700, 553);
        showCar[6] = new Car("Toyota", "86/GT86", 2014, 4180, 609);
        showCar[7] = new Car("Golf", "Golf GTI", 2014, 4180, 631);

        Find find = new Find();

        for (int i = 0; i < showCar.length; i++) {
            showCar[i].displayCar();
        }

        Car highestAccel = find.findHighestAccelDC(showCar);
        Car lowestAccel = find.findLowestAccelDC(showCar);
        Double averagePower = find.AveragePowerBF(showCar);

        System.out.println("Akselerasi mobil tertinggi adalah : "+highestAccel);
        System.out.println("Akselerasi mobil terendah adalah : "+lowestAccel);
        System.out.println("Power rata-rata mobil showroom adalah : "+averagePower);
    }
}
