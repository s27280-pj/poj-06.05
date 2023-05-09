package zadanie2;

public class TestMovable {
    public void runTest(){
      MovablePoint start = new MovablePoint(5,9);

      start.moveDown();
      start.moveRight();
      start.moveDown();
      start.moveDown();

        System.out.println(start.toString());

    }

}
