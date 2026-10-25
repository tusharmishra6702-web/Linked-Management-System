package linkedlist;

import java.util.HashSet;
import java.util.Set;



public class DoublyLinkedList extends LinkedList {
	private Node head;
	private Node tail;
	private static class Node{
		int val;
		Node next;
		Node prev;
		Node(int val){
			this.val=val;
		}
	}
	DoublyLinkedList(){
		this.head = null;
		this.tail = null;
	}
	public void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}
	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if(tail == null) {
			tail = newNode;
			head = newNode;
			return;
		}

		newNode.prev= tail;
		tail.next = newNode;
		tail = newNode;
		
	}
	public void insertAtPosition(int data,int idx){
		if(idx == 0) {
			insertAtBeginning(data);
		}
		Node newNode = new Node(data);
		if(head == null) {
			System.out.println("Invalid index!");
		}
		Node temp = head;
		while(idx-1>0) {
			--idx;
			temp=temp.next;
			if(temp == null) {
				System.out.println("Invalid index!");
				return;
			}
		}
		if(temp.next==null) {
			temp.next= newNode;
			newNode.prev = temp;
			tail = newNode;
		    return;
		}
		newNode.next = temp.next;
		temp.next.prev = newNode;
		newNode.prev = temp;
		temp.next=newNode;
	}
	public void insertAfterANode(int data,int value) {
		Node newNode = new Node(data);
		Node temp = head;
		if(head==null) {
			System.out.println("List Empty!");
			return;
		}
		while(temp.val != value){
			if(temp.next==null) {
				System.out.println("Node_Not_Found!");
			}
			temp = temp.next;
		}
		if(temp.next==null) {
			temp.next= newNode;
			newNode.prev = temp;
			tail = newNode;
		    return;
		}
		newNode.next = temp.next;
		temp.next.prev = newNode;
		newNode.prev = temp;
		temp.next=newNode;
	}
	public void insertBeforeANode(int data,int value) {
		Node newNode = new Node(data);
		if(head == null) {
			System.out.println("List_Empty");
			return;
		}
		if(head.val == value) {
			insertAtBeginning(data);
			return;
		}
		Node temp = head;
		while(temp.next.val != value){
			temp= temp.next;
			if(temp.next == null) {
				System.out.println("Node_Not_Found!");
				return;
			}
		}
		newNode.next = temp.next;
		temp.next.prev = newNode;
		newNode.prev = temp;
		temp.next=newNode;
	}
	public void deleteFromBeginning() {
		if(head == null) {
			System.out.println("List_Empty!");
		}
		else if(head.next == null) {
			head = null;
			tail = null;
		}
		else{
			head = head.next;
			head.prev = null;
		}
	}
	public void deleteFromEnd() {
		if(tail == null) {
			System.out.println("List_Empty!");
		}
		else if(tail.prev == null) {
			head = null;
			tail = null;
		}
		else{
			tail = tail.prev;
			tail.next = null;
		}

	}
	public void deleteFromPosition(int idx) {
		if(head == null) {
			System.out.println("List_Empty!");
		}
		else if(idx == 0) {
			deleteFromBeginning();
		}
		else{
			Node temp = head;
			for(int i = 1;i< idx;i++) {
				if(temp.next== null) {
					System.out.println("Out_Of_Index!");
					return;
				}
				temp = temp.next;
			}
			temp.next = temp.next.next;
			if(temp.next.next != null) {
				temp.next.next.prev = temp;
			}
			else {
				tail = temp;
			}
		}
		
	}
	public void deleteByValue(int value) {
		if(head == null) {
			System.out.println("List_Empty!");
		}
		else if(head.val == value) {
			deleteFromBeginning();
			}
		else {
			Node temp = head; 
			while(temp.next.val!= value) {
				temp = temp.next;
				if(temp.next == null) {
					System.out.println("Value_Not_Found!");
					return;
				}
			}
			temp.next=temp.next.next;
			if(temp.next.next != null) {
				temp.next.next.prev = temp;
			}
			else {
				tail = temp;
			}
		}
	}
	public int search(int val) {
		int idx = 0;
		Node temp = head;
		if(head == null) {
			System.out.println("List_Empty!");
		}
		while(temp!= null) {
			if(temp.val== val) {
				System.out.println("Found At "+ idx);
				return idx;
			}
			temp= temp.next;
			idx++;
		}
		System.out.println("Not_Found");
		return -1;
	}
	public void update(int val, int newVal) {
		Node temp = head;
		while(temp != null) {
			if(temp.val == val) {
				temp.val = newVal;
				return;
			}
			temp = temp.next;
		}
	}
	@Override
	public void display() {
		Node temp = head;
		System.out.print("[NULL] <-> ");
		while(temp!= null) {
			System.out.printf("[%d] <-> ",temp.val);
			temp=temp.next;
		}
		System.out.println("[NULL]");
	}
	public void displayBackward() {
		Node temp = tail;
		System.out.print("[NULL] <-> ");
		while(temp!= null) {
			System.out.printf("[%d] <-> ",temp.val);
			temp=temp.prev;
		}
		System.out.println("[NULL]");
	}
	public int countNodes() {
		Node temp = head;
		int count = 0;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}
	public int findMax() {
		if(head == null) {
			System.out.println("List_Empty!");
			return -1;
		}
		int max = head.val;
		Node temp = head.next;
		while(temp!= null) {
			if(temp.val>max) max = temp.val;
			temp = temp.next;
		}
		return max;
	}
	public int findMin() {
		if(head == null) {
			System.out.println("List_Empty!");
			return -1;
		}
		int min = head.val;
		Node temp = head.next;
		while(temp!=null) {
			if(temp.val<min) min = temp.val;
			temp = temp.next;
		}
		return min;
	}
	public int findMid() {
		if(head == null) {
			System.out.println("List_Empty!");
			return -1;
		}
		Node slow = head;
		Node fast = head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.val;
	}
	public void reverse() {
		Node curr = head;
		Node temp;
		while(curr!= null) {
			temp = curr.prev;
			curr.prev= curr.next;
			curr.next = temp;
			curr = curr.prev;
		}
		temp = head;
		head = tail;
		tail = temp;
	}
	public void sort() {
		Node temp = head;
		while(temp.next != null) {
			if(temp.val > temp.next.val) {
				int carrier = temp.val;
				temp.val = temp.next.val;
				temp.next.val = carrier;
				temp = head;
			}
			temp= temp.next;
		}
	}
	public void removeDups() {
		Set<Integer> st = new HashSet<>();
		st.add(head.val);
		Node before = head ;
		Node temp = head.next;
		while(temp!=null) {
			if(st.add(temp.val)) {
				before.next = temp;
				temp.prev = before;
				before = temp;
			}
			temp = temp.next;
		}
		before.next = null;
	}
}
