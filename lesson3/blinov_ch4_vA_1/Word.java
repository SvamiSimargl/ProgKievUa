package lesson3.blinov_ch4_vA_1;


public class Word {

    private String word = "";

    public Word(String... word) {
        for (String s : word) {
            this.word += s;
        }
    }
    @Override
    public String toString() {
        return word;
    }
}
