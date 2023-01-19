public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2); // a = 3
        int b = calc.minus.apply(1,1); // b = 0
        if (a == 0 || b == 0) {
            System.out.println("На ноль делить нельзя");
        } else {
            int c = calc.devide.apply(a, b); // c = 3/0, нельзя
            calc.println.accept(c);
        }

    }
}
