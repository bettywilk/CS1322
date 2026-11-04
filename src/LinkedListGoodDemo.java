//import java.util.LinkedList;
class NodeDemo {
    int data;
    NodeDemo next;

    public NodeDemo(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    NodeDemo head;

    public void add(int data) {
        NodeDemo newNodeDemo = new NodeDemo(data);

        if (head == null) {   // empty linked list
            head = newNodeDemo;
        } else {
            NodeDemo current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNodeDemo;
        }
    }

    public void removeHead() {
        NodeDemo current = head;
        if (current.next != null) {
            head = current.next;
        }
    }

    public void removeLast() {
        if (head == null) {
            return; // Empty list
        }
        if (head.next == null) {
            head = null; // Only one NodeDemo
            return;
        }
        NodeDemo current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null; // Remove the last NodeDemo
    }
    public void printList() {
        NodeDemo current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void printNextNextNextData() {
        NodeDemo current = head;
        System.out.println(current.next.next.next.data);

    }
    public NodeDemo deleteMiddle() {
        if (head == null || head.next == null) {
            return null; // Empty or single-NodeDemo list
        }
        NodeDemo slow = head;
        NodeDemo fast = head;
        NodeDemo prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        // 'slow' now points to the middle NodeDemo
        prev.next = slow.next;
        return head;
    }

    public void deleteNodeDemo(int key) {
        NodeDemo current = head;
        NodeDemo prev = null;
        // Case 1: Delete head NodeDemo
        if (head != null && head.data == key) {
            head = head.next;
            return;
        }
        // Case 2: Delete NodeDemo in the middle or end
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("Element not found: " + key);
            return; // Key not found
        }
        prev.next = current.next;
    }
}
public class LinkedListGoodDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);  // .next
        list.add(2);  // .next
        list.add(3);  // .next
        list.add(4);  // .data
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.print("next.next.next.data  ");
        list.printNextNextNextData();

        list.printList();
        list.removeHead();
        list.removeHead();
        list.printList();
        System.out.print("next.next.next.data  ");
        list.printNextNextNextData();
        //list.removeHead();
        //list.removeHead();
        //list.removeHead();
        list.removeLast();
        list.deleteMiddle();
        list.printList();
        list.deleteNodeDemo(5);
        list.printList();
        System.out.print("next.next.next.data  ");
        list.printNextNextNextData();
    }
}

