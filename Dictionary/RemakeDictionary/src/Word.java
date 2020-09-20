public class Word {
    private String word_target, word_explain;

    /**
     * constructor finction.
     */
    public Word() {
        word_explain = "";
        word_target = "";
    }

    /**
     * getter for getWord_explain.
     * @return Word type
     */
    public String getWord_explain() {
        return word_explain;
    }

    /**
     * getter for word_target .
     *
     * @return
     */
    public String getWord_target() {
        return word_target;
    }

    public void setWord_explain(String word_explain) {
        this.word_explain = word_explain;
    }

    public void setWord_target(String word_target) {
        this.word_target = word_target;
    }
}
