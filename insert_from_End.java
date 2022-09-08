class Main
{
	public static void main(String[] args) {
	    Node head = null;
	    head = insertEnd(head,10);
	    head = insertEnd(head,20);
	    head = insertEnd(head,30);
	    head = insertEnd(head,40);
	    head = insertEnd(head,50);
	    printlist(head);
	}
	static Node insertEnd(Node head,int x){
        Node temp = new Node(x);
        if(head==null) return temp ;
        Node curr = head;
        while (curr.next != null)
             curr = curr.next;
        curr.next = temp;
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
