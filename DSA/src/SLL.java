package DataStructure.LinkedList.singly;

class node {
   int data;
   node next;

    node(int data){
        this.data = data;
        this.next = null;
    }
}
public class SLL {
    node head;
    SLL(){
        head=null;
    }
         void insertathead(int val){
           node n=new node(val);
            n.next=head;
            head=n;
        }
        void insertattail(int val) {
            node n = new node(val);
            if (head==null){
                head=n;
                return;
            }
            node temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
        }
        void printSLL() {
            node temp = head;
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        void deleteathead(){
                if(head == null){
                    System.out.println("There are no elemnets");
                }
                Node toDelete = head;
                head = head.next;
                toDelete = null;
            }
            void deletebyval(int val){
                

            }
        }

    public void insertattail() {
    }
}
class driver{
    static void main(String[] args) {
        SLL sll=new SLL();
        sll. insertattail() ;
        sll.printSLL();
        System.out.println();
        sll.insertathead(10);
        sll.insertathead(20);
        sll.insertathead(30);
        sll.insertathead(40);
        sll.insertathead(50);
        sll.printSLL();
    }
}