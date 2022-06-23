public class WhileLoops {

    public WhileLoops(){

    }

    //public is accessible everywhere, static declares method, voids has no return
    public static void printFirst3Indexes(String[] associates){

        //we are starting our counter at 2; 2 is the 3rd index in an array (0 is always first)

        //this syntax printed names backwards

/*        int count = 2;
        while(count >= 0){
            System.out.println(associates[count]);
            count--;
        }*/

        //the other way to do this is to keep the order
        int count = 0;
        while (count < 3){
            System.out.println(associates[count]);
            count++;
        }

    }

}
