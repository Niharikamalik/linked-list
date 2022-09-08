class Main
{
	public static void main(String[] args) {
	    Node head = new Node(10);
	    head.next = new Node(20);
	    head.next.next =new Node(30);
	    head.next.next.next = new Node(40);
	    head.next.next.next.next= new Node(50);
	    printlist(head);
	    System.out.println(" Middle of linked list : "+ mid(head));
	    
	}
	static int mid(Node head){
	  Node slow = head,fast =head;
	  if (head == null) return 0 ;
	  while(fast != null && fast.next != null){
	     slow = slow.next;
	     fast = fast.next.next;
	  }
	  return slow.data;
     }
	static void printlist(Node head){
	    Node cur = head;
	    while (cur != null){
	        System.out.print(cur.data+" ");
	        cur = cur.next;
	    }
	    System.out.println();
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
