package UTS.KasusA;

public class Rekening {
    public String rek, nama, telp, email;
    public double saldo;

    public Rekening() {

    }
    
    public Rekening(String rek,String nama,String telp,String email, double saldo) {
        this.rek = rek;
        this.nama = nama;
        this.telp = telp;
        this.email = email;
        this.saldo = saldo;
    }

    public void printRek() {
        System.out.println("No Rekening "+rek);
        System.out.println("Nama nasabah "+nama);
        System.out.println("Nomor telepon "+telp);
        System.out.println("E-mail "+email);
        System.out.println("Saldo "+saldo);
    }
}