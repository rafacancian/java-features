package features.certification.streams;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class ExecuteCertificationStreams {

    private static final List<Product> products = Arrays.asList(
            Product.builder().id(1L).name("product 01").value(new BigDecimal("110")).build(),
            Product.builder().id(2L).name("product 02").value(new BigDecimal("220")).build(),
            Product.builder().id(3L).name("product 03").value(new BigDecimal("330")).build(),
            Product.builder().id(4L).name("product 04").value(new BigDecimal("440")).build()
    );

    public static void execute() {
        findById(2L);
        sumOfProducts();
    }

    private static void sumOfProducts() {
        Optional<BigDecimal> result = products.stream()
                .map(Product::getValue)
                .reduce(BigDecimal::add);
        System.out.println("Sum of product values: " + result.get());
        System.out.println("Sum of product values: " + result.get().setScale(2, RoundingMode.HALF_UP));
    }

    private static void findById(Long id) {

        Product result = products.stream().
                filter(product -> product.getId() == id)
                .findFirst()
                .orElseGet(null);
        System.out.println("FindById: " + result);
    }


}