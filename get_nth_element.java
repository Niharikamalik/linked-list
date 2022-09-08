class Main
{
	public static void main(String[] args) {
	    Node head = new Node(10);
	    head.next = new Node(20);
	    head.next.next =new Node(30);
	    head.next.next.next = new Node(40);
	    head.next.next.next.next= new Node(50);
	    printlist(head);
	    int n = 3;
	    System.out.println(" nth element of linked list : "+ getNth(head,n));
	    
	}
	static int getNth(Node head,int n ){
	    int count = 0;
	    for(Node i = head; i != null ; i = i.next)
	       count++;
	   if(count<n) return 0 ;    
	   Node curr = head;    
	    for(int i=1;i<count-n+1;i++)
	       curr = curr.next;
	   return  curr.data  ;  
	    
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
