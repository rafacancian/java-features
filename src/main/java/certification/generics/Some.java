package certification.generics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class Some<T> {

    private T value;

    public void operationWithGenerics() {
        System.out.println("Operation executed with generics " + value);
    }

}
