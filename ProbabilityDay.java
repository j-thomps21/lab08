/**
*/
public class ProbabilityDay extends Day
{
  /**
  */
  private double probability;

  /**
  */
  public ProbabilityDay(MyDate d, String i, String t, int a, double p)
  {
    super(d, i, t, a);
    probability = p;
  }

  /**
  */
  public toString()
  {
    return "prob: " + probability + " " + super.toString();
  }

  /**
  */
  ///Not really sure how to implement the random part for this
  public boolean ifEventHappen()
  {
    boolean check = super.ifEventHappen();
  }

  /**
  */
  ///unfinished
  public void doEvent()
  {
    int t = super.getTotal();
    int a = super.getAmount();
    if()
    {

    }
  }
}
