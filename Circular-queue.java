import java.util.*;

public class circularqueue {
    int queue[];
    int front;
    int rear;
    int max;

    circularqueue() {
        max = 5;
        queue = new int[max];
        front = -1;
        rear = -1;
    }

    void insert(int element) {
        if (front == -1 && rear == -1) {
            front = 0;
            rear = 0;
            queue[rear] = element;
        } else if ((rear + 1) % max == front) {
            System.out.println("Queue is overflow..");
        } else {
            rear = (rear + 1) % max;
            queue[rear] = element;
        }
    }

    void delete() {
        if ((front == -1) && (rear == -1)) {
            System.out.println("Queue is underflow..");
        } else if (front == rear) {
            System.out.print("The Deleted element is" + queue[front]);
            front = -1;
            rear = -1;
        } else {
            System.out.println("The Deleted element is" + queue[front]);
            front = (front + 1) % max;
        }
    }

    void display() {
        int i = front;
        if (front == -1 && rear == -1) {
            System.out.println(" Queue is empty..");
        } else {
            System.out.println("Elements in a Queue are :");
            while (i <= rear) {
                System.out.println(queue[i] + " ");
                i = (i + 1) % max;
            }
        }
    }

    public static void main() {
        circularqueue ob = new circularqueue();
        Scanner in = new Scanner(System.in);
        int ch, a;
        int z = 0;
        while (z == 0) {
            System.out.println("Press 1: Insert an element");
            System.out.println("Press 2: Delete an element");
            System.out.println("Press 3: Display the element");
            System.out.println("Enter your choice");
            ch = in.nextInt();
            switch (ch) {

                case 1:
                    if (ch == 1) {
                        System.out.println("Enter the element which is to be inserted");
                        a = in.nextInt();
                        ob.insert(a);
                    }
                    break;
                case 2:
                    if (ch == 2) {
                        ob.delete();
                    }
                    break;
                case 3:
                    if (ch == 3) {
                        ob.display();
                    }
            }
            System.out.println("Press 0 to continue & Press any key to exit");
            z = in.nextInt();
        }
    }
}