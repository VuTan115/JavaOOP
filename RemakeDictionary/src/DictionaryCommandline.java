public class DictionaryCommandline {
    public void showAllWords() {
        System.out.println("No\t|" + "English" + "\t\t\t\t|VietNamese ");
        for (int i = 0; i < 2; i++) {
            System.out.println(i + "\t|" + ""
                    + Dictionary.wordArray[i].getWord_target() +
                    "\t\t\t\t=>" +
                    Dictionary.wordArray[i].getWord_explain());
        }
    }

    public void dictionaryBasic() {

        DictionaryManagement pilot = new DictionaryManagement();
        pilot.insertFromCommandline();
        showAllWords();
    }

    public static void main(String[] args) {

        DictionaryCommandline pilot = new DictionaryCommandline();
        pilot.dictionaryBasic();

    }
}
