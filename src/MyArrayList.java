/**
 * Моя реализация ArrayList.
 */
public class MyArrayList<E> {
    // Объявление массива для хранения элементов списка.
    private Object[] elements;
    // Объявление переменной для отслеживания размера списка.
    private int size = 0;

    // Конструктор, который инициализирует массив с начальной емкостью 10 элементов.
    public MyArrayList() {
        elements = new Object[10];
    }

    /**
     * Добавляет элемент в список.
     * @param e элемент для добавления
     */
    // Метод add проверяет, достаточно ли места в массиве для нового элемента, и при необходимости увеличивает его размер.
    public boolean add(E e) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = e;
        return true;
    }

    /**
     * Удаляет элемент по индексу.
     * @param index индекс удаляемого элемента
     * @return удаленный элемент
     */
    // Метод remove удаляет элемент из массива, сдвигая все последующие элементы на одну позицию влево.
    public E remove(int index) {
        E oldValue = (E) elements[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index+1, elements, index, numMoved);
        }
        elements[--size] = null;
        return oldValue;
    }

    /**
     * Возвращает элемент по индексу.
     * @param index индекс элемента
     * @return элемент
     */
    // Метод get возвращает элемент по указанному индексу.
    public E get(int index) {
        return (E) elements[index];
    }

    /**
     * Заменяет элемент по индексу.
     * @param index индекс заменяемого элемента
     * @param element новый элемент
     * @return старый элемент
     */
    // Метод set заменяет элемент в указанной позиции на новый элемент и возвращает старый.
    public E set(int index, E element) {
        E oldValue = (E) elements[index];
        elements[index] = element;
        return oldValue;
    }

    /**
     * Возвращает подсписок.
     * @param fromIndex начальный индекс (включительно)
     * @param toIndex конечный индекс (исключительно)
     * @return подсписок
     */
    // Метод subList создает новый список, содержащий элементы из заданного диапазона индексов.
    public MyArrayList<E> subList(int fromIndex, int toIndex) {
        MyArrayList<E> sub = new MyArrayList<>();
        for (int i = fromIndex; i < toIndex; i++) {
            sub.add((E) elements[i]);
        }
        return sub;
    }

    /**
     * Возвращает размер списка.
     * @return размер списка
     */
    // Метод size возвращает текущее количество элементов в списке.
    public int size() {
        return size;
    }

    // Вспомогательный метод resize удваивает размер массива, когда в нем заканчивается место.
    private void resize() {
        Object[] newElements = new Object[elements.length * 2];
        System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }
}
