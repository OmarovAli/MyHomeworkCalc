import java.util.function.Supplier;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;
    public interface Predicate<T> {
        boolean isPositive(T t);
    }
    public interface BinaryOperator<T> {

        T apply(T t, T t1);
    }
    public interface Consumer<T> {
        void accept(T t);
    }
    public interface UnaryOperator<T> {
        T apply(T t);
    }

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    BinaryOperator<Integer> devide = (x, y) -> x / y; // на ноль делить нельзя

    UnaryOperator<Integer> pow = x -> x * x;
   // UnaryOperator<Integer> abs = x -> x > 0 ? x : x * 3;

        Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
