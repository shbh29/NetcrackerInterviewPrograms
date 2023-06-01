import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


class MyClass {
    private int key;
    private int count;

    public MyClass(int key, int count) {
        this.key = key;
        this.count = count;
    }

    public int getKey() {
        return key;
    }

    public int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return key == myClass.key && count == myClass.count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, count);
    }
}

public class Main {




    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(8);
//        list.add(5);
//        list.add(12);
//        list.add(20);
//        list.add(20);
//        list.add(20);
//        list.add(25);
//        list.add(25);
//        list.add(50);
//        list.add(50);
//        list.add(50);
//        list.add(50);

//        Map<Integer, Integer> keyCountPair = new HashMap<>();
//        list.stream().flatMap(e -> {
//            if(keyCountPair.containsKey(e)) {
//                keyCountPair.put(e, keyCountPair.get(e) + 1);
//            } else {
//                keyCountPair.put(e, 1);
//            }
//            return keyCountPair.entrySet().stream();
//        }).

        //[50, 20, 25, 2, 5]

//        Pairwise swap elements of a given linked list
//Input:  1 —> 2 —> 3 —> 4 —> 5 —> 6 —> 7 —> 8 —> NULL
//Output: 2 —> 1 —> 4 —> 3 —> 6 —> 5 —> 8 —> 7 —> NULL

        LinkedList l = new LinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);

        l.printLinkedList();
        l.swipeOnEvenIndex();
        l.printLinkedList();
    }

    static class Node {

        Node next;

        int value;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    static class LinkedList {
        Node head;
        int length;

        LinkedList() {        }

        public void add(int n) {
            Node newNode = new Node( n, null);
            if (this.head == null) {this.head = newNode; return;}
            Node temp = this.head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        //&& temp.next.next != null
        void swipeOnEvenIndex() {
            Node temp = this.head;
            Node prev = null;
            boolean isHead = true;
            while (temp != null && temp.next != null) {
                Node a = temp;
                Node b = a.next;
                a.next = b.next;
                b.next = a;
                if (isHead) {
                    isHead = false;
                    this.head = b;
                }
                if(prev != null) {
                    prev.next = b;
                }
                prev = a;
                temp = a.next;
            }
        }

        void printLinkedList() {
            if(this.head == null) {
                System.out.println("Empty List");
                return;
            }
            Node temp = this.head;
            do {
                System.out.print(" "+temp.value);
                temp = temp.next;
            } while(temp != null);

            System.out.println();

        }


    }


}