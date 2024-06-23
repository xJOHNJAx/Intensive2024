/**
 * Моя реализация LinkedList.
 */
public class MyLinkedList<E> {
    // Определение начальных узлов: головы и хвоста списка
    private Node<E> head;
    private Node<E> tail;
    // Определение размера списка.
    private int size = 0;

    // Внутренний класс Node, который определяет узел связного списка.
    private static class Node<E> {
        E item; // Данные, хранящиеся в узле.
        Node<E> next; // Ссылка на следующий узел.
        Node<E> prev; // Ссылка на предыдущий узел.

        // Конструктор узла, устанавливающий предыдущий и следующий узлы, а также данные.
        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.prev = prev;
            this.next = next;
        }
    }

    // Конструктор MyLinkedList, инициализирующий пустой список с заглушками для головы и хвоста.
    public MyLinkedList() {
        head = new Node<>(null, null, null);
        tail = new Node<>(head, null, null);
        head.next = tail;
    }

    /**
     * Добавляет элемент в конец списка.
     * @param e элемент для добавления
     */
    // Метод для добавления элемента в конец списка.
    public void add(E e) {
        Node<E> newNode = new Node<>(tail.prev, e, tail);
        tail.prev.next = newNode;
        tail.prev = newNode;
        size++;
    }

    /**
     * Удаляет элемент по индексу.
     * @param index индекс удаляемого элемента
     * @return удаленный элемент
     */
    // Метод для удаления элемента по индексу.
    public E remove(int index) {
        Node<E> x = getNode(index);
        E item = x.item;
        x.prev.next = x.next;
        x.next.prev = x.prev;
        size--;
        return item;
    }

    /**
     * Возвращает элемент по индексу.
     * @param index индекс элемента
     * @return элемент
     */
    // Метод для получения элемента по индексу.
    public E get(int index) {
        return getNode(index).item;
    }

    /**
     * Заменяет элемент по индексу.
     * @param index индекс заменяемого элемента
     * @param element новый элемент
     * @return старый элемент
     */
    // Метод для замены элемента по индексу.
    public E set(int index, E element) {
        Node<E> x = getNode(index);
        E oldVal = x.item;
        x.item = element;
        return oldVal;
    }

    /**
     * Возвращает подсписок.
     * @param fromIndex начальный индекс (включительно)
     * @param toIndex конечный индекс (исключительно)
     * @return подсписок
     */
    // Метод для получения подсписка из списка.
    public MyLinkedList<E> subList(int fromIndex, int toIndex) {
        MyLinkedList<E> sub = new MyLinkedList<>();
        Node<E> start = getNode(fromIndex);
        for (Node<E> x = start; x != getNode(toIndex); x = x.next) {
            sub.add(x.item);
        }
        return sub;
    }

    /**
     * Возвращает размер списка.
     * @return размер списка
     */
    // Метод для получения размера списка.
    public int size() {
        return size;
    }

    /**
     * Возвращает узел по индексу.
     * @param index индекс узла
     * @return узел
     */
    // Вспомогательный метод для получения узла по индексу.
    private Node<E> getNode(int index) {
        Node<E> x = head.next;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }
}