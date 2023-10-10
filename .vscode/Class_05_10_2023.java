/* 
Создать структуру для хранения Номеров паспортов и Фамилий сотрудников 
организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов.

public static void main(String[] args) {
Passports passports = new Passports();
passports.add("123456", "Иванов");
passports.add("321456", "Васильев");
passports.add("234561", "Петрова");
passports.add("234432", "Иванов");
passports.add("654321", "Петрова");
passports.add("345678", "Иванов");

System.out.println(passports.findByName("Иванов"));
System.out.println();
System.out.println(passports.getFullList());
}
*/
/*
import java.util.HashMap;
import java.util.Map;

public class Passports {
Map<String, String> passports = new HashMap<>();

void add(String passport, String lastName){
passports.put(passport, lastName);
}

String findByName(String lastName){
StringBuilder stringBuilder = new StringBuilder();
for (Map.Entry<String, String> entry: passports.entrySet()){
String numPassport = entry.getKey();
String name = entry.getValue();
if (name.equals(lastName)){
stringBuilder.append(numPassport);
stringBuilder.append(": ");
stringBuilder.append(name);
stringBuilder.append(", ");
}
}
return stringBuilder.toString();
}

String getFullList(){
StringBuilder stringBuilder = new StringBuilder();
for (Map.Entry<String, String> entry: passports.entrySet()){
stringBuilder.append(entry.getKey());
stringBuilder.append(": ");
stringBuilder.append(entry.getValue());
stringBuilder.append("\n");
}
return stringBuilder.toString();
}
}
 */
/*
Даны 2 строки, написать метод, который вернет true, если эти строки 
являются изоморфными и false, если нет. Строки изоморфны, если одну букву 
в первом слове можно заменить на некоторую букву во втором слове, при этом
повторяющиеся буквы одного слова меняются на одну и ту же букву с 
сохранением порядка следования. (Например, add - egg изоморфны)
буква может не меняться, а остаться такой же. (Например, note - code)
Пример 1:
Input: s = "foo", t = "bar"
Output: false
Пример 2:
Input: s = "paper", t = "title"
Output: true
 */
/*
public static void main(String[] args) {
String s1 = "paper";
String s2 = "title";
String s3 = "foo";
String s4 = "bar";
System.out.println(isIsomorphic(s1, s2));
System.out.println(isIsomorphic(s3, s4));
System.out.println(isIsomorphic(s4, s3));
}

static boolean isIsomorphic(String s1, String s2){
if (checkSize(s1, s2)){
return false;
}
Map<Character, Character> map = new HashMap<>();
char[] c1 = s1.toCharArray();
char[] c2 = s2.toCharArray();
for (int i = 0; i < c1.length; i++) {
if (map.containsKey(c1[i])){
if (c2[i] != map.get(c1[i])){
return false;
}
} else {
if (map.containsValue(c2[i])){
return false;
}
map.put(c1[i], c2[i]);
}
}
return true;
}

private static boolean checkSize(String s1, String s2) {
return s1.length() != s2.length();

}
 */
/*
Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь
 */
/*
public static void main(String[] args) {
String s1 = "<{a}+{(d*3)}>";
System.out.println(check(s1));
}

static boolean check(String s){
Stack<Character> stack = new Stack<>();
Map<Character, Character> map = new HashMap<>();
map.put('(', ')');
map.put('<', '>');
map.put('{', '}');
map.put('[', ']');

char[] arr = s.toCharArray();
for (char c: arr){
if (map.containsKey(c)){
stack.push(c);
}
if (map.containsValue(c)){
if (stack.empty() || map.get(stack.pop()) != c){
return false;
}
}
}
return stack.empty();
}
 */
/*
Взять набор строк, например,
Мороз и солнце день чудесный 
Еще ты дремлешь друг прелестный 
Пора красавица проснись.
Написать метод, который отсортирует эти слова по длине с помощью TreeMap. 
Слова с одинаковой длиной не должны “потеряться”.
 */
/*
public static void main(String[] args) {
Map<Integer, List<String>> map = new TreeMap<>(Comparator.reverseOrder());
String s = "Мороз и солнце день чудесный\n" +
"Еще ты дремлешь друг прелестный\n" +
"Пора красавица проснись.";
s = s.replace("\n", " ");
s = s.replace(".", "");
String[] words = s.split(" ");
for (String word: words){
int len = word.length();
if (map.containsKey(len)){
List<String> list = map.get(len);
list.add(word);
} else {
List<String> list = new ArrayList<>();
list.add(word);
map.put(len, list);
}
}

System.out.println(map);
}
 */