/**
 * database.
 */
public class Dictionary {
    private int size;
    private static Word[] words;


    /**
     * constructor fn.
     */
    public Dictionary() {

        words = new Word[100];
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    /**
     * setter...
     *
     * @param words-Word type.
     */
    public void setWords(Word[] words) {
        words = words;

    }

    /**
     * getter.
     *
     * @return Word type
     */
    public Word[] getWords() {
        return words;
    }


}
