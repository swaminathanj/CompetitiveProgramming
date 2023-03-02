public class Boat_Captain {

  /**
   * Program entry point.
   *
   * @param args command line args
   */
  public static void main(String[] args) {
    Captain captain = new Captain(new BattleFishingBoat());
    captain.move();
    captain.fire();
  }
}


class BattleFishingBoat implements BattleShip {

  private FishingBoat boat;

  public BattleFishingBoat() {
    boat = new FishingBoat();
  }

  @Override
  public void fire() {
    System.out.println("fire!");
  }

  @Override
  public void move() {
    boat.sail();
  }
}


interface BattleShip {

  void fire();

  void move();

}


class FishingBoat {

  public void sail() {
    System.out.println("The Boat is moving to that place");
  }

  public void fish() {
    System.out.println("fishing ...");
  }

}


class Captain implements BattleShip {

  private BattleShip battleship;

  public Captain() {

  }

  public Captain(BattleShip battleship) {
    this.battleship = battleship;
  }

  public void setBattleship(BattleShip battleship) {
    this.battleship = battleship;
  }

  @Override
  public void fire() {
    battleship.fire();
  }

  @Override
  public void move() {
    battleship.move();
  }

}