//To create browser history by using singly linked list

import java.util.*;
class Browser 
{
    String content;
    Browser next;

    Browser(String content) 
	{
        this.content = content;
        this.next = null;
    }
}
class Tabs 
{
    Browser head;
    // To Open a new page at the end
    void PageOpen(String content) 
	{
        if (head == null) 
		{
            head = new Browser(content);
            return;
        }
        Browser curr = head;
        while (curr.next != null) 
		{
            curr = curr.next;
        }
        curr.next = new Browser(content);
    }
    // Open a page at the beginning
    void PageOpenAtBegining(String content) 
	{
        Browser newNode = new Browser(content);
        newNode.next = head;
        head = newNode;
    }
    // Open a page in the middle
    void PageOpenAtMiddle(String content) 
	{
        if (head == null) 
		{
            head = new Browser(content);
            return;
        }
        Browser slow = head;
        Browser fast = head;
        while (fast != null && fast.next != null) 
		{
            fast = fast.next.next;
            slow = slow.next;
        }
        Browser newNode = new Browser(content);
        newNode.next = slow.next;
        slow.next = newNode;
    }
    // Display browser history
    void display() 
	{
        if (head == null) 
		{
            System.out.println("History is empty.");
            return;
        }
        Browser curr = head;
        System.out.println("Browser History:");
        while (curr != null) 
		{
            System.out.print(curr.content);
            if (curr.next != null) 
			{
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }
    // Search for a page
    boolean search(String content) 
	{
        Browser curr = head;
        while (curr != null) 
		{
            if (curr.content.equals(content)) 
			{
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
    // Delete a page from history
    void delete(String content) 
	{
        if (head == null) 
		{
            System.out.println("History is empty.");
            return;
        }
        if (head.content.equals(content)) 
		{
            head = head.next;
            return;
        }
        Browser cur = head;
        while (cur.next != null) {
            if (cur.next.content.equals(content)) 
			{
                cur.next = cur.next.next;
                return;
            }
            cur = cur.next;
        }
        System.out.println("Page not found: " + content);
    }
    // Count total pages visited
    int countPages() 
	{
        int count = 0;
        Browser cur = head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
}
class BrowserHistory 
{

    public static void main(String args[]) 
	{
        Tabs tab = new Tabs();
        tab.PageOpenAtBegining("Hotstar");
        tab.PageOpen("Instagram");
        tab.PageOpen("Cricbuzz");
        tab.PageOpenAtBegining("YouTube");
        tab.PageOpenAtMiddle("Games");
        tab.display();
        System.out.println("Search Games: " + tab.search("Games"));
        System.out.println("Total Pages: " + tab.countPages());
        tab.delete("YouTube");
        System.out.println("After deleting YouTube:");
        tab.display();
        System.out.println("Search Games: " + tab.search("Games"));
        System.out.println("Total Pages: " + tab.countPages());
    }
}