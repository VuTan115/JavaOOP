public class DictionaryCommandline {
    public void showAllWords() {
        System.out.println("No\t|" + "English" + "\t\t|VietNamese ");
        for (int i = 1; i <= DictionaryManagement.arraySize; i++) {
            System.out.println(i + "\t|" + "" + Dictionary.wordArray[i].getWord_target() + "\t\t|=>" + Dictionary.wordArray[i].getWord_explain());
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
