import java.util.Scanner;

public class Craps
{
  static Scanner cin = new Scanner(System.in);
  public static void main(String[] args)
  {
    Dice d = new Dice();
    int roll;
    int point;
    int phase = 0;
    int game = -1;
    while (true)
    {
      System.out.println("Rolling...");
      roll = d.roll();
      System.out.println(d.getRolls());
      if (phase == 0)
      {
        if (roll == 7 || roll == 11)
        {
          System.out.println("You win!");
          game = 1;
        }
        else if (roll == 2 || roll == 3 || roll == 12)
        {
          System.out.println("You lose!");
          game = 0;
        }
        else if (roll == 4 || roll == 5 || roll == 6 || roll == 8 || roll == 9 || roll == 10)
        {
          point = roll;
          phase++;
        }
      }
      else
      {
        if (roll == point)
        {
          System.out.println("You win!");
          game = 1;
        }
        else if (roll == 7)
        {
          System.out.println("You lose!");
          game = 0;
        }
      }

      if (game > -1)
      {
        System.out.println("Play again? (y/n)");
        if (cin.next.equals("y"))
        {
          game = -1;
          phase = 0;
        }
        else
        {
          break;
        }
      }
    }
  }
}
