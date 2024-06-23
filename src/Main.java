public class Main {
    public static void main(String[] args) {
// Работа с MyArrayList
        // Создаём экземпляр MyArrayList.
        MyArrayList<String> arrayList = new MyArrayList<>();
        // Добавление элемента "Элемент1" в arrayList.
        arrayList.add("Элемент1");
        // Добавление элемента "Элемент2" в arrayList.
        arrayList.add("Элемент2");
        // Добавление элемента "Элемент3" в arrayList.
        arrayList.add("Элемент3");
        // Вывод размера arrayList после добавления элементов.
        System.out.println("ArrayList после добавления элементов: " + arrayList.size());

        // Удаление элемента из arrayList по индексу 1.
        arrayList.remove(1);
        // Вывод элемента по индексу 1 после удаления.
        System.out.println("ArrayList после удаления элемента: " + arrayList.get(1));

        // Замена элемента по индексу 1 на "Новый элемент".
        arrayList.set(1, "Новый элемент");
        // Вывод элемента по индексу 1 после замены.
        System.out.println("ArrayList после замены элемента: " + arrayList.get(1));

        // Создание подсписка subArrayList из arrayList.
        MyArrayList<String> subArrayList = arrayList.subList(0, 1);
        // Вывод размера subArrayList.
        System.out.println("SubArrayList: " + subArrayList.size());

// Работа с MyLinkedList
        // Создаём новый объект MyLinkedList для хранения строк.
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        // Добавляем три элемента ("Элемент1", "Элемент2", "Элемент3") в список.
        linkedList.add("Элемент1");
        linkedList.add("Элемент2");
        linkedList.add("Элемент3");
        // Выводим в консоль размер списка после добавления элементов.
        System.out.println("LinkedList после добавления элементов: " + linkedList.size());

        // Удаляем элемент из списка, который находится на позиции с индексом 1.
        linkedList.remove(1);
        // Выводим в консоль элемент, который теперь находится на позиции с индексом 1 после удаления.
        System.out.println("LinkedList после удаления элемента: " + linkedList.get(1));

        // Заменяем элемент на позиции с индексом 1 на "Новый элемент".
        linkedList.set(1, "Новый элемент");
        // Выводим в консоль элемент, который теперь находится на позиции с индексом 1 после замены.
        System.out.println("LinkedList после замены элемента: " + linkedList.get(1));

        // Создаем подсписок из элементов списка, начиная с индекса 0 и заканчивая индексом 1 (не включительно).
        MyLinkedList<String> subLinkedList = linkedList.subList(0, 1);
        // Выводим в консоль размер подсписка.
        System.out.println("SubLinkedList: " + subLinkedList.size());
    }
}