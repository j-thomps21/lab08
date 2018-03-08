/**
*/
public class Month extends Event
{
  /**
  The amount variable is for "every" command. Ex: "every 2 days" amount = 2
  total variable shows how many monaths have passed
  */
  private int amount;
  private MyDate nextDate;

  /**
  Constructor for the Month class
  */
  public Month(MyDate d, String i, String t, int a)
  {
    super(d, i, t);
    amount = a;
    nextDate = d.incMonth(amount);
  }

  /**
  toString method for this class
  */
  public String toString()
  {
    return super.toString();
  }

  /**
  Returns the amount of the object.
  */
  public int getAmount()
  {
    return amount;
  }

  /**
  Returns the total months that have passed
  */
  public int getTotal() {
    return total;
  }

  /**
  Incriments the total field
  */
  public int totalInc() {
    total++;
  }

  /**
  Determines if the event should happen
  */
  public boolean ifEventHappen(MyDate d) {
    return d.daysUntil(this.nextDate) == 0;
  }

  /**
  ifEventHappen is true, then do the event (ie print out the string and incriment)
  */
  public void doEvent() {
   System.out.println(toString());
   getDate.incMonth(amount);
   }
}
