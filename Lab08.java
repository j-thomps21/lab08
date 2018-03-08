import java.util.*;
import java.io.*;
import java.lang.*;

/**
*/
public class Lab08
{
  public static void main(String[] args)
  {
    if(args.length < 2)
    {
      System.out.println("usage: java Lab08 <infilename> <numDays>");
      System.exit(1);
    }

    Random rand;
    if(args.length == 3)
      rand = new Random (Long.parseLong(args[2]));
    else
      rand = new Random(System.currentTimeMillis());

    Scanner sc = null;
    try {
      sc = new Scanner(new FileReader(args[0]));
    } catch(IOException e) {
      e.printStackTrace();
      System.exit(1);
    }


    Event a = null;
    MyDate eventStart = null;
    int i, d, m, y;
    String line, item;
    String[] ind;
    ArrayList<Event> all = new ArrayList<Event>();
    while(sc.hasNextLine())
    {
      line = sc.nextLine();
      ind = line.split(" ");


    }
  }
}
