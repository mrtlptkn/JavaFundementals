package A2_DecisionStructures;

import java.util.Scanner;

public class DecisionStructuresMain {

    public static void main(String[] args) {

        // ifStatements();
        // switchStatements();
        // switchStatements02();
        ternaryIfStatements();

    }

    public  static  void ifStatements() {
        //TODO Create an if statement that checks if a variable of type int is greater than 10
        int myInt; //TODO Create a variable of type int and assign it the value from user input

        Scanner scanner = new Scanner(System.in); // read value from input
        System.out.print("Enter an integer: "); // get integer input from user
        myInt = scanner.nextInt(); // assign input value to variable


        // eğer kullanıcının girdiği değer 10 dan büyükse ekrana değişken değeri 10 dan büyüktür yaz.
        if (myInt > 10) {
            System.out.println("The variable is greater than 10.");
        } else {
            System.out.println("The variable is not greater than 10.");
        }
    }

    public static void nestedIfStatements() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int myInt = scanner.nextInt();

        // nestedIfStatements
        if(myInt >0) {
            if(myInt % 2 == 0){
                if(myInt > 10){
                    System.out.println("The variable is greater than 10 and even.");
                } else {
                    System.out.println("The variable is greater than 0 and even.");
                }
            } else  {
                System.out.println("The variable is greater than 0 and odd.");
            }

        } else {
            System.out.println("The variable is not greater than 0.");
        }


        // 2nd way
        if(myInt % 2 ==0 && myInt > 10){
            System.out.println("The variable is greater than 10 and even.");
        } else {
            System.out.println("The variable is not greater than 10 and negative digit and odd.");
        }

    }

    public static void switchStatements() {
        //TODO Create a switch statement that checks the value of a variable of type String and prints a message based on the value
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String dayOfWeek = scanner.nextLine();

        // not: eğer 3 veya daha fazla koşul varsa, bunu if else if else zinciri ile yazmak yeriine switch case
        // kullanımı daha idealdir. (daha performanslı)

        // if  ->
        // else if ->
        // else ->

        switch (dayOfWeek.toLowerCase()) {
            case "monday":
                System.out.println("It's Monday, the start of the week!");
                break;
            case "tuesday":
                System.out.println("It's Tuesday, the second day of the week!");
                break;
            case "wednesday":
                System.out.println("It's Wednesday, the middle of the week!");
                break;
            case "thursday":
                System.out.println("It's Thursday, almost the weekend!");
                break;
            case "friday":
                System.out.println("It's Friday, the last day of the workweek!");
                break;
            case "saturday":
                System.out.println("It's Saturday, time to relax!");
                break;
            case "sunday":
                System.out.println("It's Sunday, enjoy your day off!");
                break;
            default:
                System.out.println("Invalid input. Please enter a valid day of the week.");
        }
    }

    public static   void switchStatements02() {

        //TODO Create a switch statement that checks the value of a variable of type String and prints a message based on the value
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month of the year: ");
        String monthOfYear = scanner.nextLine();

        // and değil or gibi davranır.
        switch (monthOfYear) {
            case "January":
            case "February":
            case "December":
                System.out.println("It's a winter month!");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("It's a spring month!");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("It's a summer month!");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("It's a fall month!");
                break;
            default:
                System.out.println("Invalid input. Please enter a valid month of the year.");
        }


    }

    public  static  void ternaryIfStatements(){
        // sample ternaryif

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int myInt = scanner.nextInt();

        String result = (myInt > 15) ? "Greater than 15" : "less than 15";
        System.out.println(result);
    }


}
