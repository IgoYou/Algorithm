package Stack;

import java.util.LinkedList;

/**
 * @author：sanhuzhen
 * @time：2025/2/14 21:47
 * @description：用链表实现栈
 */
public class MyLinkedStack<T> {
    private final LinkedList<T> list = new LinkedList<>();

    public void push(T t){
        list.add(t);
    }

    public T pop() {
        return list.removeLast();
    }

    public T peek() {
        return list.getLast();
    }

    public int size() {
        return list.size();
    }
}
