/*
Даны следующие строки, cравнить их с помощью == и метода equals() 
класса Object
String s1 = "hello";
String s2 = "hello";
String s3 = s1;
String s4 = "h" + "e" + "l" + "l" + "o";
String s5 = new String("hello");
String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
 */
/* 
public class Class28_09_2023{
    public static void class28_09_2023(String[] args){
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
    }
}
*/
/*
Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на экран.
 */
/* 
import java.util.List;
import java.util.Random;

public class Class28_09_2023 {
    public static void class28_09_2023(String[] args) {
        List<Integer> list = createList(2, 10, 10);
        System.out.println(list);
        list.sort(null);
        System.out.println(list);
    }

    static List<Integer> createList(int min, int max, int count) {
        List<Integer> list = new ArrayList<>(count);
        Random random = new Random();
        for (int index = 0; index < count; index++) {
            list.add(random.nextInt(min, max + 1));
        }
        return list;
    }
}
*/
/*
Создать список типа ArrayList
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа.
 */
/* 
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        List list = new ArrayList();
        list.add(5);
        list.add("hello");
        list.add(3.14);
        list.add("5");
        removeIntegers(list);
        System.out.println(list);
    }
    static void removeIntegers(List list){
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj instanceof Integer){
                list.remove(i);
                i--;
            }
        }
    }
    static void removeIntegersV2(List list){
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            if (obj instanceof Integer){
                iterator.remove();
            }
        }
    }    
}
*/
/*
Каталог товаров книжного магазина сохранен в виде двумерного списка 
List<ArrayList<String>> так, что на 0-й позиции каждого внутреннего 
списка содержится название жанра, а на остальных позициях - названия книг. 
Напишите метод для заполнения данной структуры.
 */
/* 
import java.util.ArrayList;
import java.util.List;

public class Class28_09_2023 {
    public static void class28_09_2023(String[] args){
        List<List<String>> shopBook = new ArrayList<>();
        addBook(shopBook, "фентези", "гарри поттер");
        addBook(shopBook, "сказки", "колобок");
        addBook(shopBook, "роман", "война и мир");
        addBook(shopBook, "сказки", "царевна лягушка");
        addBook(shopBook, "сказки", "золотая рыбка");

        System.out.println(shopBook);
    }

    }
    static void addBook(List<List<String>> shopBook, String genre, String nameBook){
        for (int i = 0; i < shopBook.size(); i++){
            if (shopBook.get(i).get(0).equals(ggenre)){
                if (!shopBook.get(i).contains(nameBook)){
                    List<String> list = shopBook.get(i);
                    list.add(nameBook);
                }
                return;
            }                      
        }
        List<String> list = new ArrayList<>();
        list.add(genre);
        list.add(nameBook);
        shopBook.add(list);    
    }
*/
