/**
Class that extends month in order to show payments that have a set amount of repitions
*/
public class EndMonth extends Month
{
  /**
  Saves how many more months need to be paid for
  */
  private int monthsToDo;

  /**
  Constructor for the EndMonth class. Only extra variabl is for the monthsToDo
  */
  public EndMonth(MyDate d, String i, int a, int b) {
    super(d,i,a);
    monthsToDo = b;
  }

  /**
  ifEventHappen method for the EndMonth class. Uses the same ifEventHappen method in the upper level class but
  checks if there are months left to make payments on (or get income)
  */
  public boolean ifEventHappen(MyDate d) {
    boolean check = false;
    if(super.ifEventHappen(d))
    {
      if(monthsToDo != 0)
        check = true;
    }
    return check;
  }


  /**
  Method that check when all of the monthly payments have been paid. When
  the monthsToDo variable has reached 0, then you know that all of the months
  have been paid.
  */
  public boolean doneCheck(){
    return monthsToDo == 0;
  }


  /**
  toString method for this class.
  */
  public String toString() {
    return super.toString();
  }

}
