public class Die
{
  private int roll;

  public Die()
  {
    roll = roll();
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
}
