package HomeWorkVladimirHaiduk.UniqueWorldVocabulary;

import junit.framework.TestCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UniqueWordVocabularyTest extends TestCase {
    UniqueWordVocabulary vocabulary = new UniqueWordVocabulary();
    Logger log = LoggerFactory.getLogger("UniqueWordVocabularyTest");

    public void testAddWord() {
        vocabulary.addWord("test");
        int expected = 1;
        if (expected == vocabulary.getWordsCount()) {
            log.info("Test sucses");
        } else {
            log.error("Test filed");
        }
    }
}
