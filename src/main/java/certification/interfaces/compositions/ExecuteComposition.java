package certification.interfaces.compositions;

import java.math.BigDecimal;

public class ExecuteComposition {

    public static void execute() {
        Bank bank = new Bank();
        bank.authenticate();
        bank.deposit(BigDecimal.TEN);
        bank.withdrawing();

    }
}
