package ArrayList;

import java.util.NoSuchElementException;

/**
 * @author：sanhuzhen
 * @time：2025/2/14 20:12
 * @description：实现自己的ArrayList
 */
public class MyArrayList<T> {
    // 存放数据的底层数组
    private T[] data;
    // 数组当前元素个数
    private int size;
    // 默认初始容量
    private static final int INIT_CAP = 1;

    public MyArrayList() {
        this(INIT_CAP);
    }

    public MyArrayList(int initCapacity) {
        data = (T[]) new Object[initCapacity];
        size = 0;
    }

    // 增加元素
    public void addLast(T t) {
        // 看看数组空间够不够
        int cap = data.length;

        if (size == cap) {
            resize(2 * cap);
        }
        data[size] = t;
        size++;
    }

    public void add(int index, T t) {
        // 先判断索引是否越界
        checkPositionIndex(index);

        int cap = data.length;
        if (cap == size) {
            resize(2 * cap);
        }

        for (int i = size; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = t;
        size++;
    }

    public void addFirst(T t) {
        add(0, t);
    }

    // 删除元素
    public void removeLast() {
        if (size == 0)
            throw new NoSuchElementException();
        int cap = data.length;
        // 节约空间
        if (size == cap / 4) {
            resize(cap / 2);
        }
        data[size - 1] = null;
        size--;
    }

    public void remove(int index) {
        checkElementIndex(index);

        int cap = data.length;
        if (size == cap / 4) {
            resize(cap / 2);
        }
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        data[size - 1] = null;
        size--;
    }

    public void removeFirst() {
        remove(0);
    }

    // 查找元素
    private T get(int index) {
        checkElementIndex(index);

        return data[index];
    }

    // 改变元素
    private void set(int index, T t) {
        checkElementIndex(index);

        data[index] = t;
    }

    // 返回元素个数
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // 是否该索引可以添加元素
    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }

    // 是否该索引可以删除元素
    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    private void checkPositionIndex(int index) {
        if (!isPositionIndex(index))
            throw new IndexOutOfBoundsException("Index: " + index + "越界！");
    }

    private void checkElementIndex(int index) {
        if (!isElementIndex(index))
            throw new IndexOutOfBoundsException("Index: " + index + "不存在！");
    }

    // 扩容
    private void resize(int newCap) {
        T[] temp = (T[]) new Object[newCap];
        for (int i = 0; i < size; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
}
