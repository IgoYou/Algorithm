package luogu;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author sanhuzhen
 * @time 3/12/25 5:41 PM
 */
public class P1223 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        PriorityQueue<Person> q = new PriorityQueue<>(
                n, (a, b) -> (a.time - b.time)
        );
        for (int i = 0; i < n; i++) {
            int time = s.nextInt();
            Person p = new Person(i, time);
            q.add(p);
        }
        double sum = 0;
        int currentTime = 0;
        while (!q.isEmpty()) {
            Person p = q.poll();
            System.out.printf("%d ", p.id + 1);
            sum += currentTime;
            currentTime += p.time;

        }
        System.out.println();
        System.out.printf("%.2f", sum / n);
    }
}

class Person {
    int id;
    int time;

    Person(int id, int time) {
        this.id = id;
        this.time = time;
    }
}
