package features.certification.interfaces.compositions;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Account implements Withdrawing, Depositing {

    BigDecimal amount = BigDecimal.ZERO;

    @Override
    public void deposit(BigDecimal amount) {
        System.out.println("Account deposit: " + amount);
    }

    @Override
    public BigDecimal withdrawing() {
        System.out.println("Account withdrawing");
        return BigDecimal.ZERO;
    }
}
