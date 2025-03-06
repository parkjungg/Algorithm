package Silver;

import java.util.Arrays;
import java.util.Scanner;

// Silver 5
public class Num10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Person[] p = new Person[N];
        for (int i = 0; i < N; i++) {
            p[i] = new Person(sc.nextInt(), sc.next(), i);
        }
        Arrays.sort(p,(o1, o2) -> {
            if(o1.age == o2.age) {
                return Integer.compare(o1.order, o2.order);
            }
            return Integer.compare(o1.age, o2.age);
        });

        for (Person person : p) {
            System.out.println(person.age + " " + person.name);
        }
        sc.close();
    }
}

class Person {
    int age;
    String name;
    int order;

    public Person(int age, String name, int order) {
        this.age = age;
        this.name = name;
        this.order = order;
    }
}
