class NodeDisplay {
    public char letter;
    public NodeDisplay next;
    public NodeDisplay(char letter) {
        this.letter=letter;
        next=null;
    }
}
class LinkListDisplay {
    public static void dostuff(NodeDisplay head) {
        if(head!=null) {
            dostuff(head.next);
            System.out.print(head.letter);
        }
    }

    public static void main(String[] args) {
        NodeDisplay head = null;

        head=new NodeDisplay('A');
        head.next=new NodeDisplay('B');
        head.next.next=new NodeDisplay('C');
        head.next.next.next=new NodeDisplay('D');
        head.next.next.next.next=new NodeDisplay('E');

        dostuff(head);
    }
}