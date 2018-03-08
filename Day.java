/**
*/
public class Day extends Event
{
  /**
  amount variable is for "every command" ex: "every 2 days" amount = 2

  */
  private int amount;
  private MyDate nextDate;

  /**
  */
  public Day(MyDate d, String i, String t, int a)
  {
    super(d, i, t);
    amount = a;
    nextDate = d;
    nextDate.incDay(amount);
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
  public boolean ifEventHappen(MyDate d)
  {
    return d.daysUntil(this.nextDate) == 0;
  }

  /**
  */
  public void doEvent()
  {
    System.out.print(toString());
    nextDate.incDay(amount);
  }

}
