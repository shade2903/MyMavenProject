package HomeWorkVladimirHaiduk;


import HomeWorkVladimirHaiduk.UniqueWorldVocabulary.UniqueWordVocabulary;

public class MainApp {
    public static void main(String[] args) {
        UniqueWordVocabulary vocabulary = new UniqueWordVocabulary();
        vocabulary.addWord("test");
        vocabulary.addWord("test");
        vocabulary.addWord("word");
        vocabulary.addWord("answer");
        vocabulary.printVocabulary();
        System.out.println(vocabulary.getWordsCount());



    }
}
