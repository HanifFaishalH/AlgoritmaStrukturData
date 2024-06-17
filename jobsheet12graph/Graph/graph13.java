package jobsheet12graph.Graph;

public class graph13 {
    int vertex;
    DoubleLL list[];

    graph13(int v) {
        vertex = v;
        list = new DoubleLL[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLL();
        }
    }

    void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
        list[tujuan].addFirst(asal, jarak);
    }

    void degree(int asal) throws Exception {
        int k, totIN = 0, totOUT = 0;
        for (int i = 0; i < vertex; i++) {
            // inDegree
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totIN;
                }
            }
            // outDegree
            for (k = 0; k < list[asal].size(); k++) {
                list[asal].get(k);
            }
            totOUT = k;
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totIN);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totOUT);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totIN + totOUT));
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        list[asal].remove(tujuan);
        list[tujuan].remove(asal);
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public boolean isPath(int start, int end) throws Exception {
        for (int i = 0; i < list[start].size(); i++) {
            if (list[start].get(i) == end) {
                return true;
            }
        }
        return false;
    }

    public void updateJarak(int a, int t, int j) throws Exception {
        for (int i = 0; i < list[a].size(); i++) {
            if (list[a].get(i) == t) {
                list[a].update(i, t, j);
                return;
            }
        }
        System.out.println("Asal tidak ditemukan");
    }

    public void hitungEdge() {
        int totEdge = 0;
        for (int i = 0; i < vertex; i++) {
            totEdge += list[i].size();
        }
        System.out.println("Total Edge dalam Graph: " + totEdge);
    }
}
