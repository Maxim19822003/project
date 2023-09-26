// Необходимо вывести треугольное число, то есть сумму от 1 до n
/*
 * class Answer {
 * public int countNTriangle(int n){ // Введите свое решение ниже
 * int count = 0;
 * for (int i = 1; i <= n; i++) {
 * count += i;
 * }
 * return count;
 * 
 * }
 * 
 * // Не удаляйте этот класс - он нужен для вывода результатов на экран и
 * // проверки
 * public class Printer{
 * public static void main(String[] args) {
 * int n = 0;
 * 
 * if (args.length == 0) {
 * // При отправке кода на Выполнение, вы можете варьировать эти
 * // параметры
 * n = 4;
 * }
 * else{
 * n = Integer.parseInt(args[0]);
 * }
 * 
 * // Вывод результата на экран
 * Answer ans = new Answer();
 * int itresume_res = ans.countNTriangle(n);
 * System.out.println(itresume_res);
 * }
 * }
 * }
 */
/*
 * Напишите функцию printPrimeNums, которая выведет на экран все простые
 * числа в промежутке от 1 до 1000, каждое на новой строке.
 * Напишите свой код в методе printPrimeNums класса Answer.
 */
/*
 * class Answer {
 * public void printPrimeNums(){
 * int a = 1;
 * int b = 1000;
 * System.out.println(1);
 * for (int i = a; i <=b; i++) {
 * int count = 0;
 * for (int j = 1; j <= i; j++){
 * if(i % j == 0){
 * count++;
 * }
 * }
 * if (count == 2){
 * System.out.println(i);
 * }
 * }
 * }
 * }
 * 
 * public class Printer{
 * public static void main(String[] args) {
 * 
 * Answer ans = new Answer();
 * ans.printPrimeNums();
 * }
 * }
 */
/*
 * Напишите класс Calculator, который будет выполнять математические
 * операции (+, -, *, /) над двумя числами и возвращать результат. В классе
 * должен быть метод calculate, который принимает оператор и значения
 * аргументов и возвращает результат вычислений.
 * 
 * При неверно переданном операторе, программа должна вывести сообщение об
 * ошибке "Некорректный оператор: 'оператор'".
 */
/*
 * class Calculator {
 * public int calculate(char op, int a, int b) {
 * int result = 0;
 * boolean validOperator = true;
 * 
 * switch (op) {
 * case '+':
 * result = a + b;
 * break;
 * case '-':
 * result = a - b;
 * break;
 * case '*':
 * result = a * b;
 * break;
 * case '/':
 * if (b == 0) {
 * System.out.println("На ноль делить нельзя!");
 * validOperator = false;
 * } else {
 * result = a / b;
 * }
 * break;
 * default:
 * System.out.println("Некорректный оператор: '" + op + "'");
 * validOperator = false;
 * break;
 * }
 * 
 * if (validOperator) {
 * return result;
 * } else {
 * return 0; // Или любое другое значение, которое будет обозначать ошибку
 *      }
 *     }
 * }
 * 
 * // Не удаляйте этот класс - он нужен для вывода результатов на экран и
 * проверки
 * 
 * class Printer{
 * public static void main(String[] args) {
 * int a = 0;
 * char op = ' ';
 * int b = 0;
 * 
 * if (args.length == 0) {
 * // При отправке кода на Выполнение, вы можете варьировать эти параметры
 * a = 3;
 * op = '+';
 * b = 7;
 * } else {
 * a = Integer.parseInt(args[0]);
 * op = args[1].charAt(0);
 * b = Integer.parseInt(args[2]);
 * }
 * 
 * Calculator calculator = new Calculator();
 * int result = calculator.calculate(op, a, b);
 * System.out.println(result);
 * }
 * }
 */