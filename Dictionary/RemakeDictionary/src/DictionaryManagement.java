import java.util.Scanner;

/**
 * Manager the dictionary.
 */
public class DictionaryManagement {

    public static int arraySize;

    /**
     * insert function .
     */
    public void insertFromCommandline() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many Word you wanna translate? ");
        System.out.print(">");
        arraySize = input.nextInt();
        Dictionary array = new Dictionary(arraySize + 1);
        for (int i = 1; i <= DictionaryManagement.arraySize; i++) {
            Dictionary.wordArray[i] = new Word();
        }
        input.nextLine();
        for (int i = 1; i <= DictionaryManagement.arraySize; i++) {
            Word creat = new Word();
            System.out.println("The " + i + " English " + "word ");
            creat.setWord_target(input.nextLine());
            System.out.println("Explain meaning of the " + i + " word ");
            creat.setWord_explain(input.nextLine());
            Dictionary.wordArray[i].setWord_explain(creat.getWord_explain());
            Dictionary.wordArray[i].setWord_target(creat.getWord_target());
        }


    }
}
