import java.util.Scanner;

/**
 * creat database.
 */
public class DictionaryManagement {

    /**
     * Insert Function.
     */

    public void insertFromCommandline() {

        String word_targetFake = "";
        String word_explainFake = "";


        Scanner input = new Scanner(System.in);


        System.out.println("How many Word you wanna translate? ");
        System.out.print(">");
        int size = input.nextInt();
        Dictionary wordsArray = new Dictionary();

        wordsArray.setSize(size);
        System.out.println(wordsArray.getSize());
        System.out.println(wordsArray.getWords()[0]);
        Word creat = new Word();

        for (int i = 0; i < 100; i++) {
            System.out.println(wordsArray.getWords()[i]);
        }
        //type english words.
        for (int i = 0; i < size; i++) {
            System.out.print("The " + i + " English " + "word ");
            word_targetFake = input.next();
            creat.setWord_target(word_targetFake);
            wordsArray.getWords()[i] = creat;
        }
        //type meaning of words
        for (int i = 0; i < size; i++) {
            System.out.println("Explain meaning of the " + i + " word ");
            word_explainFake = input.next();
            creat.setWord_explain(word_explainFake);
            wordsArray.getWords()[i] = creat;
        }


    }


}
