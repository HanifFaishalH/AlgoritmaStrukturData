package jobsheet12graph.Graph;

import java.util.Scanner;

public class GraphMain13 {
    static void menu() {
        System.out.println("=====================================================");
        System.out.println("\nMenu : \n");
        System.out.println("1. Tambahkan edge");
        System.out.println("2. Hapus edge");
        System.out.println("3. Cek Degree");
        System.out.println("4. Print graph");
        System.out.println("5. Cek edge");
        System.out.println("6. Hapus semua vertex");
        System.out.println("7. Jumlah edge\n");
        System.out.print("Silahkan pilih menu Anda : ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah vertex: ");
        int jumlahVertex = scanner.nextInt();
        GraphMatrix graphMatrix = new GraphMatrix(jumlahVertex);
        graph13 graph13 = new graph13(jumlahVertex);

        while (true) {
            menu();
            int pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan asal: ");
                    int asal = scanner.nextInt();
                    System.out.print("Masukkan tujuan: ");
                    int tujuan = scanner.nextInt();
                    System.out.print("Masukkan jarak: ");
                    int jarak = scanner.nextInt();
                    graphMatrix.makeEdge(asal, tujuan, jarak);
                    graph13.addEdge(asal, tujuan, jarak);
                    break;
                case 2:
                    System.out.print("Masukkan asal: ");
                    asal = scanner.nextInt();
                    System.out.print("Masukkan tujuan: ");
                    tujuan = scanner.nextInt();
                    graphMatrix.removeEdge(asal, tujuan);
                    try {
                        graph13.removeEdge(asal, tujuan);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.print("Masukkan vertex: ");
                    int vertex = scanner.nextInt();
                    System.out.println("Degree dari vertex " + vertex + ": " + graphMatrix.degree(vertex));
                    try {
                        graph13.degree(vertex);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                    case 4:
                    System.out.println("Graph Matrix:");
                    graphMatrix.printGraphMatrix();
                    try {
                        System.out.println("Graph List:");
                        graph13.printGraph();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    System.out.print("Masukkan asal: ");
                    asal = scanner.nextInt();
                    System.out.print("Masukkan tujuan: ");
                    tujuan = scanner.nextInt();
                    try {
                        boolean isPath = graph13.isPath(asal, tujuan);
                        System.out.println("Apakah ada edge dari " + asal + " ke " + tujuan + "? " + (isPath ? "Ya" : "Tidak"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    graphMatrix = new GraphMatrix(jumlahVertex);
                    graph13.removeAllEdges();
                    break;
                case 7:
                    graph13.hitungEdge();
                    break;
                case 8:
                    System.out.print("Masukkan asal: ");
                    asal = scanner.nextInt();
                    System.out.print("Masukkan tujuan: ");
                    tujuan = scanner.nextInt();
                    System.out.print("Masukkan jarak baru: ");
                    jarak = scanner.nextInt();
                    try {
                        graph13.updateJarak(asal, tujuan, jarak);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 9:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
    }
}

