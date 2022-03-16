public class MonetaryCoin extends Coin
{
    // Instance variables
    private int value;//value in cents;
    public static int count;
    // Constructor
    public MonetaryCoin(int value, String face)
    {
        super(face);
        super.flip();
        this.value = value;
        count++;
    }


    // Brain Method
    public int getValue()
    {
        return value;
    }

    // toString
    public String toString()
    {
        String output = super.toString() +"\nThe value of the coin: " + value;
        return output;
    }

}
