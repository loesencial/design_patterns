package Product;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
