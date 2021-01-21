public class queuelink
{
    Node front=null;
    Node rear=null;
    class Node
    {
    int data;
    Node next;
    Node(int d)
    {
    data=d;
    }
    }
    void enqueue(int data)
    {
    Node o=new Node(data);
    o.next=null;
    if (front==null)
    {
    front=o;
    rear=o;
    }
    else
    {
   while(rear.next!=null)
{
    rear=rear.next;
}    
rear.next=o;
 
}
}
boolean isEmpty()
{
    if (front==null)
    {
    rear=null;
    return true;
    }
    else
    {
    return false;
    }
}
void dequeue()
{
if (isEmpty())
{
System.out.println("Linked List is empty");
}
else
{
    System.out.println(front.data+" Item dequeued from linkedlist");
    front=front.next;
}
}
public static void main(String g[])
{
    queuelink obj=new queuelink();
    obj.enqueue(1);
    obj.enqueue(2);
    obj.enqueue(3);
    obj.enqueue(4);
    obj.enqueue(5);
    obj.dequeue();
    obj.dequeue();
    obj.dequeue();
    obj.dequeue();
    obj.dequeue();
    obj.dequeue();
}
}