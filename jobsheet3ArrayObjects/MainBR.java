package jobsheet3ArrayObjects;

import java.util.Scanner;

class Kerucut{
    public double jari2;
    public double miring;

    public Kerucut(double jari2, double miring) {
        this.jari2 = jari2;
        this.miring = miring;
    }
    double VolKer(double jari2, double miring) {
        return (1/3) * Math.PI*Math.pow(jari2, 2)*miring;
    }
    double LpKer(double jari2, double miring) {
        double luasSelimut = Math.PI * jari2 * miring;
        double luasAlas = Math.PI * Math.pow(jari2, 2);
        return luasSelimut + luasAlas;
    }
}
class Limas4 {
    public double sisi;
    public double tinggi;
    public Limas4(double sisi, double tinggi) {
        this.sisi=sisi;
        this.tinggi=tinggi;
    }

    double VolLim(double sisi, double tinggi) {
        return (sisi*sisi*tinggi)/3;
    }
    double LpLim (double sisi, double tinggi) {
        double luasAlas = Math.pow(sisi, 2);
        double tinggiSisi = Math.sqrt(Math.pow(tinggi, 2) + Math.pow(sisi / 2, 2));
        double luasSelimut = 4 * (1 / 2) * sisi * tinggiSisi;
        return luasAlas + luasSelimut;
    }
}
class Bola{
    public double r;

    public Bola(double r) {
        this.r=r;
    }
    double VolBol(double r) {
        return (4*r*r*r)/3;
    }
    double LpBol (double r) {
        return 4*Math.PI*r*r;
    }
}
public class MainBR {
    public static void main(String[] args) {
        Scanner add = new Scanner(System.in);
        MainBR[] hitung = new MainBR[3];
        
        System.out.println("Hitung Kerucut");
        System.out.println("Masukkan jari-jari kerucut : ");
        double JrKerucut = add.nextDouble();
        System.out.println("Masukkan sisi miring kerucut : ");
        double miringKerucut = add.nextDouble();

        System.out.println("Hitung Limas segi empat");
        System.out.println("Masukkan panjang sisi alas : ");
        double sisi = add.nextDouble();            
        System.out.println("Masukkan tinggi limas : ");
        double tinggi = add.nextDouble();

        System.out.println("Hitung Bola");
        System.out.println("Masukkan jari-jari Bola");
        double JrBola = add.nextDouble();

        Kerucut kerucut = new Kerucut(JrKerucut, miringKerucut);
        Limas4 limas = new Limas4(sisi, tinggi);
        Bola bola = new Bola(JrBola);

        System.out.println("Luas Kerucut adalah : "+kerucut.LpKer(JrKerucut, miringKerucut)+" cm" + ", volume kerucut adalah : "+kerucut.VolKer(JrKerucut, miringKerucut));
        System.out.println("Luas Limas segiempat adalah : "+limas.LpLim(sisi, tinggi)+" cm" + ", volume kerucut adalah : "+limas.VolLim(sisi, tinggi));
        System.out.println("Luas Bola adalah : "+bola.LpBol(JrBola)+" cm" + ", volume kerucut adalah : "+bola.VolBol(JrBola));

        add.close();
    }
}
