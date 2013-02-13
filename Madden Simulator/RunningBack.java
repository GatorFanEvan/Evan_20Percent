class RunningBack extends Player{
  
  protected int speed;
  protected int acceleration;
  protected int elusiveness;
  protected int carrying;
  
  public RunningBack(String name, int playerNumber, int speed, int acceleration, int elusiveness, int carrying){
    super(name, playerNumber);
    this.speed = speed;
    this.acceleration = acceleration;
    this.elusiveness = elusiveness;
    this.carrying = carrying;
  }
  
  public void rush(){
  }
}