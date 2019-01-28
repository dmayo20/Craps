public class Die
{
  private int roll;
  private String[][] die;

  public Die()
  {
    roll = roll();
    die = new String[5][9];
    resetString();
  }

  public int roll()
  {
    roll = (int)((Math.random() * 6) + 1);
    return roll;
  }
  public int getRoll()
  {
    return roll;
  }
  public void resetString()
  {
    for (int i = 0; i < die.length; i++)
    {
      for (int j = 0; j < die[0].length; j++)
      {
        die[i][j] = " ";
      }
    }
    for (int i = 0; i < die.length; i++)
    {
      for (int j = 0; j < die[0].length; j++)
      {
        if (i == 0 || i == die.length - 1)
        {
          if (j == 0 || j == die[0].length - 1)
          {
            die[i][j] = "+";
          }
          else
          {
            die[i][j] = "-";
          }
        }
        else
        {
          if (j == 0 || j == die[0].length - 1)
          {
            die[i][j] = "|";
          }
        }
      }
    }

  }
  public String toString()
  {
    String a = "";
    resetString();
    if (roll == 1)
    {
      die[2][4] = "*";
    }
    else if (roll == 2)
    {
      die[1][2] = "*";
      die[3][6] = "*";
    }
    else if (roll == 3)
    {
      die[1][2] = "*";
      die[2][4] = "*";
      die[3][6] = "*";
    }
    else if (roll == 4)
    {
      die[1][2] = "*";
      die[1][6] = "*";
      die[3][2] = "*";
      die[3][6] = "*";
    }
    else if (roll == 5)
    {
      die[1][2] = "*";
      die[1][6] = "*";
      die[2][4] = "*";
      die[3][2] = "*";
      die[3][6] = "*";
    }
    else if (roll == 6)
    {
      die[1][2] = "*";
      die[1][6] = "*";
      die[2][2] = "*";
      die[2][6] = "*";
      die[3][2] = "*";
      die[3][6] = "*";
    }
    for (int i = 0; i < die.length; i++)
    {
      for (int j = 0; j < die[0].length; j++)
      {
        a += die[i][j];
      }
      a += "\n";
    }
    return a;

  }
}
