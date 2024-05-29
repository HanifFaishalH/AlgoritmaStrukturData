package jobsheet10DLL.Tugas.No_2;

public class filmDLL {
    nodeFilm head, tail;
    int size;

    public filmDLL(){
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void AddFirst(film input) {
        if (isEmpty()) {
            nodeFilm film = new nodeFilm(null, input, null);
            head = film;
            tail = film;
        } else {
            nodeFilm film = new nodeFilm(null, input, head);
            head.prev = film;
            head = film;
            tail = head.next;
        }
        size++;
    }

    public void AddLast(film input) {
        if (isEmpty()) {
            AddFirst(input);
        } else {
            nodeFilm current = head;
            while (current.next != null) {
                current = current.next;
            }
            nodeFilm film = new nodeFilm(current, input, null);
            current.next = film;
            film.prev = current;
            tail = film;
        }
        size++;
    }

    public void AddBasedIndex(int index, film input) throws Exception {
        if (index < 1 || index >size) {
            throw new Exception("Invalid index!");
        } else if (isEmpty()) {
            AddFirst(input);
        } else if (index == size) {
            AddLast(input);
        } else {
            nodeFilm current = head;
            for (int i = 1; i < index -1; i++) {
                current = current.next;
            }
            nodeFilm film = new nodeFilm(current, input, current.next);
            if (current.next != null) {
                current.next.prev = film;
            }
            current.next = film;
            size++;
        }
    }

    public film removeFirstFilm(){
        if (isEmpty()) {
            System.out.println("Tidak film yang tersedia");
            return null;
        } else {
            film rmvFilm = head.dataFilm;
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            size--;
            System.out.println("Film yang dihapus : "+rmvFilm);
            return rmvFilm;
        }
    }

    public film removeLastFilm() {
        if (isEmpty()) {
            System.out.println("Tidak film yang tersedia");
            return null;
        } 
        else {
            film rmv = tail.dataFilm;
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
            size--;
            return rmv;
        }
    }

    public film removeAtIndex(int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Invalid input");
        } else if (index == 0) {
            return removeFirstFilm();
        } else if (index == size - 1) {
            return removeLastFilm();
        } else {
            nodeFilm current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            film rmv = current.dataFilm;
            current.prev.next = current.next;
            if (current.next != null) {
                current.next.prev = current.prev;
            }
            size--;
            return rmv;
        }
    }

    public void print() {
        if (isEmpty()) {
          System.out.println("Tidak ada film dalam list");
          return;
        }
        nodeFilm current = head;
        while (current != null) {
          current.dataFilm.printFilm();
          current = current.next;
        }
        System.out.println("");
      }
      

    public film findID(int ID) {
        nodeFilm current = head;
        while (current != null) {
            if (current.dataFilm.idFilm == ID) {
                return current.dataFilm;
            }
            current = current.next;
        }
        return null;
    }

    public void sortByRate() {
        film film = new film();
        if (isEmpty()) {
            System.out.println("Film masih kosong");
            return;
        }
        boolean swap;
        do {
            swap = false;
            nodeFilm current = head;

            while (current != null && current.next != null) {
                if (current.dataFilm.ratingFilm < current.next.dataFilm.ratingFilm) {
                    film tmp = current.dataFilm;
                    current.dataFilm = current.next.dataFilm;
                    current.next.dataFilm = tmp;
                    swap = true;
                }
                current = current.next;
            }
        } while (swap);
        System.out.println("Daftar film berdasarkan rate tertinggi : ");
        film.printFilm();
    }
}
