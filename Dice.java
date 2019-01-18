public class Dice
{
  Die d1;
  Die d2;

  public Dice()
  {
    d1 = new Die();
    d2 = new Die();
  }

  public int roll()
  {
    return d1.roll() + d2.roll();
  }
  public int getRolls()
  {
    return "D1: " + d1.getRoll() + "D2: " + d2.getRoll();
  }
}
