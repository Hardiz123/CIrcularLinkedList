import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ClinkedList list = new ClinkedList();
        boolean flag = true; 
        while (flag) {
        System.out.println();
        System.out.println("1.Add item to the list at start");
        System.out.println("2.Add item to the last at the list");
        System.out.println("3.Add Item to the list at a position");
        System.out.println("4. Delete first item from the list");
        System.out.println("5. Delete last item from the list");
        System.out.println("6. Insert in a sorted List");
        System.out.println("7. Delete an Element");
        System.out.println("8. Reverse List");
        System.out.println("9. view List");
        System.out.println("10. print size");
        System.out.println("11. exit");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        int position,value;
        switch (choice) {
            case 1:
            System.out.println("Enter value of item");
            System.out.println();
            value = sc.nextInt();
            list.addAtFirst(value);
                
                break;
            case 2:
            System.out.println("Enter value of item");
            System.out.println();
            value = sc.nextInt();
            list.addNode(value);
                break;       
            case 3:
            System.out.println("Enter position");
            position = sc.nextInt();
            System.out.println("Enter value of item");
            System.out.println();
            value = sc.nextInt();
            list.insertAtpos(position,value);
                break;
            case 4:
            list.deleteFirst();
                break;   
            case 5:
            list.deleteLast();
                
                break;
            case 6:
            System.out.println("Enter value");
                System.out.println();
                value = sc.nextInt();
                list.addSorted(value);
                break;
            case 7:
                System.out.println("Enter value");
                System.out.println();
                value = sc.nextInt();
                list.deleteByValue(value);
                break;
            case 8:
                list.ReverseList();
                break;      
            case 9:
                list.printList();
                break;
            case 10:
                int size = list.getSize();
                System.out.println("size is "+size);
                break;
            case 11:
                flag = false;  
                break;
            default:
                System.out.println("Invalid Choice"); 
                break;    
        }
    }   
        sc.close();
    }
}