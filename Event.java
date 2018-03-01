/**
*/
public abstract class Event
{
  /**
  */
  private MyDate date;
  private String item;
  private String type;

  /**
  */
  public Event(MyDate d, String i, String t)
  {
    date = d;
    item = i;
    type = t;
  }

  /**
  */
  public String toString()
  {
    return date + " " + type + " " + item;
  }

  /**
  */
  public String getItem()
  {
    return item;
  }

  /**
  */
  public MyDate getDate()
  {
    return date;
  }

  /**
  */
  public abstract boolean ifEventHappen();

  /**
  */
  public abstract void doEvent();
}
