package linkedList.singlyLinkedList;

public class LL {
    Node head;
    Node tail;
    int size;

    public LL()
    {
        this.size =0;
    }

    public void insertFirst(int val)
    {
        Node node  = new Node(val);
        node.next = head;
        head = node;
        if(tail == null)
        {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val)
    {
        if(tail == null)
        {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int  val, int index)
    {
        if(index == 0)
        {
            insertFirst(val);
            return;
        }
        if(index == size)
        {
            insertLast(val);
            return;
        }
        Node temp = head;
        // starting i from 1 because index 0 is already head
        for (int i= 1; i<index; i++)
        {
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }

    // To find the value of node
    public Node find(int value)
    {
        Node node = head;
        while(node!=null)
        {
            if(node.value == value)
            {
                return node;
            }
            node =node.next;
        }
        return null;
    }

    // To get the reference or index of the node
    public Node get(int index)
    {
        Node node = head;
        for(int i = 0; i<index; i++)
        {
            node = node.next;
        }
        return node;
    }

    public int deleteLast()
    {
        if(size <=1)
        {
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int deleteFirst()
    {
        int val = head.value;
        head = head.next;
        if(head.next == null)
        {
            tail = null;
        }
        size--;
        return val;
    }

    public int delete(int index)
    {
        if(index == 0)
        {
            return deleteFirst();
        }
        if(index == size-1)
        {
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    public void display()
    {
        Node temp = head;
//        We are using while loop as we do not have index based searching in LinkedList
        while(temp != null)
        {
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
