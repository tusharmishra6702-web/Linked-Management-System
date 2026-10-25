package linkedlist;

abstract class LinkedList {
	public abstract void insertAtBeginning(int val);
	public abstract void insertAtEnd(int val);
	public abstract void insertAtPosition(int val,int pos);
	public abstract void insertAfterANode(int data,int val);
	public abstract void insertBeforeANode(int data,int val);
	
	public abstract void deleteFromBeginning();
	public abstract void deleteFromEnd();
	public abstract void deleteFromPosition(int pos);
	public abstract void deleteByValue(int value);
	
	public abstract int search(int value);
	public abstract void update(int val, int newValue);
	public abstract void display();
	public abstract int countNodes();
	public abstract int findMax();
	public abstract int findMin();
	public abstract int findMid();
	public abstract void reverse();
	public abstract void sort(); 
	public abstract void removeDups();
	
	
}
