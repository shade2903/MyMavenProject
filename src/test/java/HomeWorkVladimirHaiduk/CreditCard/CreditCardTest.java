package HomeWorkVladimirHaiduk.CreditCard;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {
    Logger log = LoggerFactory.getLogger("CreditCardTest");
    CreditCard card = new CreditCard("test", 1234);

    @Test
    public void deposit() {
        double expected = 1700.0;
        card.setLimit(1500);
        card.withdraw(1234, 300);
        card.deposit(1234, 500);
        card.deposit(1234, 1500);
        double actual = card.getBalance();


        assertEquals(expected,actual,0);

    }

    @Test
    public void withdraw() {
        double expected = 800;
        card.setLimit(1500);
        card.deposit(1234,500);
        card.withdraw(1234,1300);
        double actual = card.getLoanDebt();
        assertEquals(expected,actual,0);


    }
}