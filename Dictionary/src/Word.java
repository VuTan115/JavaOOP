/**
 * Database platform.
 */
public class Word {


    private String word_target, word_explain;

    /**
     * constructor fn.
     */
    public Word() {
        word_target = "";
        word_explain = "";
    }

    /**
     * getter for word_explain.
     *
     * @return word_explain
     */
    public String getWord_explain() {
        return this.word_explain;
    }

    /**
     * getter for word_target.
     *
     * @return word_explain
     */
    public String getWord_target() {
        return this.word_target;
    }

    /**
     * setter for word_explain.
     *
     * @param word_explain-string type
     */
    public void setWord_explain(String word_explain) {
        this.word_explain = word_explain;
    }

    /**
     * setter for word_target.
     *
     * @param word_target-string type
     */
    public void setWord_target(String word_target) {
        this.word_target = word_target;
    }
}
