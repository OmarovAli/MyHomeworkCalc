public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2); // a = 3
        int b = calc.minus.apply(1, 1);
        int abc = (b == 0) ? b + 1 : b;
        int c = calc.devide.apply(a, abc);
        calc.println.accept(abc);
    }
}

/* Пытался решить через UnaryOperator
Писал так:
int a = calc.plus.apply(1, 2);
int b = calc.minus.apply(1, 1);
int abc = calc.abs.apply(b); К UnaryOperator abs в классе Calculator
Все равно выходила ошибка
Сначала думал, дело в том, что параметр t должен быть типа Integer,
потому что когда я вводил любую цифру, тернарный оператор abs срабатывал,
но ведь в случае с devide все работало нормально
Подскажите пожалуйста, почему так происходит)
 */

