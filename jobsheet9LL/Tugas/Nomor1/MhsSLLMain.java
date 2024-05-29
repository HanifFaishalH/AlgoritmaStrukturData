package jobsheet9LL.Tugas.Nomor1;

public class MhsSLLMain {
    public static void main(String[] args) {
        MhsSLL mhs = new MhsSLL();

        mhs.addFirst(new Mahasiswa("Anton", "111"));
        mhs.print();
        mhs.addLast(new Mahasiswa("Prita", "112"));
        mhs.print();
        mhs.insertAt(2, new Mahasiswa("Yusuf", "113"));
        mhs.print();
        mhs.insertAfter("113", new Mahasiswa("Doni", "114"));
        mhs.print();
        mhs.addLast(new Mahasiswa("Sari", "115"));
        mhs.print();
    }
}
