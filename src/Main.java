import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> myArrList = new ArrayList<>();
         //myArrList.add("Some String");
         //myArrList.add("Another String");
         //myArrList.add("And Another");

         //for(String f : myArrList) {
         //    System.out.println(f);
         //}

         //for(int x = 0; x < myArrList.size(); x++) {
         //    System.out.println(myArrList.get(x));
         //}

         //myArrList.set(0, "First String");
         //System.out.println((myArrList.get(0)));

         //myArrList.add(1, "Some String");

        //for(String f : myArrList) {
        //    System.out.println(f);
        //}
        myArrList.add("0 - Eggs");
        myArrList.add("1 - Milk");
        myArrList.add("2 - Strawberries");
        myArrList.add("3 - Ham");
        myArrList.add("4 - Cookies");
        myArrList.add("5 - Cereal");
        myArrList.add("6 - Cinnamon");

        String action = "";
        Scanner in = new Scanner(System.in);
        boolean done = false;


        do {
            System.out.println("Groceries:");
            Menu();
            System.out.println(" ");
            action = SafeInput.getRegExString(in, "Choose an action", "[AaDdPpQq]");

            if (action.equalsIgnoreCase("A")) {
                String item = "";

                System.out.print("What would you like to add (don't forget its number: ");
                item = in.nextLine();

                myArrList.add(item);
                done = false;
            } else if (action.equalsIgnoreCase("D")) {
                    int num = 0;
                    num = SafeInput.getInt(in, "What # would you like to remove?");

                    myArrList.remove(num);
            } else if (action.equalsIgnoreCase("P")) {
                    System.out.println("Groceries:");
                    for(String f : myArrList) {
                        System.out.println(f);
                    }
                    System.out.println(" ");
                    done = false;
            } else {
                done = Quit(in, "");
            }
        }while(!done);

    }

    private static void Menu() {
        System.out.println("A - Add an item to the list");
        System.out.println("D - Delete an item from the list");
        System.out.println("P - Print (i.e. display) the list");
        System.out.println("Q - Quit the program");
    }

    /**
     * Get a [Y/N] confirmation from the user
     * @param pipe - Scanner instance to read the data System.in in most cases
     * @param prompt - input prompt msg for user does not need [Y/N]
     * @return - true for yes false for no
     */
    private static boolean Quit(Scanner pipe, String prompt) {
        boolean sure = false;
        boolean retVal = false;
        Scanner in = new Scanner(System.in);
        sure = SafeInput.getYNConfirm(in, "Are you sure you want to quit? ");

        return sure;
        }
}