import java.util.Scanner;
public class Driver {
    public static void main(String [] args){
        //Create Composition object
        Composition comp = new Composition();

        //Create Scanner object
        Scanner scanner = new Scanner(System.in);

        //Show menu
        Menu();
    }

    static void Menu() {
        System.out.println("This program allows a user to enter a written composition in pieces:");
        System.out.println("1. Enter a new sentence");
        System.out.println("2. Enter a new paragraph");
        System.out.println("3. Print the composition");
        System.out.println("4. Quit");
        getInput();
    }

    static int getInput() {
        int input;

        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();

        switch(input){
            case 1:
                System.out.println("Your menu selection is: 1");
                System.out.println(" ");
                System.out.println("Enter a sentence:");
                // comp.addSentence(scanner.nextLine());
                Menu();
                break;
            case 2:
                System.out.println("Your menu selection is: 2");
                System.out.println(" ");
                // comp.addParagraph(scanner.nextLine());
                Menu();
                break;
            case 3:
                System.out.println("Your menu selection is: 3");
                System.out.println(" ");
                // comp.printComposition();
                Menu();
                break;
            case 4:
                System.out.println("Your menu selection is: 4");
                System.out.println(" ");
                break;
            default:
                System.out.println("Invalid input");
                Menu();
                break;
        }
        return input;
    }


}
