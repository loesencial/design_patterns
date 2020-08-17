package Product;

import java.util.Arrays;
import java.util.List;

public class ProductDemo {
    public static void main(String[] args) {
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.XLARGE);
        Product pen = new Product("Pen", Color.GREEN, Size.SMALL);

        List<Product> products = Arrays.asList(tree, house, pen);

        /**
         * This particular implementation of the ProductFilter violates OCP
         * Everytime we need to add a new filter we have to go back to an already tested and functioning ProductFilter
         * class and update it
         */
        ProductFilter pf = new ProductFilter();
        System.out.println("Green products (old): ");
        pf.filterByColor(products, Color.GREEN).forEach(System.out::println);

        /**
         * Using the BetterFilter
         */
        BetterFilter bf = new BetterFilter();
        System.out.println("Green products (new): ");
        bf.filter(products, new ColorSpecification(Color.GREEN)).forEach(System.out::println);
        System.out.println("Small products (new): ");
        bf.filter(products, new SizeSpecification(Size.SMALL)).forEach(System.out::println);

        /**
         * Using the BetterFilter with multiple specs
         */
        Specification<Product> colorSpecification = new ColorSpecification(Color.GREEN);
        Specification<Product> sizeSpecification = new SizeSpecification(Size.XLARGE);
        List<Specification<Product>> specs = Arrays.asList(colorSpecification, sizeSpecification);
        Specification<Product> compositeSpecification = new AndSpecification<Product>(specs);
        System.out.println("Multiple specs (new): ");
        bf.filter(products, compositeSpecification).forEach(System.out::println);
    }
}
