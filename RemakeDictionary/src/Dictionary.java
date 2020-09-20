public class Dictionary {
    public static Word []wordArray;
    private int size;
    public Dictionary(){
        this.size=0;
        wordArray=new Word[100];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
