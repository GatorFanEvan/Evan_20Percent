class Lineman extends Player{
  
  protected int blocking;
  protected boolean preventSack;
  
  public Lineman(String name, int playerNumber, int blocking){
    super(name, playerNumber);
    this.blocking = blocking;
  }
  
  public boolean block(){
    preventSack = true;
    return preventSack;
  }
}