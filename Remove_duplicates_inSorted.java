class Main
{
	public static void main(String[] args) {
	    Node head = new Node(10);
	    head.next = new Node(20);
	    head.next.next =new Node(20);
	    head.next.next.next = new Node(40);
	    head.next.next.next.next= new Node(50);
	    printlist(head);
	    head = reverse(head);
	    printlist(head);
	}
	static Node reverse(Node head)
    {
        Node curr = head;
        if(head ==  null) return null;
        while(curr!=null && curr.next!= null){
            if(curr.data == curr.next.data)
               curr.next = curr.next.next;
            else curr = curr.next;
        }
        return head;
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
