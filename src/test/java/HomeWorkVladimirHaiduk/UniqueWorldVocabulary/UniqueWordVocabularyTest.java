package HomeWorkVladimirHaiduk.UniqueWorldVocabulary;

import HomeWorkVladimirHaiduk.CreditCard.CreditCard;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class UniqueWordVocabularyTest {

    UniqueWordVocabulary vocabulary = new UniqueWordVocabulary();

    @Test
    public void addWord() {int expected1 = 1;
        int expected2 = 3;
        vocabulary.addWord("test");
        vocabulary.addWord("test");
        assertEquals(expected1, vocabulary.getWordsCount());
        vocabulary.addWord("word");
        vocabulary.addWord("text");
        assertEquals(expected2,vocabulary.getWordsCount());
    }

    @Test
    public void getWordsCount() {
        int expected = 0;
        assertEquals(0,vocabulary.getWordsCount());
    }
}