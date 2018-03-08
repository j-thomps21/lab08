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

    Event a;
    MyDate startDay, newStart;
    int i, d, m, y;
    String line;
    String[] ind, day;
    ArrayList<Event> all = new ArrayList<Event>();
    while(sc.hasNextLine()){
      line = sc.nextLine();
      ind = line.split(" ");

      if(line.contains(" days "){
        if(line.contains(" prob "){
          newStart = splitDay(ind[4]);
         
          a = new ProbabilityDay(newStart, ind[1],   );
        else
          a = new Day( );
      }
      else if(line.contains(" months ") {
        if(line.contains(" for ")
          a = new EndMonth(  );
        else 
          a = new Month(  );
      }
      all.add(a);
    } 
      


    start = MyDate.makeDate(2017,1,1);   
    
    int simDays = Integer.parseInt(args[1]);
    for(i = 0; i < simDays; i++){
      

      start.incDay(1);
    }
  }
  public static MyDate splitDay(String date){

  }

}
