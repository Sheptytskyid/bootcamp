package algorithms;

public class AddLinkedLists {

    public static void main(String[] args) {
        Node n1 = new Node(7);
        Node next = new Node(1);
        n1.next = next;
        next.next = new Node(6);
        next = next.next;
        next.next = new Node(1);

        Node n2 = new Node(5);
        next = new Node(9);
        n2.next = next;
        next = n2.next;
        next.next = new Node(2);

        Node sum = add(n1, n2, 0);
        while (sum != null) {
            System.out.print(sum.data + " ");
            sum = sum.next;
        }
    }

    private static Node add(Node n1, Node n2, int carry) {
        if (n1 == null && n2 == null && carry == 0) {
            return null;
        }
        if (n1 != null) {
            carry += n1.data;
        }
        if (n2 != null) {
            carry += n2.data;
        }
        Node node = new Node(carry % 10);
        node.next = add(n1 == null ? null : n1.next, n2 == null ? null : n2.next, carry >= 10 ? 1 : 0);
        return node;
    }
}
