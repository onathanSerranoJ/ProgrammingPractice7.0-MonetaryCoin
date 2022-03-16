import java.util.Random;
public class Coin
{
   public int face;
    public Coin(String face)
    {
        flip();
    }
    public void flip()
    {
         face = (int)(Math.random()*2);
    }
    public boolean isHeads()
    {
        return(face == 1);
    }
    public String toString()
    {
        String faceName;
        if(face == 1)
        {
            faceName = "Heads";
        }
        else
        {
            faceName = "Tails";
        }
        return "The face of the coin is: " + faceName;
    }
}
