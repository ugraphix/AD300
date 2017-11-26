
public class Project7 {


	public static void main (String[] args) throws java.lang.Exception
	{
		
	
		
		//create linked list
		LinkedListT a = new LinkedListT();
		a.addAtBegin(4);
		a.addAtBegin(26);
		a.addAtBegin(33);
		a.addAtBegin(58);
		a.addAtBegin(67);
		a.addAtBegin(72);
		a.addAtBegin(79);
		a.addAtBegin(86);
		a.addAtBegin(89);
		a.addAtBegin(92);
		a.addAtBegin(125);
		
		//print out lists
		System.out.print("Original Link List: ");
		System.out.println();
		a.display(a.head);
		a.reverseRecursion(a.head,a.head.next,null);
		System.out.println("");
		
	}
}
class Node{
	public int data;
	public Node next;
	public Node(int data){
		this.data = data;
		this.next = null;
	}
}
class LinkedListT{
	public Node head;
	public LinkedListT(){
		head=null;
	}

	public void addAtBegin(int data){
		Node n = new Node(data);
		n.next = head;
		head = n;
	}

	//Reverse the ptrOne and ptrTwo
	public void reverseRecursion(Node ptrOne,Node ptrTwo, Node prevNode){
		if(ptrTwo!=null){
			if(ptrTwo.next!=null){
				Node t1 = ptrTwo;
				Node t2 = ptrTwo.next;
				ptrOne.next = prevNode;
				prevNode = ptrOne;
				reverseRecursion(t1,t2, prevNode);
			}
			else{
				ptrTwo.next = ptrOne;
				ptrOne.next = prevNode;
				System.out.println();
				System.out.println("Reverse Through Recursion");
				display(ptrTwo);
			}
		}
		else if(ptrOne!=null){
			System.out.println();
			System.out.println("Reverse Through Recursion");
			display(ptrOne);
		}
	}


	public void display(Node head){
		//print list numbers
		Node currNode = head;
		while(currNode!=null){
			System.out.print(currNode.data + "," );
			currNode=currNode.next;
		}
		System.out.println();
	}
}


