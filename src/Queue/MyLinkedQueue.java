package Queue;

import java.util.LinkedList;

/**
 * @author：sanhuzhen
 * @time：2025/2/14 21:54
 * @description：
 */
public class MyLinkedQueue<T> {
    private final LinkedList<T> list = new LinkedList<>();

    public void push(T t) {
        list.add(t);
    }

    public T pop() {
        return list.removeFirst();
    }
    public T peek() {
        return list.getFirst();
    }

    public int size() {
        return list.size();
    }

}
