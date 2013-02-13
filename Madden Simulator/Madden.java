/*import java.util.ArrayList;
 import java.util.Collections;
 import java.util.LinkedList;
 import java.util.List;*/

class Madden{
  
  public static void main(String[] args){
    Quarterback qb = new Quarterback("Meade", 10, 97, 90, 91);
    RunningBack rb = new RunningBack("Clark", 29, 90, 95, 88, 91);
    RunningBack rb2 = new RunningBack("Grimble", 33, 96, 91, 90, 85);
    Receiver x = new Receiver("Pekich", 81, 86, 99, 90);
    Receiver y = new Receiver("Terrell", 84, 90, 88, 90);
    Receiver z = new Receiver("Camelo", 88, 95, 90, 90);
    Receiver w = new Receiver("Taylor", 86, 92, 90, 90);
    Receiver sb = new Receiver("McNeal", 82, 90, 90, 90);
    TightEnd te = new TightEnd("Russell", 89, 71, 93, 90);
    TightEnd te2 = new TightEnd("Morris", 80, 73, 81, 81);
    Lineman lt = new Lineman("Seymour", 76, 93);
    Lineman lg = new Lineman("LG", 70, 90);
    Lineman c = new Lineman("Graham", 68, 90);
    Lineman rg = new Lineman("RG", 55, 90);
    Lineman rt = new Lineman("Myers", 66, 90);
  }
}
