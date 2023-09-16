package LinkedList;

public class LL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // creating a newNode
        Node newNode = new Node(data);
        size++;
        // Base case
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    public void addAtAnyIndex(int indx, int data) {
        if (indx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        int i = 0;
        Node temp = head;
        while (i < indx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removefirst() {
        if (size == 0) {
            System.out.println("LinkedList is Empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public int removelast() {
        if (size == 0) {
            System.out.println("LinkedList is Empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int IterativeSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // Reverse a Linked List
    public void reverse() {
        // 3 variables , 4 steps
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void Print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LL l = new LL();
        l.addFirst(1);
        l.addFirst(2);
        l.addLast(3);
        l.addAtAnyIndex(2, 5);
        l.Print();
        l.reverse();
        l.Print();

        // l.removefirst();
        // l.Print();

        // l.removelast();
        // l.Print();

        // System.out.println(l.IterativeSearch(3));
        // System.out.println(l.IterativeSearch(1));

    }
}
