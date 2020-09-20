/**
 * using to control.
 */
public class DictionaryCommandline extends DictionaryManagement{
    /**
     * Show All Words.
     */
//    public void showAllWords() {
//
//        System.out.println("No\t|" + " |English" + "\t\t\t\t|VietNamese ");
//        for (int i = 0; i <2; i++) {
//            System.out.println(i + "\t|" + " |"
//                    + wordsArray.getWords()[i].getWord_target() +
//                    "\t\t|" +
//                    wordsArray.getWords()[i].getWord_explain());
//        }
//
//    }
    public  void dictionaryBasic(){

    }


    /**
     * cónstructor fn.
     */
    public DictionaryCommandline() {

    }

    /**
     * main function.
     *
     * @param args-parameter using commandline?.
     */
    public static void main(String[] args) {

        DictionaryManagement control = new DictionaryManagement();

        control.insertFromCommandline();

    }
}
  