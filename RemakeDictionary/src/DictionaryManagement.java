import java.util.Scanner;

public class DictionaryManagement {


    public void insertFromCommandline() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many Word you wanna translate? ");
        System.out.print(">");
        int size = input.nextInt();
        String fakeWord_target = "";
        String fakeWord_explain = "";


        Dictionary array = new Dictionary();
        array.setSize(size);
        for (int i = 0; i < size; i++) {
            Dictionary.wordArray[i] = new Word();
        }
        input.nextLine();
        //type english and meaning of words.
        for (int i = 0; i < size; i++) {
            Word creat = new Word();

            System.out.println("The " + i + " English " + "word ");
            fakeWord_target = input.nextLine();

            //input.nextLine();

            System.out.println("Explain meaning of the " + i + " word ");
            fakeWord_explain = input.nextLine();

            creat.setWord_target(fakeWord_target);
            creat.setWord_explain(fakeWord_explain);
            Dictionary.wordArray[i].setWord_explain(creat.getWord_explain());
            Dictionary.wordArray[i].setWord_target(creat.getWord_target());
        }


    }
}
