class Main
{
	public static void main(String[] args) {
	    Node head = new Node(10);
	    head.next = new Node(20);
	    head.next.next =new Node(30);
	    head.next.next.next = new Node(40);
	    head.next.next.next.next= new Node(50);
	    printlist(head);
	    int n = 35;
	    sortedInsert(head ,n) ;
	    System.out.println("After insertion : ");
	    printlist(head);
	}
	static Node sortedInsert(Node head ,int n){
	     Node temp = new Node(n);
	    Node curr = head;
	    while(curr != null){
	        if(curr.data > n){
	            temp.next = curr;
	            curr = temp;
	            return curr;
	        }
	        else if (curr.next == null){
	            curr.next = temp;
	            temp.next = null;
	            return head;
	        }
	        else if(curr.next.data>n){
	            temp.next = curr.next;
	            curr.next = temp;
	            return head;
	        }
	        else curr=curr.next;
	    }
	    
	    return head;
    }
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
