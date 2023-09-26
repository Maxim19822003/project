// import java.time.LocalTime;
// import java.util.Scanner;

// import java.util.Arrays;

// public class Main {
/*
 * В консоли запросить имя пользователя. В зависимости от текущего
 * времени, вывести приветствие вида
 * "Доброе утро, <Имя>!", если время от 05:00 до 11:59
 * "Добрый день, <Имя>!", если время от 12:00 до 17:59;
 * "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
 * "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
 */

/*
 * public static void main(String[] args){
 * Scanner skanner = new Scanner(System.in);
 * System.out.println("Как вас зовут?");
 * String name = skanner.nextLine();
 * LocalTime time = LocalTime.now();
 * int hour = time.getHour();
 * if (hour >= 5 && hour < 12){
 * System.out.println("Доброе утро, " + name);
 * }else if (hour >= 12 && hour < 18){
 * System.out.println("Доброе день, " + name);
 * }else if (hour >= 18 && hour < 23){
 * System.out.println("Доброе вечер, " + name);
 * }else {
 * System.out.println("Доброй, ночи " + name);
 * }
 * }
 */
/*
 * Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное
 * количество подряд идущих 1.
 */
/*
 * public static void main(String[] args) {
 * int[] array = new int[]{1,1,0,1,1,1};
 * System.out.println(method1(array));
 * }
 * 
 * static int method1(int[] arr){
 * int count = 0;
 * int maxCount = 0;
 * for (int i = 0; i < arr.length; i++) {
 * if (arr[i] == 1){
 * count++;
 * } else {
 * if (maxCount < count){
 * maxCount = count;
 * }
 * count = 0;
 * }
 * }
 * if (maxCount < count){
 * maxCount = count;
 * }
 * return maxCount;
 * }
 * }
 */
/*
 * Дан массив nums = [3,2,5,3] и число val = 3.
 * Если в массиве есть числа, равные заданному, нужно перенести эти элементы
 * в конец массива.
 * Таким образом, первые несколько (или все) элементов массива должны быть
 * отличны от заданного, а остальные - равны ему.
 */
/*
 * public static void main(String[] args){
 * int[] arr = {3,2,5,3};
 * int val = 3;
 * int[] res = sort(arr, val);
 * System.out.println(Arrays.toString(res));
 * }
 * static int[] sort(int[] arr, int val){
 * int[] res = new int[arr.length];
 * Arrays.fill(res, val);
 * for (int i = 0, j = 0; i < res.length; i++) {
 * if (arr[i] != val){
 * res[j++] = arr[i];
 * }
 * }
 * return res;
 * }
 * }
 */
/*
 * Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном
 * порядке.
 */
/*
 * public static void main(String[] args){
 * String line = "Добро пожаловать на курс по Java";
 * String[] words = line.split(" ");
 * String line2 = "";
 * for (int i = words.length - 1; i >= 0; i--) {
 * line2 += words[i] + " ";
 * }
 * System.out.println(line2);
 * }
 * }
 */
/*
 * Реализовать функцию возведения числа а в степень b. a, b из Z. Сводя
 * количество
 * выполняемых действий к минимуму.
 * Пример 1: а = 3, b = 2, ответ: 9
 * Пример 2: а = 2, b = -2, ответ: 0.25
 * Пример 3: а = 3, b = 0, ответ: 1
 */
/*
 * public static void main(String[] args){
 * int a = 2;
 * int b = 0;
 * System.out.println(pow(a, b));
 * }
 * 
 * static double pow(int a, int b){
 * if (b == 0){
 * return 1;
 * }
 * if (a == 0 || b == 1){
 * return a;
 * }
 * double a1 = a;
 * if (b < 0){
 * a1 = 1 / a1;
 * b = -b;
 * }
 * double res = 1;
 * for (int i = 0; i < b; i++) {
 * res *= a1;
 * }
 * return res;
 * }
 * }
 */