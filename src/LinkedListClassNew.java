class NodeNewClass {
    int num;
    NodeNewClass next;

    NodeNewClass(int num) {
        this.num = num;
        this.next = null;
    }
}
class LinkListClass {
    private NodeNewClass first;

    //public LinkListClass() {
    //    first = null;
    //}

    public void addNodeNewClass(int n) {
        NodeNewClass newNodeNewClass = new NodeNewClass(n);
        newNodeNewClass.num = n;
        newNodeNewClass.next = first;
        first = newNodeNewClass;
    }


    public void addBack(int n) {
        NodeNewClass temp = new NodeNewClass(n);
        temp.num = n;
        temp.next = null;
        if (first == null) {
            first = temp;
        } else {
            NodeNewClass current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = temp;
        }
    }

    public void remove(int n) {
        NodeNewClass curr = first;
        NodeNewClass prev = curr;
        if (curr.num == (n)) {
            first = curr.next;
            return;
        }
        while (curr.num != (n)) {
            prev = curr;
            curr = curr.next;
            if (curr == null) {
                return;
            }
        }
        prev.next = curr.next;
    }

    public void display() {
        if (first == null) {
            System.out.println("List is empty.");
            return;
        }

        NodeNewClass current = first;
        System.out.println(current.next.next.next.num);
        System.out.println("being display");
        while (current != null) {
            System.out.print(current.num + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    /*ublic String display() {
        NodeNewClass current = first;
        String data = "";
        while (current.next != null) {
            data += " " + current.num + " --> ";
            current = current.next;
        }
        data += " " + current.num + " --> ";
        return data;
    }*/
}
class LinkListClassNew {

    public static void main(String[] args) {

        // create an object of LinkedList
        LinkListClass LL = new LinkListClass();

        // assign values to each linked list NodeNewClass
        //NodeNewClass.first = new LL.NodeNewClass(1);
        LL.addNodeNewClass(1);
        LL.addNodeNewClass(2);
        LL.addNodeNewClass(3);
        LL.addBack(5);
        LL.addBack(7);
        //LL.NodeNewClass second = new LL.NodeNewClass(2);
        //LL.NodeNewClass third = new LL.NodeNewClass(3);

        // connect each NodeNewClass of linked list to next NodeNewClass
        //LL.first.next = second;
        //second.next = third;

        // printing NodeNewClass-value
        System.out.print("LinkedList: ");
        LL.display();

        //while (LL.first != null) {
        //    System.out.print(LL.first.num + " ");
        //    LL.first = LL.first.next;
        //}
    }
}



