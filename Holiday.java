# alphabet
import java.util.*;
import java.io.*;
public class Holiday
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String day=sc.nextLine();
        String day1=day.toLowerCase();
    if(day1.equals("sunday"))
    {
      System.out.println("False");
    }
    else
    if((day1.equals("monday"))||(day1.equals("tuesday"))||(day1.equals("wednesday"))||(day1.equals("thursday"))||(day1.equals("friday"))||(day1.equals("saturday")))
    {
      System.out.println("true");
    }
    else
    System.out.println("INVALID INPUT");
  }
}
