import java.util.*;
public class GumballMachine 
{

    protected int num_gumballs;
    protected boolean has_quarter;
    protected int min_amount;
    protected int balance_amount;
    protected ArrayList<Integer> acceptedCoins;

    public GumballMachine( int size, int min_amount, 
    ArrayList<Integer> acceptedCoins)
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
        this.min_amount = min_amount;
        this.balance_amount = 0;
        this.acceptedCoins = new ArrayList<Integer>(acceptedCoins);
    }

    public void insertQuarter(int coin)
    {
        System.out.println("Inserted Coin : " + coin);
        if ( !has_quarter )
        {
            if(acceptedCoins.contains(coin))
            {
              balance_amount += coin ;
              if(balance_amount >= min_amount)
              {
                  has_quarter = true;
              }
            }
            else
            {
                System.out.println("Invalid Coin.Please collect your coin:" 
                + coin + "cents");
            }
        }
        else
        {
            System.out.println("You can not insert another coin.");
        }
    }
    
    public void turnCrank()
    {
        System.out.println("Crank Turned");
        if ( has_quarter )
        {
            if ( num_gumballs > 0 )
            {
                num_gumballs-- ;
                has_quarter = false ;
                balance_amount -= min_amount;
                System.out.println( "Thanks for your quarter. Gumball Ejected!" ) ;
                if (balance_amount>0)
                {
                    System.out.println("Please collect the balance amount:" 
                    + balance_amount + "cents");
                }
            }
            else
            {
                System.out.println( "No More Gumballs!" ) ;
                ejectCoin();
                balance_amount = 0;
                has_quarter = false;
            }
        }
        else 
        {
            System.out.println( "Please pay" + min_amount 
            + "cents first. Total paid : " +
            balance_amount + "cents, Remaining: " + 
            (min_amount - balance_amount)+ "cents" ) ;
        }        
    }
    
    public void ejectCoin()
    {
        System.out.println("Please collect your coin(s):" + balance_amount + "cents");
    }
}
