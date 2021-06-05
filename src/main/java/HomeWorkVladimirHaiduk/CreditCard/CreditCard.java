package HomeWorkVladimirHaiduk.CreditCard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreditCard {
    private final String number;
    private final int pinCode;
    private double balance;
    private double limit;
    private double loanDebt;
    Logger log = LoggerFactory.getLogger("CreditCard");

    public double getBalance() {
        return balance;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getLoanDebt() {
        return loanDebt;
    }

    public CreditCard(String number, int pinCode) {
        this.number = number;
        this.pinCode = pinCode;
    }

    public void deposit(int pinCode, double summ) {
        if (this.pinCode != pinCode) {

            log.error("Operation rejected. Invalid pincode!");

        } else if (loanDebt == 0) {
            this.balance = this.balance + summ;

        } else if (loanDebt != 0) {

            if (summ - loanDebt >= 0) {
                loanDebt = loanDebt - summ;
                balance = balance - loanDebt;
                loanDebt = 0;
            } else {
                loanDebt = loanDebt - summ;
            }

        }

    }

    public void withdraw(int pinCode, double summ) {
        if (this.pinCode != pinCode) {
            log.error("Operation rejected. Invalid pincode!");
        } else if (summ <= balance) {
            balance = balance - summ;

        } else if (balance < summ) {

            if ((limit + balance - summ) >= 0 && loanDebt <= limit - summ) {
                balance = balance - summ;
                loanDebt = loanDebt - balance;
                balance = 0;

            } else {
                log.error("Credit lemiite exceeded!");
            }

        }

    }


}

