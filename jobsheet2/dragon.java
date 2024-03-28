package jobsheet2;

public class dragon {
    int x,y,width,height;

    void moveLeft(){
        x = x-1;
        position();
        if (x < 0) {
            System.out.println("Game Over!");
        }
        dtcCoalition();
    }
    void moveRight(){
        x = x+1;
        position();
        dtcCoalition();
    }
    void moveUp(){
        y = y-1;
        position();
        if (y < 0) {
            System.out.println("Game Over");
        }
        dtcCoalition();
    }
    void moveDown(){
        y =y+1;
        position();
        dtcCoalition();
    }
    void position(){
        System.out.printf("(%d, %d)\n",x,y);
    }
    void dtcCoalition(){
        if (x<0 || y<0 || x< height ||y<width) {
            System.out.println("Try again");
        } else {
            System.out.println("Nice move");
        }
    }

    public static void main(String[] args) {
        dragon Marsudi = new dragon();
        Marsudi.position();
        Marsudi.moveRight();
        Marsudi.moveUp();
    }
}
