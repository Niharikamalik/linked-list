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
	    Node index = head.next.next;
	    addNode(index ,n) ;
	    System.out.println("After insertion : ");
	    printlist(head);
	}
	static void addNode(Node index,int n){
	    if (index == null){
	        System.out.print("null");
	        return;
	    }
	    Node temp = new Node(n);
        temp.next = index.next;
        index.next = temp;
        
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
/*************************************** Another method is ******************************************/
// public static int addNode(Node node, int ind)
//     {
//       //Your code here
//         int i = 0;
//       while(node != null) {
//           i++;
//           if(i == ind) return node.data;
//           node = node.next;
//       }
//       return -1;
//     }
