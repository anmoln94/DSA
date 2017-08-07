/*Traverse till N-1 position(say temp). Create a new node. New nodes next is temp.next.
 * temp.next = newnode
 * 
 * 
 */
/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
   // You only need to complete this method. 
    Node newnode = new Node();
    newnode.data=data;
    newnode.next=null;
    
    if(position==0)
    {
        newnode.next=head;
        head=newnode;
        return head;
    }
    else
    {
        Node temp=head;
        for(int i=0;i<position-1;i++)
        {
            temp=temp.next;
        }
  
        newnode.next=temp.next;
        temp.next=newnode;
    
        return head;
    }
}