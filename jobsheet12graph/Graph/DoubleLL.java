package jobsheet12graph.Graph;

public class DoubleLL {
    nodeGraph head, tail;
    int size;

    DoubleLL() {
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item, int jarak) {
        if (isEmpty()) {
            head = tail = new nodeGraph(null, item, jarak, null);
        } else {
            nodeGraph newNode = new nodeGraph(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks diluar batas");
        } else {
            nodeGraph tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            return tmp.data;
        }
    }

    public int getJarak(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks diluar batas");
        } else {
            nodeGraph tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            return tmp.jarak;
        }
    }

    public void remove(int item) {
        nodeGraph current = head;
        while (current != null) {
            if (current.data == item) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                size--;
                return;
            }
            current = current.next;
        }
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }
    
    public void update(int index, int item, int jarak) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks diluar batas");
        } else {
            nodeGraph tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            tmp.data = item;
            tmp.jarak = jarak;
        }
    }

    public void updateJarak(int tujuan, int jarakBaru) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateJarak'");
    }

}
