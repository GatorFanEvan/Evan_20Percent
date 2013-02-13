class TightEnd extends Player{
  
  protected int blocking;
  protected int catching;
  protected int speed;
  
  public TightEnd(String name, int playerNumber, int blocking, int catching, int speed){
    super(name, playerNumber);
    this.blocking = blocking;
    this.catching = catching;
    this.speed = speed;
  }
}