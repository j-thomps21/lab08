/**
class Month that extends Event. similar to Day class execpt events happen on a monthly basis
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
  Determines if the event should happen
  */
  public boolean ifEventHappen(MyDate d) {
    return d.daysUntil(this.nextDate) == 0;
  }

  /**
  ifEventHappen is true, then do the event (ie print out the string and set the next event date)
  */
  public void doEvent() {
    System.out.println(toString());
    nextDate.incMonth(amount);
   }
}
