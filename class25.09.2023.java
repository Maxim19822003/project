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