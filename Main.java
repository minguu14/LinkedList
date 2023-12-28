package LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList1 = new MyLinkedList<>();
        MyLinkedList<Character> myLinkedList2 = new MyLinkedList<>();
        MyLinkedList<Integer> myLinkedList3 = new MyLinkedList<>();
        MyLinkedList<Integer> myLinkedList4 = new MyLinkedList<>();

        myLinkedList1.add(2);
        myLinkedList1.add(4);
        myLinkedList1.add(8);
        myLinkedList1.add(12);
        myLinkedList1.add(24);

        myLinkedList2.add('A');
        myLinkedList2.add('B');
        myLinkedList2.add('D');
        myLinkedList2.add('F');
        myLinkedList2.add('C');

        myLinkedList3.push(10);
        myLinkedList3.push(20);
        myLinkedList3.push(30);
        myLinkedList3.push(40);
        myLinkedList3.push(50);

        myLinkedList3.pop();
        myLinkedList3.pop();
        myLinkedList3.pop();

        System.out.println("\n - - - - - - - - - -\n");

        myLinkedList4.enqueue(100);
        myLinkedList4.enqueue(200);
        myLinkedList4.enqueue(300);
        myLinkedList4.enqueue(400);
        myLinkedList4.enqueue(500);

        myLinkedList4.dequeue();
        myLinkedList4.dequeue();
        myLinkedList4.dequeue();

        for (Integer value : myLinkedList1) {
            System.out.println(value);
        }

        System.out.println("\n - - - - - - - - - -\n");

        for (Character value : myLinkedList2) {
            System.out.println(value);
        }

        System.out.println("\n - - - - - - - - - -\n");

        for (Integer value : myLinkedList3) {
            System.out.println(value);
        }

        System.out.println("\n - - - - - - - - - -\n");

        for (Integer value : myLinkedList4) {
            System.out.println(value);
        }

    }
}
