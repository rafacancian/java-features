package certification.interfaces.comparable;

import certification.interfaces.Product;

import java.util.Comparator;

public class ProductNameSorter implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().compareTo(p2.getName());
    }

}
