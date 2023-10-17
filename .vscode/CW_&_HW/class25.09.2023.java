/*
 * Дано четное число N (>0) и символы c1 и c2.
 * Написать метод, который вернет строку длины N, которая состоит из
 * чередующихся символов c1 и c2, начиная с c1.
 * Ответ: c1c2c1…c2 (всего N символов)
 */
/*
 * public class Main {
 * public static void main(String[] args){
 * char c1 = "a";
 * char c2 = "b";
 * int n = 8;
 * }
 * static String concat(char c1, char c2, int n){
 * StringBuilder stringBuilder = new StringBuilder();
 * for (int i = 0; i < n / 2; i++) {
 * stringBuilder.append(c1);
 * stringBuilder.append(c2);
 * }
 * return stringBuilder.toString();
 * }
 * }
 */
/*
 Напишите метод, который сжимает строку.
Пример: вход aaaabbbcdd.
Результат: a4b3cd2
 */
/* 
public class Main {
    public static void main(String[] arg) {
        String str = "aaaabbbcdd";
        System.out.println(zipString(str));
    }

    public static String zipString(String line) {
        StringBuilder sb = new StringBuilder();
        char[] ch_line = line.toCharArray();
        int count = 1;
        for (int i = 0; i < ch_line.length - 1; i++) {
            if (ch_line[i] == ch_line[i + 1]) {
                System.out.println(ch_line[i]);
                count++;

            } else {
                sb.append(ch_line[i]);
                if (count > 1) {
                    sb.append(count);
                }
                count = 1;
            }

        }
        sb.append(ch_line[ch_line.length - 1]);
        if (count > 1) {
            sb.append(count);
        }
        return sb.toString();
    }
}
*/
/*
 Напишите метод, который принимает на вход строку (String) и определяет 
 является ли строка палиндромом (возвращает boolean значение).

Полиндром - Слово или фраза, которые одинаково читаются слева направо и 
справа налево.
 */
/*
public class Main {
    public static void main(String[] args) {
String s = "Потоп";
System.out.println(polindromV2(s));
}

        static boolean polindromV1(String s){
        s = s.toLowerCase();
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)){
            return false;
            }
        }
        return true;
}

static boolean polindromV2(String s){
    s = s.toLowerCase();
    StringBuilder stringBuilder1 = new StringBuilder(s);
    String s1 = stringBuilder1.reverse().toString();
    return s.equals(s1);
}
}
*/
/*
Напишите метод, который составит строку, состоящую из 100 повторений 
слова TEST и метод, который запишет эту строку в простой текстовый файл, 
обработайте исключения.
 */
/* 
public class Main {
    static Logger logger = Logger.getAnonymousLogger();
    public static void main(String[] args) {
        String filePath = "src/lesson2/seminar/test.txt";
        String logPath = "src/lesson2/seminar/log.txt";
        String s = "Hello";
        int n = 5;

        createLogger(logPath);
        String line = repeat(s, n);
        writeToFile(line, filePath);
        closeLogger();
        System.out.println("Конец работы приложения");
    }

    static String repeat(String s, int n){
    return s.repeat(n);
    }

    static void createLogger(String logPath){
    try {
        FileHandler fileHandler = new FileHandler(logPath, true);
        simpleFormatter = new SimpleFormatter();
        fileHandler.setFormatter(simpleFormatter);
        logger.addHandler(fileHandler);
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

    static void closeLogger(){
        Handler[] handlers = logger.getHandlers();
        for (Handler handler: handlers){
            handler.close();
        }
    }

    static void writeToFile(String line, String filePath) {
        try (FileWriter writer = new FileWriter(filePath, true)){
            writer.write(line);
            writer.write("\n");
            writer.flush();
            logger.info("Запись выполнена успешно");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Запись в файл не удалась");
            logger.warning("Запись в файл не удалась");
        }
    }
}
*/
