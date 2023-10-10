/*
Напишите программу, представляющую телефонную книгу. Программа должна 
иметь следующие функции:

add(String name, Integer phoneNum): Добавляет запись в телефонную книгу.
Если запись с именем name уже существует, добавляет новый номер телефона в 
существующую запись.
Если запись с именем name не существует, создает новую запись с этим 
именем и номером телефона phoneNum.

find(String name): Поиск номеров телефона по имени в телефонной книге.
Если запись с именем name существует, возвращает список номеров телефона 
для этой записи.
Если запись с именем name не существует, возвращает пустой список.

getPhoneBook(): Возвращает всю телефонную книгу в виде HashMap, где 
ключи - это имена, а значения - списки номеров телефона.

На входе:

'Alice'
'Bob'
'123456'
'789012'
На выходе:

[123456, 789012]
{Bob=[789012], Alice=[123456, 789012]}
[]
 */
/*
import java.util.ArrayList;
import java.util.HashMap;

class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {

 // Получаем список номеров для имени (если он уже существует)
        ArrayList<Integer> phoneList = phoneBook.get(name);

        if (phoneList == null) {
            // Если нет списка для этого имени, создаем новый
            phoneList = new ArrayList<>();
        }

        // Добавляем номер телефона в список
        phoneList.add(phoneNum);

        // Помещаем обновленный список в телефонную книгу
        phoneBook.put(name, phoneList);
    }

    public ArrayList<Integer> find(String name) {
        // Получаем список номеров для данного имени
        ArrayList<Integer> phoneList = phoneBook.get(name);

        if (phoneList == null) {
            // Если запись не найдена, возвращаем пустой список
            return new ArrayList<>();
        }

        // Возвращаем список номеров
        return phoneList;
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        // Возвращаем всю телефонную книгу
        return phoneBook;
  }
}

// Не удаляйте этот класс - он нужен для 

public class Printer {
    public static void main(String[] args) {
        String name1;
        String name2;
        int phone1;
        int phone2;

        if (args.length == 0) {
            name1 = "Ivanov";
            name2 = "Petrov";
            phone1 = 123456;
            phone2 = 654321;
        } else {
            name1 = args[0];
            name2 = args[1];
            phone1 = Integer.parseInt(args[2]);
            phone2 = Integer.parseInt(args[3]);
        }

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name1, phone2);
        myPhoneBook.add(name2, phone2);

        System.out.println(myPhoneBook.find(name1));
        System.out.println(PhoneBook.getPhoneBook());
        System.out.println(myPhoneBook.find("Me"));
    }
}
 */
/*
Вы работаете с приложением для учета имен пользователей. Ваша задача - 
разработать программу, которая принимает на вход пять имен пользователей 
(или использует имена по умолчанию, если аргументы не предоставлены) и 
подсчитывает, сколько раз каждое имя встречается.
Программа должна использовать HashMap для хранения имен и их количества 
вхождений.
По завершении, программа выводит результат в виде пар "имя - количество".

На входе:

'Elena'
'Elena'
'Elena'
'Ivan'
'Ivan'
На выходе:

{Ivan=2, Elena=3}
 */
/*
import java.util.HashMap;

class NamesCounter {
    private HashMap<String, Integer> names = new HashMap<>();

    // Метод для добавления имени в HashMap
    public void addName(String name) {
        // Получаем текущее количество вхождений имени
        Integer count = names.get(name);

        if (count == null) {
            // Если имя еще не добавлено, устанавливаем начальное значение в 1
            names.put(name, 1);
        } else {
            // Если имя уже есть в HashMap, увеличиваем количество вхождений на 1
            names.put(name, count + 1);
        }
    }

    // Метод для вывода содержимого HashMap
    public void showNamesOccurrences() {
        System.out.println(names);
  }
}


// Не удаляйте и не меняйте метод Main! 
public class Printer {
    public static void main(String[] args) {
        String name1;
        String name2;
        String name3;
        String name4;
        String name5;
      
        if (args.length == 0) {
            name1 = "Elena";
            name2 = "Elena";
            name3 = "Elena";
            name4 = "Elena";
            name5 = "Ivan";
        } else {
            name1 = args[0];
            name2 = args[1];
            name3 = args[2];
            name4 = args[3];
            name5 = args[4];
        }      
        NamesCounter namesCounter = new NamesCounter();

        namesCounter.addName(name1);
        namesCounter.addName(name2);
        namesCounter.addName(name3);
        namesCounter.addName(name4);

        namesCounter.addName(name5);

        namesCounter.showNamesOccurrences();
    }
}
 */
/*
Необходимо разработать программу для сортировки массива целых чисел с 
использованием сортировки кучей (Heap Sort). Программа должна работать 
следующим образом:
Принимать на вход массив целых чисел для сортировки. Если массив не 
предоставлен, программа использует массив по умолчанию.
Сначала выводить исходный массив на экран.
Затем применять сортировку кучей (Heap Sort) для сортировки элементов 
массива в порядке возрастания.
Выводить отсортированный массив на экран.
Ваше решение должно содержать два основных метода: buildTree, который 
строит сортирующее дерево на основе массива, и heapSort, который выполняет 
собственно сортировку кучей. Основная часть кода предоставлена вам.
Программа должна быть способной сортировать массив, даже если он состоит 
из отрицательных чисел и имеет дубликаты.

На входе:

'5 8 12 3 6 9'
На выходе:

Initial array:
[5, 8, 12, 3, 6, 9]
Sorted array:
[3, 5, 6, 8, 9, 12]
 */
/*
import java.util.Arrays;

class HeapSort {
    public static void buildTree(int[] tree, int sortLength) {
// Построение кучи (heap) из массива tree
        for (int i = sortLength / 2 - 1; i >= 0; i--) {
            heapify(tree, sortLength, i);
        }
    }

    public static void heapSort(int[] sortArray, int sortLength) {
        // Сначала строим кучу
        buildTree(sortArray, sortLength);

        // Один за другим извлекаем элементы из кучи
        for (int i = sortLength - 1; i >= 0; i--) {
            // Перемещаем текущий корень в конец массива
            int temp = sortArray[0];
            sortArray[0] = sortArray[i];
            sortArray[i] = temp;

            // Вызываем heapify на уменьшенной куче
            heapify(sortArray, i, 0);
        }
    }

    // Метод для преобразования поддерева с корнем i в кучу с размером n
    private static void heapify(int[] tree, int n, int i) {
        int largest = i; // Инициализируем наибольший элемент как корень
        int left = 2 * i + 1; // Левый потомок
        int right = 2 * i + 2; // Правый потомок

        // Если левый потомок больше корня
        if (left < n && tree[left] > tree[largest]) {
            largest = left;
        }

        // Если правый потомок больше, чем самый большой элемент на данный момент
        if (right < n && tree[right] > tree[largest]) {
            largest = right;
        }

        // Если наибольший элемент не корень
        if (largest != i) {
            int swap = tree[i];
            tree[i] = tree[largest];
            tree[largest] = swap;

            // Рекурсивно преобразуем поддерево
            heapify(tree, n, largest);
        }
  }
}


// Не удаляйте и не меняйте метод Main! 
public class Printer {
    public static void main(String[] args) {
        int[] initArray;

        if (args.length == 0) {
            initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}
 */
