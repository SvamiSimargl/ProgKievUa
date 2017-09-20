package lesson3.blinov_ch4_vA_1;

//Создать  объект  класса Текст,  используя  классы  Предложение, Слово. Методы: дополнить текст, вывести на консоль текст, заголовок текста.

public class TextRunner {
    public static void main(String[] args) {
        Text text = new Text();

        text.addTitle("У лукоморья дуб зелёный");
        text.addText(new Sentence(new Word("У"), new Word("лукоморья"), new Word("дуб"), new Word("зелёный")));
        text.addText(new Sentence(new Word("Златая"), new Word("цепь"), new Word("на"), new Word("дубе"), new Word("том")));
        text.showTitle();
        text.printText();


    }
}
