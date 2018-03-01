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
  public toString()
  {
    return super.toString();
  }

  /**
  */
  public void doEvent()
  {
    if(super.ifEventHappen() == 1) {
       int i = randnextInt((1/probability));
       if(i == 1) {
         super.doEvent();
       }
    }
  }

}
