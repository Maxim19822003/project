/*
Пусть дан LinkedList с несколькими элементами.
Напишите класс LLTasks с методом revert, который принимал бы на вход 
LinkedList и возвращает “перевернутый” список.
Пример

// Дан 
[1, One, 2, Two]

// Вывод
[1, One, 2, Two]
[Two, 2, One, 1]
 */
/*
import java.util.LinkedList;

class LLTasks {
    public static LinkedList<Object> revert(LinkedList<Object> ll) {
       LinkedList<Object> reversedList = new LinkedList<>();
      
       for (int i = ll.size() - 1; i >= 0; i--) {
         reversedList.add(ll.get(i));
        }

        return reversedList;
  }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
        LinkedList<Object> ll = new LinkedList<>();

        if (args.length == 0 || args.length != 4) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            ll.add(1);
            ll.add("One");
            ll.add(2);
            ll.add("Two");
        } else {
            ll.add(Integer.parseInt(args[0]));
            ll.add(args[1]);
            ll.add(Integer.parseInt(args[2]));
            ll.add(args[3]);
        }

        LLTasks answer = new LLTasks();
        System.out.println(ll);
        LinkedList<Object> reversedList = answer.revert(ll);
        System.out.println(reversedList);
    }
}
 */
/*
В классе MyQueue реализуйте очередь с помощью LinkedList со следующими 
методами:

enqueue() - помещает элемент в конец очереди
dequeue() - возвращает первый элемент из очереди и удаляет его
first() - возвращает первый элемент из очереди, не удаляя
getElements() - возвращает все элементы в очереди
Пример

queue.enqueue(1);
queue.enqueue(10);
queue.enqueue(15);
queue.enqueue(5);
System.out.println(queue.getElements()); 
// [1, 10, 15, 5]

queue.dequeue();
queue.dequeue();
System.out.println(queue.getElements());
// [15, 5]

System.out.println(queue.first());
// 15
 */
/*
import java.util.LinkedList;

class MyQueue<T> {
    private LinkedList<T> queue = new LinkedList<>();

    public void enqueue(T element) {
        queue.addLast(element);
    }

    public T dequeue() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return queue.removeFirst();
    }

    public T first() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return queue.getFirst();
    }

    public LinkedList<T> getElements() {
        return new LinkedList<>(queue);
  }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        MyQueue<Integer> queue;
        queue = new MyQueue<>();

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}
 */
/*
В обычный калькулятор без логирования добавьте возможность отменить 
последнюю операцию.
Отмена последней операции должна быть реализована следующим образом: 
если передан оператор '<' калькулятор должен вывести результат 
предпоследней операции.

calculate('+', 3, 7)
calculate('+', 4, 7)
calculate('<', 0, 0)

// 10
// 11
// 10

calculate('*', 3, 2)
calculate('-', 7, 4)
calculate('<', 0, 0)

// 6
// 3
// 6
 */
/*
import java.util.ArrayDeque;
import java.util.Deque;

class Calculator {
    private Deque<Integer> results = new ArrayDeque<>();

    public int calculate(char op, int a, int b) {
        int result;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Деление на ноль недопустимо");
                }
                result = a / b;
                break;
            default:
                throw new IllegalArgumentException("Недопустимая операция: " + op);
        }
        results.push(result); // Добавляем результат в стек
        return result;
    }

    public int undo() {
        if (results.size() < 2) {
            throw new IllegalStateException("Нет предыдущей операции для отмены");
        }
        results.pop(); // Убираем последний результат
        return results.peek(); // Возвращаем предпоследний результат
  }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
            c = 4;
            op2 = '+';
            d = 7;
            undo = '<';
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
        }

        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
        int result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        int prevResult = calculator.undo();
        System.out.println(prevResult);
    }
}
 */
