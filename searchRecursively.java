class Main
{
	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		Node temp3 = new Node(40);
		head.next =temp1;
		temp1.next=temp2;
		temp2.next=temp3;
		int x = 30;
		System.out.print(head.data+" " + temp1.data+" "+temp2.data+" "+temp3.data+"\n");
		
		System.out.print(search(head , x));
	}
	public static int  search(Node head,int x){
	    if(head==null)return -1;
	    if(head.data==x)return 1;
	    else{
	        int res = search(head.next , x);
	        if(res==-1) return -1;
	        else return (res+1);
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
