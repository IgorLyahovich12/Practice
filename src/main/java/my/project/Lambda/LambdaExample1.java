package my.project.Lambda;

public class LambdaExample1 {
    public static void main(String[] args) {
       /* Calculator add = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };

        // Реалізація множення через анонімний клас
        Calculator multiply = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a * b;
            }
        };

        // Реалізація віднімання через анонімний клас
        Calculator subtract = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a - b;
            }
        };

        // Реалізація ділення через анонімний клас
        Calculator divide = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a / b;
            }
        };*/
/*// Реалізація додавання
        class Addition implements Calculator {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        }

// Реалізація множення
        class Multiplication implements Calculator {
            @Override
            public int calculate(int a, int b) {
                return a * b;
            }
        }

// Реалізація віднімання
        class Subtraction implements Calculator {
            @Override
            public int calculate(int a, int b) {
                return a - b;
            }
        }

// Реалізація ділення
        class Division implements Calculator {
            @Override
            public int calculate(int a, int b) {
                return a / b;
            }
        }*/

        //Lambda expression replace code upper
        Calculator add=(a,b)->a+b;
        Calculator multiply=(int a,int b)->a*b;
        Calculator subtract=(a,b)->{return a-b;};
        Calculator divide=(a,b)->a/b;
        System.out.println("Сума: "+add.calculate(5,7));
        System.out.println("Добуток: "+multiply.calculate(5,7));
        System.out.println("Різниця: "+divide.calculate(35,7));
        System.out.println("Ділення: "+subtract.calculate(35,7));
    }
}
//анотація, яка гарантує, що інтерфейс має лише один абстрактний метод
//інтерфейс не має конкретної реалізації, він просто визначає поведінку, яку ми передамо через лямбда-вираз.
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}
