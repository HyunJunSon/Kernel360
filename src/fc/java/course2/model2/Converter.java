package fc.java.course2.model2;

@FunctionalInterface
public interface Converter<F, T> {
    T covert(F from);
}
