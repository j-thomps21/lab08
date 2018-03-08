import java.util.*;
import java.io.*;
import java.lang.*;

public class ParseFile
{
  public static void FileIO(Scanner sc, ArrayList<Event> all, Random rand)
  {
    Event a = null;
    MyDate eventStart = null;
    //int i, d, m, y;
    int amount = 0, monthAmt = 0;
    double prob = 0;
    String[] ind;
    String line, item;

    while(sc.hasNextLine())
    {
      line = sc.nextLine();
      ind = line.split(" ");


      eventStart = parseDate(ind[indexOf("start", ind) + 1]);
      item = searchItem(ind);

      if(line.contains("days"))
      {
        amount = Integer.parseInt(ind[1]);
        if(line.contains("prob"))
        {
          prob = Double.parseDouble(ind[indexOf("prob", ind)+1]);
          a = new ProbabilityDay(eventStart, item, amount, prob, rand);
        }
        else
        {
          a = new Day(eventStart, item, amount);
        }
      }
      else if(line.contains("months"))
      {
        amount = Integer.parseInt(ind[1]);
        if(line.contains("for"))
        {
          monthAmt = Integer.parseInt(ind[indexOf("for", ind)+1]);
          a = new EndMonth(eventStart, item, amount, monthAmt);
        }
        else
        {
          a = new Month(eventStart, item, amount);
        }
      }

      all.add(a);
    }
  }


  public static MyDate parseDate(String date)
  {
    String[] a = new String[3];
    int[] x = new int[3];
    a = date.split("/");
    for(int i = 0; i < a.length; i++)
      x[i] = Integer.parseInt(a[i]);
    return MyDate.makeDate(x[2], x[0], x[1]);
  }


  public static int indexOf(String a, String[] s)
  {
    int index = 0;
    for(int i = 0; i < s.length; i++)
    {
      if(s[i].equals(a))
      {
        index = i;
        break;
      }
    }
    return index;
  }


  public static String searchItem(String[] s)
  {
    boolean check = false;
    String a = "";
    for(int i = 0; i < s.length; i++)
    {
      if(s[i].equals("expense") || s[i].equals("income"))
      {
        check = true;
        a += s[i+1];
        i++;
        continue;
      }
      if(check == true)
        a += (" " + s[i]);
    }
    return a;
  }
}
