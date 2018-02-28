/**
*/
public class Day extends Events
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
    return "every " + amount + " days start " + super.toString();
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
  public doEvent()
  {
    if(ifEventHappen())
    {
      this.getItem();
      total++;
    }
  }
}
