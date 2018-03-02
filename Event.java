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
    return date + ": " + item;
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

<<<<<<< HEAD
=======
  /**
  */
  public abstract boolean ifEventHappen();

  /**
  */
  public abstract void doEvent();
>>>>>>> c02fd9fdc943c15a2101bceba89682f99d932c48
}
