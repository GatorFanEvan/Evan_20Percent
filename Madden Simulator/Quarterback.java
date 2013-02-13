class Quarterback extends Player{
  
  protected int throwPower;
  protected int throwAccuracy;
  protected int awareness;
  
  public Quarterback(String name, int playerNumber, int throwPower, int throwAccuracy, int awareness){
    super(name, playerNumber);
    this.throwPower = throwPower;
    this.throwAccuracy = throwAccuracy;
    this.awareness = awareness;
  }
  
  public void pass(){
  }
  
  public void scramble(){
  }
  
  public void snap(){
  }
}