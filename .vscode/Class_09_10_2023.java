//public class Main {
/* 
1. Создайте HashSet, заполните его следующими числами: 
{1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
2. Создайте LinkedHashSet, заполните его следующими числами: 
{1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
3. Создайте TreeSet, заполните его следующими числами: 
{1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
*/
/* 
    public static void main(String[] args){
        Integer[] arr = new Integer[]{1, 2, 3, 2, 4, 5, 6, 3};
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr));
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(arr));

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }
}
*/
/*
1. Напишите метод, который заполнит массив из 1000 элементов случайными 
цифрами от 0 до 24.
2. Создайте метод, в который передайте заполненный выше массив и с помощью 
Set вычислите процент уникальных значений в данном массиве и верните его 
в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее 
количество чисел в массиве.
 */
/*
public static void main(String[] args) {
Integer [] arr1 = randomArray(0, 24, 30);
System.out.println(Arrays.toString(arr1));
double a = procent(arr1);
System.out.println(a);
}

static Integer [] randomArray (int min, int max, int size) {
Random random = new Random();
Integer [] arr = new Integer [size];
for (int i = 0; i < size; i++) {
arr[i] = random.nextInt(min, max + 1);
}
return arr;
}

static double procent (Integer [] arr) {
Set<Integer> list = new HashSet<>(Arrays.asList(arr));
double size = list.size();
double res = size * 100 / arr.length;
return res;
}

}
 */
/*
1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны 
для приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачёва
Можно записать в текстовом виде, не обязательно реализовывать в java.

1. Реализуйте 1 из вариантов класса Cat из предыдущего задания,
можно использовать не все придуманные поля и методы.
Создайте несколько экземпляров этого класса, выведите их в консоль.
2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась 
его кличка, цвет и возраст
(или другие параметры на ваше усмотрение).

1. Создайте множество, в котором будут храниться экземпляры класса Cat - 
HashSet<Cat>.
Поместите в него некоторое количество объектов.
2. Создайте 2 или более котов с одинаковыми параметрами в полях.
Поместите их во множество. Убедитесь, что все они сохранились во множество.
3. Создайте метод public boolean equals(Object o)
Пропишите в нём логику сравнения котов по параметрам, хранимым в полях.
То есть, метод должен возвращать true, только если значения во всех полях 
сравниваемых объектов равны.
4. Выведите снова содержимое множества из пункта 2, убедитесь, что 
дубликаты удалились.
*/
/* 
public static void main(String[] args) {
Set<Cat> cats = new HashSet<>();
Cat cat1 = new Cat();
cat1.name = "Барсик";
cat1.age = 10;
cat1.poroda = "Сфинкс";
cat1.owner = "Наталья Ивановна";

Cat cat2 = new Cat();
cat2.name = "Мурзик";
cat2.age = 9;
cat2.poroda = "Персидская";
cat2.owner = "Семен Петрович";

Cat cat3 = new Cat();
cat3.name = "Барсик";
cat3.age = 10;
cat3.poroda = "Сфинкс";
cat3.owner = "Наталья Ивановна";

Cat cat4 = new Cat();
cat4.name = "Машка";
cat4.age = 5;
cat4.poroda = "Мейнкун";
cat4.owner = "Кирилл Максимович";

cats.add(cat1);
cats.add(cat2);
cats.add(cat3);
cats.add(cat4);

printSet(cats);
System.out.println();
printSet(findByAge(cats, 10));
}

static void printSet(Set<Cat> cats){
for (Cat cat: cats){
System.out.println(cat);
}
}

static Set<Cat> findByAge(Set<Cat> cats, int minAge){
Set<Cat> list = new HashSet<>();
for (Cat cat: cats){
if (cat.age >= minAge){
list.add(cat);
}
}
return list;
}
 */