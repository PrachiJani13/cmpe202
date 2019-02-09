

public class Main {

        public static void main(String[] args) {
        System.out.println("\n-----Testing aQuarterGumballMachine");
        
        GumballMachine aQuarterGumballMachine = 
        new aQuarterGumballMachine(5);

        System.out.println(aQuarterGumballMachine);

        aQuarterGumballMachine.insertQuarter( 25 );
        aQuarterGumballMachine.turnCrank();

        System.out.println(aQuarterGumballMachine);

        aQuarterGumballMachine.insertQuarter( 25 );
        aQuarterGumballMachine.turnCrank();
        aQuarterGumballMachine.insertQuarter( 25 );
        aQuarterGumballMachine.turnCrank();
        aQuarterGumballMachine.insertQuarter( 10 );
        aQuarterGumballMachine.turnCrank();
        aQuarterGumballMachine.insertQuarter( 25 );
        aQuarterGumballMachine.turnCrank();

        System.out.println(aQuarterGumballMachine);
        
        aQuarterGumballMachine.insertQuarter( 25 );
        aQuarterGumballMachine.turnCrank();
        aQuarterGumballMachine.insertQuarter( 25 );
        aQuarterGumballMachine.turnCrank();
        
        System.out.println("\n-----Testing twoQuarterGumballMachine");
        
        GumballMachine twoQuarterGumballMachine = 
        new twoQuarterGumballMachine(5);

        System.out.println(twoQuarterGumballMachine);

        twoQuarterGumballMachine.insertQuarter( 25 );
        twoQuarterGumballMachine.turnCrank();

        System.out.println(twoQuarterGumballMachine);

        twoQuarterGumballMachine.insertQuarter( 25 );
        twoQuarterGumballMachine.turnCrank();
        twoQuarterGumballMachine.insertQuarter( 25 );
        twoQuarterGumballMachine.turnCrank();
        twoQuarterGumballMachine.insertQuarter( 10 );
        twoQuarterGumballMachine.turnCrank();
        twoQuarterGumballMachine.insertQuarter( 25 );
        twoQuarterGumballMachine.turnCrank();

        System.out.println(twoQuarterGumballMachine);
        
        twoQuarterGumballMachine.insertQuarter( 25 );
        twoQuarterGumballMachine.turnCrank();
        twoQuarterGumballMachine.insertQuarter( 25 );
        twoQuarterGumballMachine.turnCrank();
        
        System.out.println("\n-----Testing AllCoinsGumballMachine");
        
        GumballMachine allCoinsGumballMachine = 
        new allCoinsGumballMachine(5);

        System.out.println(allCoinsGumballMachine);

        allCoinsGumballMachine.insertQuarter( 25 );
        allCoinsGumballMachine.turnCrank();

        System.out.println(allCoinsGumballMachine);

        allCoinsGumballMachine.insertQuarter( 25 );
        allCoinsGumballMachine.turnCrank();
        allCoinsGumballMachine.insertQuarter( 25 );
        allCoinsGumballMachine.turnCrank();
        allCoinsGumballMachine.insertQuarter( 10 );
        allCoinsGumballMachine.turnCrank();
        allCoinsGumballMachine.insertQuarter( 25 );
        allCoinsGumballMachine.turnCrank();

        System.out.println(allCoinsGumballMachine);
    }
}
