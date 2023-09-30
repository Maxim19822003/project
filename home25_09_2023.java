/*
 * Сформируйте SQL-запрос
 * 
 * Дана строка sql-запроса:
 * select * from students where "
 * Сформируйте часть WHERE этого запроса, используя StringBuilder. Пример
 * данных для фильтрации приведены ниже в виде json-строки. Если значение
 * null, то параметр не должен попадать в запрос.
 * Пример:
 * 
 * {"name": "Ivanov", "country": "Russia", "city": "Moscow", "age": "null"}
 */
/*
 * class Answer {
 * public static StringBuilder answer(String QUERY, String PARAMS) {
 * // Напишите свое решение ниже
 * StringBuilder res = new StringBuilder(QUERY);
 * String task = PARAMS;
 * String[] parts = task.split(",");
 * 
 * for (int i = 0; i < parts.length; i++) {
 * if (parts[i].contains("null")) parts[i] = "0:0";
 * parts[i] = parts[i].replace("\"", "");
 * parts[i] = parts[i].replace("{", "");
 * parts[i] = parts[i].replace("}", "");
 * parts[i] = parts[i].replace(" ", "");
 * }
 * 
 * String arr [][] = new String[parts.length][2];
 * 
 * for (int j = 0; j < arr.length; j++) {
 * int flag = 0;
 * String [] temp = parts[j].split(":");
 * for (int k = 0; k < 2; k++) {
 * arr [j][k] = temp[k];
 * if (!arr[j][k].equals("0")) {
 * if (k == 0) res.append(arr[j][k] + "='");
 * else res.append(arr[j][k]);
 * }
 * else flag = 1;
 * }
 * if (j < arr.length -1) res.append("' and ");
 * if (flag == 1) res.setLength(res.length() - 5);
 * }
 * return res;
 * }
 * }
 * 
 * // Не удаляйте этот класс - он нужен для вывода результатов на экран и
 * //проверки
 * public class home25_09_2023 {
 * public static void main(String[] args) {
 * String QUERY = "";
 * String PARAMS = "";
 * 
 * if (args.length == 0) {
 * // При отправке кода на Выполнение, вы можете варьировать
 * //эти параметры
 * QUERY = "select * from students where ";
 * PARAMS =
 * "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} "
 * ;
 * } else {
 * QUERY = args[0];
 * PARAMS = args[1];
 * }
 * 
 * Answer ans = new Answer();
 * System.out.println(ans.answer(QUERY, PARAMS));
 * }
 * }
 */
/*
 * Сортировка пузырьком с логированием
 * 
 * Реализуйте алгоритм сортировки пузырьком числового массива, результат
 * после каждой итерации запишите в лог-файл.
 * 
 * Напишите свой код в методе sort класса BubbleSort. Метод sort принимает
 * на вход один параметр:
 * int[] arr - числовой массив
 * После каждой итерации, ваш код должен делать запись в лог-файл 'log.txt' в
 * формате год-месяц-день час:минуты {массив на данной итерации}.
 * Пример:
 * arr = new int[]{9, 4, 8, 3, 1};
 * sort(arr)
 * 
 * // При чтении лог-файла получим:
 * 2023-05-19 07:53 [4, 8, 3, 1, 9]
 * 2023-05-19 07:53 [4, 3, 1, 8, 9]
 * 2023-05-19 07:53 [3, 1, 4, 8, 9]
 * 2023-05-19 07:53 [1, 3, 4, 8, 9]
 * 2023-05-19 07:53 [1, 3, 4, 8, 9]
 */
/*
 * import java.io.File;
 * import java.io.FileWriter;
 * import java.io.FileReader;
 * import java.io.BufferedReader;
 * import java.io.IOException;
 * import java.util.Arrays;
 * import java.text.SimpleDateFormat;
 * import java.util.Date;
 * import java.util.logging.FileHandler;
 * import java.util.logging.Level;
 * import java.util.logging.Logger;
 * import java.util.logging.SimpleFormatter;
 * 
 * class BubbleSort {
 * private static File log;
 * private static FileWriter fileWriter;
 * 
 * public static void sort(int[] mas) {
 * String logPath = "log.txt";
 * StringBuilder sb = new StringBuilder();
 * 
 * int count = mas.length;
 * while (count != 0) {
 * count = 0;
 * for (int i = 0; i < mas.length - 1; i++) {
 * if (mas[i] > mas[i+1]) {
 * int pock = mas[i];
 * mas[i] = mas[i+1];
 * mas[i+1] = pock;
 * count++;
 * }
 * }
 * Date date = new Date();
 * SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd HH:mm");
 * sb.append(form.format(date)).append(" ").append(Arrays.toString(mas));
 * sb.append("\n");
 * String logLine = sb.toString();
 * writeToFile(logLine, logPath);
 * }
 * }
 * 
 * static void writeToFile(String line, String filePath) {
 * try (FileWriter writer = new FileWriter(filePath)){
 * writer.write(line + System.lineSeparator());
 * writer.flush();
 * } catch (Exception e) {
 * e.printStackTrace();
 * System.out.println("Ошибка");
 * }
 * }
 * }
 * 
 * // Не удаляйте этот класс - он нужен для вывода результатов на экран и
 * проверки
 * public class home25_09_2023{
 * public static void main(String[] args) throws IOException {
 * int[] arr = {};
 * 
 * if (args.length == 0) {
 * // При отправке кода на Выполнение, вы можете варьировать эти параметры
 * arr = new int[]{9, 4, 8, 3, 1};
 * }
 * else{
 * arr = Arrays.stream(args[0].split(", "))
 * .mapToInt(Integer::parseInt)
 * .toArray();
 * }
 * 
 * BubbleSort ans = new BubbleSort();
 * ans.sort(arr);
 * 
 * try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
 * String line;
 * while ((line = br.readLine()) != null) {
 * System.out.println(line);
 * }
 * } catch (IOException e) {
 * e.printStackTrace();
 * }
 * }
 * }
 */
