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
  public boolean ifEventHappen(MyDate d)
  {
    boolean check = super.ifEventHappen(d);
    if(check == true)
    {
      if(rand.nextDouble(probability) == 0.0)
        check = true;
      else
        check = false;
    }
    return check;
  }
}
