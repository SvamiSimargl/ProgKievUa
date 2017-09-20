package lesson3.blinov_ch4_vA_1;

public class Sentence {

    private String sentence = "";

    public Sentence(Word... word) {
        for (Word word1 : word) {
            sentence += word1 + " ";
            if (word1.equals(",") || word1.equals("-")) {
                sentence += word1;
            }
        }
        sentence = sentence.trim().concat(".");
    }

    @Override
    public String toString() {
        return sentence;
    }
}
