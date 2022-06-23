public class SwitchStatements {

    public void gradeCalculator(int grade){

        switch (grade/10){

            case 10:
                System.out.println("A++"); //logic to be executed
                break;
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5:
                System.out.println("F");
                break;
            default:
                System.out.println("This grade is too low");
        }


    }


}
