
public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.addElement(1);
		linkedList.addElement(2);
		linkedList.addElement(3);
		linkedList.addElement(4);
		linkedList.printList();
		
		LinkedList linkedList1 = new LinkedList();
		linkedList1.addElement(11);
		linkedList1.addElement(22);
		linkedList1.addElement(33);
		linkedList1.addElement(44);
		linkedList1.remove(3);
		linkedList1.printList();

	}

}
