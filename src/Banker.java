public class Banker //driver class
{
    public static void main(String[]args)
    {
        System.out.println("Programming Practice 7.0 - Monetary Coin - Jonathan Serrano");

        //the coin can be flipped and has a value

        MonetaryCoin penny  = new MonetaryCoin(1,"Tails");
        MonetaryCoin penny2  = new MonetaryCoin(1,"Heads");
        MonetaryCoin dime  = new MonetaryCoin(10,"Tails");
        MonetaryCoin quarter  = new MonetaryCoin(25,"Tails");
        MonetaryCoin nickel  = new MonetaryCoin(5,"Heads");

        MonetaryCoin penny3  = new MonetaryCoin(1,"Tails");
        System.out.println(penny.toString());
        penny.flip();
        System.out.println(penny.toString());

        //I can add the values using a get statement
        //gives the number of coins as well
        System.out.println("You have " + MonetaryCoin.count + " coins");
        int sum = penny.getValue() + penny2.getValue() + penny3.getValue()
                + dime.getValue() + quarter.getValue() + nickel.getValue();
        System.out.println("The value of all your coins is: " + sum + " cents");



    }
}
