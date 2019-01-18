public class Die
{
  //private int d1;
  //private int d2;
  private int total;
  private int point;
  private int lose[];
  private int win[];

  public Die()
  {
    lose[] = {2,3,12};
    win[] = {7,11};
  }

  public int roll(int phase)
  {
    if (phase == 0)
    {
      total = (int)((Math.random() * 6) + 1) + (int)((Math.random() * 6) + 1);
    }
    else if (phase == 1)
    {

    }
  }
}
