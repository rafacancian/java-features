package certification.interfaces.cloneable;

import certification.interfaces.Product;

import java.math.BigDecimal;

public class ExecuteCloneable {

    public static void execute() {

        try {

            Product p1 = Product.builder().name("Product 01").value(new BigDecimal(2000)).quantity(20).build();
            System.out.println("Product01 created");
            Product p2 = (Product) p1.clone();
            System.out.println("Product02 created cloning from Product01");
            Product p3 = p1;
            System.out.println("Product03 create from Product01");

            System.out.println("Product02 equals to Product01 ? " + p1.equals(p2));
            System.out.println("Product02 == to Product01 ? " + (p1 == p2));
            System.out.println("Product03 equals to Product01 ? " + p1.equals(p3));
            System.out.println("Product03 == to Product01 ? " + (p1 == p3));

        } catch (CloneNotSupportedException e) {
            System.out.println("Product clone not supported. " + e.getMessage());
        }

    }
}
