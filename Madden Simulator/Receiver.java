class Receiver extends Player{
  
  protected int speed;
  protected int catching;
  protected int jumping;
  protected boolean catchBall;
  
  public Receiver(String name, int playerNumber, int speed, int catching, int jumping){
    super(name, playerNumber);
    this.speed = speed;
    this.catching = catching;
    this.jumping = jumping;
  }
  
  public boolean receive(){
    catchBall = true;
    return catchBall;
  }
}