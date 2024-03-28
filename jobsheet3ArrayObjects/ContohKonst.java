package jobsheet3ArrayObjects;

class Salam {
    public void beriSalam () {
        System.out.println("hello world");
    }
    public void beriSalam (String p) {
        System.out.println("hello world, "+p);
    }
}
public class ContohKonst {
    public static void main(String[] args) {
        Salam nama = new Salam();

        nama.beriSalam();
        nama.beriSalam("Agus");
    }
}
