class Main
{
	public static void main(String[] args) {
	    Node head = null;
	    head = insertBegin(head,10);
	    head = insertBegin(head,20);
	    head = insertBegin(head,30);
	    head = insertBegin(head,40);
	    head = insertBegin(head,50);
	    printlist(head);
	}
	static Node insertBegin(Node head,int x){
	    Node new_node = new Node(x);
	    new_node.next = head;
      head = new_node
	    return head;
	}
	static void printlist(Node head){
	    Node cur = head;
	    while (cur != null){
	        System.out.print(cur.data+" ");
	        cur = cur.next;
	    }
	    
	}
}
class Node{
        int data;
        Node next;
        Node(int x){
            data = x;
            next= null;
        }
    }

