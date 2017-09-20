package lesson3.blinov_ch4_vA_1;

public class Text {

    private String text = "";
    private String title;

    public void addTitle(String title) {
        this.title = title;
    }
    public void addText( Sentence... sentence) {
        for (Sentence sentence1 : sentence) {
            text += sentence1.toString() + " ";
        }
    }

    public void printText() {
        System.out.println(text);
    }

    public void showTitle() {
        System.out.println(title);
    }

    @Override
    public String toString() {
        return text;
    }
}
