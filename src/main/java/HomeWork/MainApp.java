package HomeWork;

import HomeWork.CreditCard.CreditCard;
import HomeWork.MagicBall.MagicBall;
import HomeWork.UniqueWorldVocabulary.UniqueWordVocabulary;

public class MainApp {
    public static void main(String[] args) {
MagicBall magicBall = new MagicBall();
magicBall.getAnswer();
UniqueWordVocabulary vocabulary = new UniqueWordVocabulary();
vocabulary.addWord("slovo");
vocabulary.addWord("pesnya");
vocabulary.addWord("rota");
vocabulary.addWord("slovo");
vocabulary.addWord("var");
vocabulary.printVocabulary();








    }
}
