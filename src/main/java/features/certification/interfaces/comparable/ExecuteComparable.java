package features.certification.interfaces.comparable;

import features.certification.interfaces.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExecuteComparable {

    public static void execute() {

        List<Product> productsList = new ArrayList<>();
        productsList.add(Product.builder().name("Product B").value(new BigDecimal(2000)).quantity(20).build());
        productsList.add(Product.builder().name("Product D").value(new BigDecimal(4000)).quantity(40).build());
        productsList.add(Product.builder().name("Product A").value(new BigDecimal(1000)).quantity(10).build());
        productsList.add(Product.builder().name("Product C").value(new BigDecimal(3000)).quantity(30).build());
        Collections.sort(productsList, new ProductNameSorter());

        for (Product product : productsList) {
            System.out.println("Product: " + product);
        }
    }
}
