package zadanie2;

public class MovablePoint implements Movable{

    int x = 0;
    int y = 0;

    @Override
    public void moveUp() {
        y+=1;
        System.out.println("Moved up!");
    }

    @Override
    public void moveDown() {
        y-=1;
        System.out.println("Moved down!");
    }

    @Override
    public void moveLeft() {
        x-=1;
        System.out.println("Moved left!");
    }

    @Override
    public void moveRight() {
        x+=1;
        System.out.println("Moved right!");
    }


    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public MovablePoint(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println("Stworzono nowy obiekt!");
        System.out.println("Aktualna pozycja | " + "x = " + x + " | " + "y = " + y);
    }
}
