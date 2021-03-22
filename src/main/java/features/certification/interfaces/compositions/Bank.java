package features.certification.interfaces.compositions;

import java.math.BigDecimal;

public class Bank implements Withdrawing, Depositing, Authentication {

    private Account account;
    private Security security;

    @Override
    public void authenticate() {
        security.authenticate();
    }

    @Override
    public void deposit(BigDecimal amount) {
        authenticate();
        account.deposit(amount);
    }

    @Override
    public BigDecimal withdrawing() {
        authenticate();
        return account.withdrawing();
    }
}
