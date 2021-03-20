package features.certification.interfaces;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
public class Product implements Cloneable {

    private String name;
    private BigDecimal value;
    private int quantity;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
