class Main
{
	public static void main(String[] args) {
	    Node head = new Node(10);
	    head.next = new Node(20);
	    head.next.next =new Node(30);
	    head.next.next.next = new Node(40);
	    head.next.next.next.next= new Node(50);
	    printlist(head);
	    int x = 30 ;
	    deletebegin(head,x) ;
	    System.out.println("After insertion : ");
	    printlist(head);
	}
	static Node deletebegin(Node head,int x ){
	    Node temp=head;
             while(temp.next!=null){
                 if(temp.next.data==x){
                     temp.next=temp.next.next;
                 }
                 else{
                     temp=temp.next;
                 }
             }
            if(head.data==x){
                 head=head.next;
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
