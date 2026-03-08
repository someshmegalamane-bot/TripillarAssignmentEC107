public class DLL {
    class node {
        int data;
        node next;
        node previous;

        node(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    public class SLL {
        node head;

        DLL() {
            head = null;
        }

        void insertathead(int val) {
            node n = new node(val);
            if (head != null) {
                n.next = head;
                head.previous = n;
            }
            head = n;
        }

        void insertattail(int val) {
            node n = new node(val);
            if (head = null) {
                head = n;
                return;
            }
            node temp = head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=n;
            n.previous=temp;
        }
        void addEdge(int)
    }
}
