
public class LinkedList {
	Node head;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void addElement(int data) {
		if (this.head == null) {
			this.head = new Node(data);

		} else {
			Node curnode = this.head;
			Node node = new Node(data);
			while (curnode.next != null) {
				curnode = curnode.next;
			}
			curnode.next = node;

		}
	}

	public void printList(LinkedList linkedList) {
		if (linkedList != null) {
			Node curNode = linkedList.head;
			while (curNode != null) {
				System.out.println("data: " + curNode.data);
				curNode = curNode.next;
			}
		}
	}

	public void printList() {
		if (this != null) {
			Node curNode = this.head;
			while (curNode != null) {
				System.out.println("data: " + curNode.data);
				curNode = curNode.next;
			}
		}
	}

	@SuppressWarnings("unused")
	public boolean remove(int index) {
		if (this != null) {
			int count = -1;
			Node curNode = this.head;
			Node preNode = null;
			boolean status=false;
			while (curNode != null) {
				count++;
				if (count == index) {
					if (curNode == this.head) {
						this.head = curNode.next;
						curNode = null;
						status =true;
						break;
					} else {
						preNode.next = curNode.next;
						curNode = null;
						status= true;
						break;
					}
				}
				preNode = curNode;
				curNode = curNode.next;

			}
			return status;
		}
		return false;
	}
	/*
	public boolean insert(int index,int element) {
		if(this!=null) {
			Node curNode=this.head;
			Node prevNode=null;
			int count=-1;
			while(curNode!=null) {
				
				if(++count==index) {
					C
				}
			}
		}
	}
	*/
	
	public void reverse() {
		Node cur,prev,next;
		cur=this.head;
		while(cur!=null) {
			next=cur.next;
			
		}
		
	}
}
