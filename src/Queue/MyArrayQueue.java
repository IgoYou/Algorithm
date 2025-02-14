package Queue;

import java.util.ArrayList;

/**
 * @author：sanhuzhen
 * @time：2025/2/14 22:30
 * @description：
 */
public class MyArrayQueue<T> {
    private final ArrayList<T> arr = new ArrayList<>();

    public void push(T t) {
        arr.add(t);
    }

    public T pop() {
        return arr.remove(arr.size() - 1);
    }

    public T peek() {
        return arr.get(0);
    }
    public int size() {
        return arr.size();
    }
}
