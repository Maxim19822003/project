
/*
 * Внутри класса MergeSort напишите метод mergeSort, который принимает 
 * массив целых чисел a и реализует алгоритм сортировки слиянием. Метод 
 * должен возвращать отсортированный массив
*/
/* 
import java.util.Arrays;

class MergeSort {
    public static int[] mergeSort(int[] a) {
        int len = a.length;
        if (len < 2) return a;
        int middle = len / 2;
        int[] left = Arrays.copyOfRange(a, 0, middle);
        int[] right = Arrays.copyOfRange(a, middle, len);
        return merge(mergeSort(left), mergeSort(right));
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
  }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
        int[] a;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}
*/
/*
 * Напишите функцию removeEvenNumbers, которая принимала бы произвольный 
 * список целых чисел, удаляла бы из него четные числа и выводила список 
 * без четных чисел.

Напишите свой код в методе removeEvenNumbers класса Answer. Метод 
removeEvenNumbers принимает на вход один параметр:

Integer[] arr - список целых чисел
 */
/*
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


class Answer {
    public static void removeEvenNumbers(Integer[] arr) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : arr) {
            if (num % 2 != 0) {
                result.add(num);
            }
        }
        System.out.println(result);
  }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
      Integer[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      Answer ans = new Answer();      
      ans.removeEvenNumbers(arr);
    }
}
*/
/*
Анализатор списка

Напишите функцию analyzeNumbers, которая принимает на вход целочисленный 
список arr и:

Сортирует его по возрастанию и выводит на экран
Находит минимальное значение в списке и выводит 
на экран - Minimum is {число}
Находит максимальное значение в списке и выводит 
на экран - Maximum is {число}
Находит среднее арифметическое значений списка и выводит 
на экран - Average is =  {число}
Напишите свой код в методе analyzeNumbers класса Answer. Метод 
analyzeNumbers принимает на вход один параметр:

Integer[] arr - список целых чисел

Пример


arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
analyzeNumbers(arr)

// [1, 2, 3, 4, 5, 6, 7, 8, 9]
// Minimum is 1
// Maximum is 9
// Average is = 5
 */