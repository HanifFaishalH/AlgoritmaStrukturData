package jobsheet12graph.Graph;

public class GraphMatrix {
    int vertex;
    int[][] matrix;

    GraphMatrix(int v) {
        vertex = v;
        matrix = new int[v][v];
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                matrix[i][j] = -1; // Initialize with -1 to indicate no edge
            }
        }
    }

    void makeEdge(int asal, int tujuan, int jarak) {
        matrix[asal][tujuan] = jarak;
    }

    void removeEdge(int asal, int tujuan) {
        matrix[asal][tujuan] = -1;
    }

    void printGraphMatrix() {
        for (int i = 0; i < vertex; i++) {
            System.out.println("Gedung " + (char) ('A' + i) + " : ");
            for (int j = 0; j < vertex; j++) {
                if (matrix[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matrix[i][j] + " m), ");
                }
            }
            System.out.println();
        }
    }

    int outDegree(int vertex) {
        int outDegreeCount = 0;
        for (int j = 0; j < this.vertex; j++) {
            if (matrix[vertex][j] != -1) {
                outDegreeCount++;
            }
        }
        return outDegreeCount;
    }

    int inDegree(int vertex) {
        int inDegreeCount = 0;
        for (int i = 0; i < this.vertex; i++) {
            if (matrix[i][vertex] != -1) {
                inDegreeCount++;
            }
        }
        return inDegreeCount;
    }

    int degree(int vertex) {
        return inDegree(vertex) + outDegree(vertex);
    }
}
