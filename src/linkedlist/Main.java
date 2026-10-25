package linkedlist;

import java.util.Scanner;

import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int choice;
		System.out.println("=======================================");
		System.out.printf("%34s\n","LINKED LIST MANAGEMENT SYSTEM");
		System.out.println("=======================================");
		do {
			System.out.println("1. Singly Linked List\n2. Doubly Linked List\n3. Compare Singly vs Doubly Linked List\n4. Exit\n");
			System.out.print("Enter your choices: ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				SingleLinkedList_Menu();
				break;
			case 2:
				DoubleLinkedList_Menu();
				break;
			case 3:
				System.out.printf("%11s\n","SINGLY VS DOUBLY LINKED LIST COMPARISON");
				System.out.printf("%-25s %-25s %-25s\n","Feature","Singly Linked List","Doubly Linked List");
				System.out.println();
				System.out.printf("%-25s %-25s %-25s\n","1. Pointers per Node","1 (next)","2 (next,prev)");
				System.out.printf("%-25s %-25s %-25s\n","2. Traversal Direction","Forward only","Bidirectional (Both ways)");
				System.out.printf("%-25s %-25s %-25s\n","3. Memory Overhead","Lower","Higher");
				System.out.printf("%-25s %-25s %-25s\n","4. Deletion from Tail","O(n)","O(1)");
				System.out.printf("%-25s %-25s %-25s\n","5. Reverse Operation","Requires 3 pointers","Simple next/prev pointer swap");
				System.out.printf("%-25s %-25s %-25s\n","6. Implementation Risk","Lower (Fewer links)","Higher (More link updates to track)");
				System.out.println();
				System.out.println("- Singly lists win on memory efficiency and simplicity.");
				System.out.println("- Doubly lists trade extra memory for navigation flexibility.");
				break;
			case 4:
				System.out.println("🌸Thank you for using or Services🌸");
			default:
				System.out.println("Invalid Input!");
			}
		}while(choice!=4);
		sc.close();
		
	}
	public static void SingleLinkedList_Menu() {
		System.out.println("--------------------------------------");
		System.out.printf("%34s\n","SINLGLY LINKED LIST SYSTEM");
		System.out.println("--------------------------------------");
		SinglyLinkedList list1 = new SinglyLinkedList();
		int choice;
		
		System.out.println("1. Insert at Beginning\n2. Insert at End\n3. Insert at Position\n4. Insert After a Node\n5. Insert Before a Node\n\n6. Delete from Beginning\n7. Delete from End\n8. Delete from Position\n9. Delete by Value\n\n10. Search\n11. Update\n12. Display\n13. Count Nodes\n14. Find Maximum\n15. Find Minimum\n16. Find Middle Element\n17. Reverse\n18. Sort\n19.Remove Duplicates\n20.Exit\n");
		do {
			System.out.print("Enter your choices: ");
			choice = sc.nextInt();
		
			switch(choice) {
			case 1:
			
				System.out.print("Enter the Value: ");
				int start = sc.nextInt();
				System.out.printf("Inserting [%d]...\n",start);
				list1.insertAtBeginning(start);
				
				break;
			case 2:
				
				System.out.print("Enter the Value: ");
				int end = sc.nextInt();
				System.out.printf("Inserting [%d]...\n",end);
				list1.insertAtEnd(end);
			
				break;
			case 3:
				
				System.out.print("Enter the Value ");
				int data = sc.nextInt();
				System.out.print("Insert at which Position(0-Indexed)?");
				int pos = sc.nextInt();
				System.out.printf("Inserting [%d] at %d...\n",data,pos);
				list1.insertAtPosition(data,pos);
				
				break;
			case 4:
				
				System.out.print("Enter the Value: ");
				int val = sc.nextInt();
				System.out.println("Insert After which Node?");
				int after = sc.nextInt();
				System.out.printf("Inserting [%d] after [%d]...\n",val,after);
				list1.insertAfterANode(val,after);
				
				break;
			case 5:
				
				System.out.println("Enter the Value: ");
				int insert_val = sc.nextInt();
				System.out.println("Insert Before which Node?");
				int before = sc.nextInt();
				System.out.printf("Inserting [%d] before [%d]...\n",insert_val,before);
				list1.insertBeforeANode(insert_val, before);
				
				break;
			case 6:
			
				System.out.println("deleting...");
				list1.deleteFromBeginning();
			
				break;
			case 7:
			
				System.out.println("deleting...");
				list1.deleteFromEnd();
				
				break;
			case 8:
				
				System.out.print("Enter Position(0-Indexed): ");
				int del_pos = sc.nextInt();
				System.out.println("deleting...");
				list1.deleteFromPosition(del_pos);
				
				break;
			case 9:
				
				System.out.print("Delete Value: ");
				int del_val = sc.nextInt();
				System.out.println("deleting...");
				list1.deleteByValue(del_val);
				
				break;
			case 10:
				System.out.print("Search: ");
				int search = sc.nextInt();
				System.out.printf("Searching %d...\n",search);
				list1.search(search);
				break;
			case 11:
				System.out.print("Update value: ");
				int old_val = sc.nextInt();
				System.out.print("New Value: ");
				int new_val = sc.nextInt();
				System.out.printf("updating [%d] to [%d]\n",old_val,new_val);
				list1.update(old_val, new_val);
				
				break;
			case 12:
				list1.display();
				break;
			case 13:
				System.out.println("Count of Nodes: "+list1.countNodes());
				break;
			case 14:
				System.out.println(list1.findMax());
				break;
			case 15:
				System.out.println(list1.findMin());
				break;
			case 16:
				System.out.println(list1.findMid());
				break;
			case 17:
				System.out.print("Before: ");
				list1.display();
				list1.reverse();
				System.out.print("After reversing: ");
				list1.display();
				break;
			case 18:
				System.out.print("Before: ");
				list1.display();
				list1.sort();
				System.out.print("After sorting: ");
				list1.display();
				break;
			case 19:
				System.out.print("Before: ");
				list1.display();
				list1.removeDups();
				System.out.print("After removing duplicates: ");
				list1.display();
				break;
			case 20:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid Input!");
			}
		}while(choice!=20);
		main(null);
	}
	public static void DoubleLinkedList_Menu() {
		System.out.println("--------------------------------------");
		System.out.printf("%34s\n","DOUBLY LINKED LIST SYSTEM");
		System.out.println("--------------------------------------");
		DoublyLinkedList list1 = new DoublyLinkedList();
		int choice;
			
		System.out.println("1. Insert at Beginning\n2. Insert at End\n3. Insert at Position\n4. Insert After a Node\n5. Insert Before a Node\n\n6. Delete from Beginning\n7. Delete from End\n8. Delete from Position\n9. Delete by Value\n\n10. Search\n11. Update\n12. Display\n13. Display Backward\n14. Count Nodes\n15. Find Maximum\n16. Find Minimum\n17. Find Middle Element\n18. Reverse\n19. Sort\n20.Remove Duplicates\n21.Exit\n");
		do {
			System.out.print("Enter your choices: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				
				System.out.print("Enter the Value: ");
				int start = sc.nextInt();
				System.out.printf("Inserting [%d]...\n",start);
				list1.insertAtBeginning(start);
				
				break;
			case 2:
				
				System.out.print("Enter the Value: ");
				int end = sc.nextInt();
				System.out.printf("Inserting [%d]...\n",end);
				list1.insertAtEnd(end);
				
				break;
			case 3:
				
				System.out.print("Enter the Value ");
				int data = sc.nextInt();
				System.out.print("Insert at which Position(0-Indexed)?");
				int pos = sc.nextInt();
				System.out.printf("Inserting [%d] at %d...\n",data,pos);
				list1.insertAtPosition(data,pos);
				
				break;
			case 4:
				
				System.out.print("Enter the Value: ");
				int val = sc.nextInt();
				System.out.println("Insert After which Node?");
				int after = sc.nextInt();
				System.out.printf("Inserting [%d] after [%d]...\n",val,after);
				list1.insertAfterANode(val,after);
				
				break;
			case 5:
				
				System.out.println("Enter the Value: ");
				int insert_val = sc.nextInt();
				System.out.println("Insert Before which Node?");
				int before = sc.nextInt();
				System.out.printf("Inserting [%d] before [%d]...\n",insert_val,before);
				list1.insertBeforeANode(insert_val, before);
				
				break;
			case 6:
				
				System.out.println("deleting from Beginning...");
				list1.deleteFromBeginning();
				System.out.println("Execution Successful");
				break;
			case 7:
				
				System.out.println("deleting from End...");
				list1.deleteFromEnd();
				
				break;
			case 8:
				
				System.out.print("Enter Position(0-Indexed): ");
				int del_pos = sc.nextInt();
				System.out.println("deleting...");
				list1.deleteFromPosition(del_pos);
				
				break;
			case 9:
				
				System.out.print("Delete Value: ");
				int del_val = sc.nextInt();
				System.out.println("deleting...");
				list1.deleteByValue(del_val);
				
				break;
			case 10:
				System.out.print("Search: ");
				int search = sc.nextInt();
				System.out.printf("Searching %d...\n",search);
				list1.search(search);
				break;
			case 11:
				System.out.print("Update value: ");
				int old_val = sc.nextInt();
				System.out.print("New Value: ");
				int new_val = sc.nextInt();
				System.out.printf("updating [%d] to [%d]\n",old_val,new_val);
				list1.update(old_val, new_val);

				break;
			case 12:
				list1.display();
				break;
			case 13:
				System.out.print("Displaying backward: ");
				list1.displayBackward();
				break;
			case 14:
				System.out.println("Count of Nodes: "+list1.countNodes());
				break;
			case 15:
				System.out.println(list1.findMax());
				break;
			case 16:
				System.out.println(list1.findMin());
				break;
			case 17:
				System.out.println(list1.findMid());
				break;
			case 18:
				System.out.print("Before: ");
				list1.display();
				list1.reverse();
				System.out.print("After reversing: ");
				list1.display();
				break;
			case 19:
				System.out.print("Before: ");
				list1.display();
				list1.sort();
				System.out.print("After sorting: ");
				list1.display();
				break;
			case 20:
				System.out.print("Before: ");
				list1.display();
				list1.removeDups();
				System.out.print("After removing duplicates: ");
				list1.display();
				break;
			case 21:
				System.out.println("Exiting...");
				
				break;
			default:
				System.out.println("Invalid choice!");
			}
		}while(choice!=21);
		main(null);
	}

}

