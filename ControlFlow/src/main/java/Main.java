public class Main {

    public static void main (String [] args){
        /*
                IF ELSE
         */

        //make an instance of ("instantiate") our IfElse statement after creating class's code
        // because THE METHOD IS NOT STATIC!
        IfElse ifelse = new IfElse();

        String newString = "Hello World";
        System.out.println(ifelse.checkStringLength("Tiffany"));
        System.out.println(ifelse.printTStringsOnly(newString));


        /*
                FOR LOOPS
         */

        //notice we did not have to make an instance of our ForLoops class in order
        // to invoke/call these methods - this is because they are static!

        //here we are creating our String array right in the parameter of our method
        ForLoops.printAssociatesNames(new String[] {"Jo Jo", "CJ", "DeeAnne", "David", "Shane"});

        //the other way is to declare the array first. assign it to a var and use in the method parameters
        String[] associates = {"Shaquanna", "Mark", "Tyler", "Eric", "Janga", "Li"};
        System.out.println(ForLoops.printTotalAssociatesNamesCount(associates));

        /*
                WHILE LOOPS
         */

        WhileLoops.printFirst3Indexes(associates);

        /*
                DO WHILE LOOPS - ask for forgiveness instead of permission
         */

        DoWhile doWhileClass = new DoWhile();

        //here we had to make an instance if the doWhile class
        //in order for us to invoke this method
        //Also not the method returns void
        //so, we are not using a System.out.println here
        //however we'll still see a print message because
        // there is a System.out.println in the actual method

        doWhileClass.printValueIfTrue();

        /*
                SWITCH STATEMENTS
         */

        SwitchStatements switchStatements = new SwitchStatements();
        switchStatements.gradeCalculator(45);
        //we didn't add a condition/case for a grade this low, so the compiler uses the default "This grade is too low"
    }
}
