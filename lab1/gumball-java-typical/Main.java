

public class Main {

        public static void main(String[] args) {
        System.out.println("singleQuarterGumballMachine Test");
        
        GumballMachine singleQuarterGumballMachine = 
        new singleQuarterGumballMachine(5);

        System.out.println(singleQuarterGumballMachine);

        singleQuarterGumballMachine.insertQuarter( 25 );
        singleQuarterGumballMachine.turnCrank();

        System.out.println(singleQuarterGumballMachine);

        singleQuarterGumballMachine.insertQuarter( 25 );
        singleQuarterGumballMachine.turnCrank();
        singleQuarterGumballMachine.insertQuarter( 25 );
        singleQuarterGumballMachine.turnCrank();
        singleQuarterGumballMachine.insertQuarter( 10 );
        singleQuarterGumballMachine.turnCrank();
        singleQuarterGumballMachine.insertQuarter( 25 );
        singleQuarterGumballMachine.turnCrank();

        System.out.println(singleQuarterGumballMachine);
        
        singleQuarterGumballMachine.insertQuarter( 25 );
        singleQuarterGumballMachine.turnCrank();
        singleQuarterGumballMachine.insertQuarter( 25 );
        singleQuarterGumballMachine.turnCrank();
        
        System.out.println("doubleQuarterGumballMachine Test");
        
        GumballMachine doubleQuarterGumballMachine = 
        new doubleQuarterGumballMachine(5);

        System.out.println(doubleQuarterGumballMachine);

        doubleQuarterGumballMachine.insertQuarter( 25 );
        doubleQuarterGumballMachine.turnCrank();

        System.out.println(doubleQuarterGumballMachine);

        doubleQuarterGumballMachine.insertQuarter( 25 );
        doubleQuarterGumballMachine.turnCrank();
        doubleQuarterGumballMachine.insertQuarter( 25 );
        doubleQuarterGumballMachine.turnCrank();
        doubleQuarterGumballMachine.insertQuarter( 10 );
        doubleQuarterGumballMachine.turnCrank();
        doubleQuarterGumballMachine.insertQuarter( 25 );
        doubleQuarterGumballMachine.turnCrank();

        System.out.println(doubleQuarterGumballMachine);
        
        doubleQuarterGumballMachine.insertQuarter( 25 );
        doubleQuarterGumballMachine.turnCrank();
        doubleQuarterGumballMachine.insertQuarter( 25 );
        doubleQuarterGumballMachine.turnCrank();
        
        System.out.println("allCoinsGumballMachine Test");
        
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
