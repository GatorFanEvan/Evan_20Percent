/*import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;*/

class PassPlay{
  
  protected int numReceivers;
  protected String name;
  protected int numTightEnds;
  protected int numRunningBacks;
  
  public PassPlay(String name, int numReceivers, int numTightEnds, int numRunningBacks){
    this.numReceivers = numReceivers;
    this.name = name;
    this.numTightEnds = numTightEnds;
    this.numRunningBacks = numRunningBacks;
    if (numReceivers < 0){
      numReceivers = 0;
    }
    if (numReceivers > 5){
      numReceivers = 5;
      numTightEnds = 0;
      numRunningBacks = 0;
    }
    if (numTightEnds < 0){
      numTightEnds = 0;
    }
    if (numTightEnds > 2){
      numTightEnds = 2;
    }
    if (numRunningBacks < 0){
      numRunningBacks = 0;
    }
    if (numRunningBacks > 2){
      numRunningBacks = 2;
    }
    if (numReceivers + numTightEnds + numRunningBacks > 5){
      numReceivers = 3;
      numTightEnds = 1;
      numRunningBacks = 1;
    }
    while (numReceivers + numTightEnds + numRunningBacks < 5){
      numReceivers++;
    }
    /*List<Receiver> receivers = new LinkedList<Receiver>();
    List<TightEnd> tightEnds = new LinkedList<TightEnd>();
    List<RunningBack> runningBack = new LinkedList<RunningBack>();*/
    Receiver[] receiver = new Receiver[numReceivers];
    TightEnd[] tightEnd = new TightEnd[numTightEnds];
    RunningBack[] runningBack = new RunningBack[numRunningBacks];
  }
}