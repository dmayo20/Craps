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
  public String getRolls()
  {
    int total = d1.getRoll() + d2.getRoll();
    return "D1: " + d1.getRoll() + " D2: " + d2.getRoll() + " Total: " + total;
  }
  public String toString()
  {
    return d1.toString() + d2.toString();
  }
}
