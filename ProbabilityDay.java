import java.lang.*;
import java.util.*;
/**
*/
public class ProbabilityDay extends Day
{  

  /**
  */
  private double probability;
  private Random rand;

  /**
  */
  public ProbabilityDay(MyDate d, String i, String t, int a, double p, Random r)
  {
    super(d, i, t, a);
    probability = p;
    rand = r;
  }

  /**
  */
  public String toString()
  {
    return super.toString();
  }

  /**
  */
  public void doEvent()
  {
    if(super.ifEventHappen()) {
       int i = rand.nextInt((int)(1/probability));
       if(i == 1) {
         super.doEvent();
       }
    }
    int t = super.getTotal();
    int a = super.getAmount();
    //if()
    //{

    //}
  }

}
