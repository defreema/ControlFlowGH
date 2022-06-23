public class IfElse {

    public IfElse() {
    }

    //this method is public (seen by entire project), this method returns a boolean (true/false),
    // main method is checkStringLength
    public boolean checkStringLength(String input) {

        //condition says - if the length of the incoming string "input" has > 7 chars it will return true
        if (input.length() > 7) {
            return true;
        } else {

            return false;
        }

    }

    //note - we do not need this return statement any longer. this is because all possible conditions have been met.
    //return false;
    public String printTStringsOnly(String input) {

        //index 0 will ALWAYS be first index in an array
        //here we made the var "firstLetter" equal to the charAt index 0 of our input
        char firstLetter = input.charAt(0);
        //here we declared the boolean check, but didn't give a value
        boolean check;

        if(String.valueOf(firstLetter).equals("T") || String.valueOf(firstLetter).equals("t")){

            return input + " begins with the letter 't' !";

        }else{

            //here we are giving check a value
            check = false;
        }

        return "Did this word begin with the letter t ? : " + check;
    }

}