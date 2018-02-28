/**
*/
public class Month extends Event
{
  /**
  */
  private int amount;
  private int total = 0;

  /**
  */
  public Month(MyDate d, String i, String t, int a)
  {
    super(d, i, t)
    amount = a;
  }

  /**
  */
  public String toString()
  {
    return "every " + amount + "months start " + super.toString();
  }

  /**
  */
  public int getAmount()
  {
    
  }

  /**
  */

  /**
  */

}
