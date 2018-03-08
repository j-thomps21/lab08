/**
*/
import java.util.*;
import java.io.*;
import java.lang.*;
public class Lab08
{
  public static void main(String[] args){
    if(args.length < 2){
      System.out.println("usage: java Lab08 <infilename> <numDays>");
      System.exit(1);
    }

    Random rand;
    if (args.length==3)
      rand = new Random (Long.parseLong(args[2]));
    else 
      rand = new Random (System.currentTimeMillis());
    
    Scanner sc = null;
    try {
      sc = new Scanner(new FileReader(args[0]));
    } catch(IOException e) {
      e.printStackTrace(); System.exit(1);
    }

    Event a = null;
    MyDate startDay, newStart = null;
    int i, d, m, y;
    String line, item = "";
    String[] ind, day;
    ArrayList<Event> all = new ArrayList<Event>();
    while(sc.hasNextLine()){
      line = sc.nextLine();
      ind = line.split(" ");

      if(line.contains(" days ")){
        if(line.contains(" prob ")){
          newStart = splitDay(ind[4]);
          for(i = 8; i < ind.length; i++)
            item += ind[i];
          double b = Double.parseDouble(ind[6]);
          int c = Integer.parseInt(ind[1]);
          a = new ProbabilityDay(newStart, item, ind[7], c, b, rand);
        }
        else{
          newStart = splitDay(ind[4]);
          for(i = 6; i < ind.length; i++)
            item += ind[i];
          int c = Integer.parseInt(ind[1]);
          System.out.println(c + " ");
          a = new Day(newStart, item, ind[5], c);
        }
      }
      /*else if(line.contains(" months ") {
        if(line.contains(" for ")
          a = new EndMonth(  );
        else 
          a = new Month(  );
      }*/
      all.add(a);
    } 
      


    startDay = MyDate.makeDate(2017,1,1);   
    
    int simDays = Integer.parseInt(args[1]);
    for(i = 0; i < simDays; i++){
      System.out.print(startDay +": ");
      for(int j = 0; j < all.size(); j++){
        all.get(j).doEvent();
      }
      System.out.println();
      

      startDay.incDay(1);
    }
  }
  public static MyDate splitDay(String date){
    String[] b = new String[3];
    int a[] = new int[3];
    b = date.split("/");
    for(int i = 0; i < a.length; i++)
      a[i] = Integer.parseInt(b[i]);
    return MyDate.makeDate(a[2], a[0], a[1]);  

  }

}
