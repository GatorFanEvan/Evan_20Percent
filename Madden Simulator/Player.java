abstract class Player{
  
  protected String name;
  protected int playerNumber;
  
  public Player(String name, int playerNumber){
    this.name = name;
    this.playerNumber = playerNumber;
    if (playerNumber >= 100){
      playerNumber--;
    }
  }
}