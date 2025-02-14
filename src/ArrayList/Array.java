package ArrayList;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        // 添加元素
        for (int i = 0; i < 5; i++) {
            arr.add(i);
        }

        // 在索引2处添加元素
        arr.add(2, 666);

        // 在头部添加元素
        arr.add(0, 555);

        // 删除索引为2的元素
        arr.remove(2);

        // 删除末尾元素
        arr.remove(arr.size() - 1);

        // 根据索引查找元素
        int num = arr.get(2);

        // 根据索引改变元素
        arr.set(2, 200);

        // 找到该元素的位置, 没找到返回 -1
        int index = arr.indexOf(5);

        System.out.println(arr);
        System.out.println(num + " "+ index);
    }
}
