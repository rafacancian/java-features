package features.java8.streams;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class ExecuteConvertListToMap {

    public static void execute() {

        List<Product> products = new ArrayList<>();
        products.add(Product.builder().id(1L).name("product 01").value(new BigDecimal("110")).build());
        products.add(Product.builder().id(2L).name("product 02").value(new BigDecimal("220")).build());
        products.add(Product.builder().id(3L).name("product 03").value(new BigDecimal("330")).build());
        products.add(Product.builder().id(4L).name("product 04").value(new BigDecimal("440")).build());

        System.out.println("List to Map simple");
        Map<String, BigDecimal> result1 = products.stream().collect(Collectors.toMap(Product::getName, Product::getValue));
        System.out.println(result1);

        System.out.println("List to Map with duplicate key value");
        products.add(Product.builder().id(5L).name("product 01").value(new BigDecimal("510")).build());
        Map<String, BigDecimal> result2 = products.stream()
                .collect(Collectors.toMap(Product::getName, Product::getValue, (oldValue, newValue) -> oldValue.add(newValue)));
        System.out.println(result2);

        System.out.println("List to Map with sorted");
        Map result3 = products.stream()
                .sorted(Comparator.comparing(Product::getName).reversed())
                .collect(Collectors.toMap(Product::getName, Product::getValue, (oldValue, newValue) -> oldValue, HashMap::new));
        System.out.println(result3);
    }
}