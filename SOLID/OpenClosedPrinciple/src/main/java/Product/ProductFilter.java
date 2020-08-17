package Product;

import java.util.List;
import java.util.stream.Stream;

/**
 * Now, if we keep adding different filters to this class based on requirements then we are violating OCP
 * This code is already written and tested, we do not want to keep modifying it.
 */
public class ProductFilter {

    public Stream<Product> filterByColor(List<Product> products,
                                         Color color) {
        return products.stream().filter(p -> p.getColor() == color);

    }

    public Stream<Product> filterBySize(List<Product> products,
                                         Size size) {
        return products.stream().filter(p -> p.getSize() == size);

    }

    public Stream<Product> filterBySizeAndColor(List<Product> products,
                                                Size size,
                                                Color color) {
        return products.stream().filter(p -> p.getSize() == size && p.getColor() == color);

    }
}
