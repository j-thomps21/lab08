/**
*/
public class Day extends Event
{
  /**
  */
  private int amount;
  private int total = 0;

  /**
  */
  public Day(MyDate d, String i, String t, int a)
  {
    super(d, i, t);
    amount = a;
  }

  /**
  */
  public String toString()
  {
    return super.toString();
  }

  /**
  */
  public int getAmount()
  {
    return amount;
  }

  /**
  */
  public int getTotal()
  {
    return total;
  }

  /**
  */
  public boolean ifEventHappen()
  {
    boolean check = false;
    if(total % amount == 0)
      check = true;
    return check;
  }

  /**
  */
  public void doEvent()
  {
    if(ifEventHappen())
    {
      this.getItem();
      total++;
    }
  }
}
