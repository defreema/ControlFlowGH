public class ForLoops {

    public ForLoops(){

    }

    public static void printAssociatesNames(String[] names){
        //strings are made of different characters
        //arrays are made of different types (char, nums, etc)

        //here we have our basic for loop
        for(int i = 0; i< names.length ;i++){
            System.out.println(names[i]);
        }

    }

    public static int printTotalAssociatesNamesCount(String[] associatesArray){
        int counter = 0;

        //here we have an enhanced ForLoop (because you don't have to do the "int i"; all you need is for and
        // what strings the data type is made of

        for(String singleAssociate: associatesArray){
            //here we are adding the length or count of each/all string in the string array to our counter

            counter += singleAssociate.length();

        }

        //after it has completely gone through the entire array, we will return counter
        return counter;
    }

}
