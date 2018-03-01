/**
*/
public class EndMonth extends Month
{
  private int monthsToDo;

  public EndMonth(MyDate d, String i, String t, int a, int b) {
    super(d,i,t,a);
    monthsToDo = b;
  }

  public boolean doneCheck(){
    return monthsToDo == super.getTotal();
  }

  public String toString() {
    return super.toString();
  }
  
}
