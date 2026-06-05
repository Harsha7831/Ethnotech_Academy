class Node
{
    String content;
    Node prev;
    Node next;

    Node(String content)
    {
        this.content = content;
    }
}

public class Doublylinkedlist
{
    static Node deleteFirstPost(Node head)
    {
        if(head == null || head.next == null)
        {
            return null;
        }

        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;

        return head;
    }

    static Node addNewPost(Node head, String content)
    {
        Node newPost = new Node(content);

        if(head == null)
        {
            return newPost;
        }

        newPost.next = head;
        head.prev = newPost;

        return newPost;
    }

    static Node lastPost(Node head)
    {
        Node temp = head;

        while(temp.next != null)
        {
            temp = temp.next;
        }

        return temp;
    }

    public static void main(String args[])
    {
        Node p1 = new Node("My cricket photo");
        Node p2 = new Node("Dhoni shared a match update");
        Node p3 = new Node("CSK won the IPL trophy");
        Node p4 = new Node("Friends enjoyed a weekend trip");
        p1.next = p2;
        p2.prev = p1;
        p2.next = p3;
        p3.prev = p2;
        p3.next = p4;
        p4.prev = p3;
        Node head = p1;
        System.out.println("Display :");
        Node temp = head;

        while(temp != null)
        {
            System.out.println(temp.content);
            temp = temp.next;
        }

        System.out.println("Deleting :");
        head = deleteFirstPost(head);

        temp = head;
        while(temp != null)
        {
            System.out.println(temp.content);
            temp = temp.next;
        }

        System.out.println("Adding:");
        head = addNewPost(head, "I celebrated CSK victory");

        temp = head;
        while(temp != null)
        {
            System.out.println(temp.content);
            temp = temp.next;
        }

        System.out.println("\nBackward Feed:");

        Node last = lastPost(head);

        while(last != null)
        {
            System.out.println(last.content);
            last = last.prev;
        }
    }
}