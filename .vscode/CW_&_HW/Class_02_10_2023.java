/*
1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. 
Сравните с предыдущим.
*/
/* 
public static void main(String[] args) {
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new LinkedList<>();
    System.out.println(testSpeed(list1));
    System.out.println(testSpeed(list2));
}

private static long testSpeed(List<Integer> list1) {
    long timeStart1 = System.currentTimeMillis();
    for (int i = 0; i < 100000; i++) {
        list1.add(list1.size()/2, i);
    }
long timeFinish1 = System.currentTimeMillis();
return timeFinish1 - timeStart1;
}
*/
/*
 * Реализовать консольное приложение, которое:
Принимает от пользователя строку вида
text~num
Нужно рассплитить строку по ~, сохранить text в связный список на позицию 
num.
Если введено print~num, выводит строку из позиции num в связном списке и 
удаляет её из списка.
 */
/*
 * public static void main(String[] args) {
List<String> list = new LinkedList<>();
Scanner scanner = new Scanner(System.in);
boolean work = true;
while (work){
String line = scanner.nextLine();
String[] parts = line.split("~");
String text = parts[0];
String strNum = parts[1];
int num = Integer.parseInt(strNum);
switch (text){
case "print":
System.out.println(list.remove(num));
break;
case "finish":
work = false;
break;
default:
list.add(num, text);
}
}
}
 */
/*
public static void main(String[] args) {
List<String> list = new LinkedList<>();
Scanner scanner = new Scanner(System.in);
boolean work = true;
while (work){
String line = scanner.nextLine();
String[] parts = line.split("~");
String text = parts[0];
String strNum = parts[1];
int num = Integer.parseInt(strNum);
switch (text){
case "print":
System.out.println(list.remove(num));
break;
case "finish":
work = false;
break;
default:
list.add(num, text);
}
}
}
 */
/*
 * 1) Написать метод, который принимает массив элементов, помещает их в 
 * стэк и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов, помещает их в 
очередь и выводит на консоль содержимое очереди.
 */
/*
public static void main(String[] args) {
String[] arr = new String[]{"1", "2", "3", "4"};
testQueue(arr);
}

static void testQueue(String[] arr){
Queue<String> queue = new LinkedList<>();
queue.addAll(Arrays.asList(arr));

// System.out.println(queue);

// for (String s: queue){
// System.out.println(s);
// }

while (!queue.isEmpty()){
System.out.println(queue.poll());
}
}

static void testStack(String[] arr){
Stack<String> stack = new Stack<>();
stack.addAll(Arrays.asList(arr));

// System.out.println(stack);

// for (String s: stack){
// System.out.println(s);
// }

while (!stack.empty()){
System.out.println(stack.pop());
}
}
 */
/*
 * 
 */