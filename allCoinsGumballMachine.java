
/**
 * Write a description of class AllCoinsGumballMachine here.
 *
 * @author Prachi Jani
 * @version Feb'09
 */
import java.util.*;
public class allCoinsGumballMachine extends GumballMachine
{
    public allCoinsGumballMachine(int size)
    {
        super(size, 50, new ArrayList<Integer>(Arrays.asList(5,10,25)));  
    }
}
