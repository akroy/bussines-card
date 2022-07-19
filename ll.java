import java.util.*;

public class ll {
    node head;
    public static class node{
        int data;
        node next;
        node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public int getln()
    {
        node temp=head;
        int cnt=0;
        while(temp!=null)
        {
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
    public void addfirst(int data)
    {
        node newnode= new node(data);
        if(head==null)
        {
            head= newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void addlast(int data)
    {
        node newn=new node(data);
        node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newn;

    }
    public void insertatpos(int pos,int data)
    {
      node newnode=new node(data);
      node temp=head;
      int n=getln();
      int cnt=1;
      while(cnt<pos-1)
      {
          temp=temp.next;
          cnt++;
      }
      newnode.next=temp.next;
      temp.next=newnode;
    }
    // from here we write the functionfor delete the linked list node 
    // first we write  the code for delete the element from head of linked lst;
    // now we have to start the writing the code for deletion of linked list code
    public void deletefirst()
    {
        head=head.next;
    }
    public void deletelastnode()
    {
        node slow=head;
        node fast=head.next;
        while(fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=null;

    }
    public void printn()
    {
        node temp= head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ll list= new ll(); //here we create the object of list or linked list

        list.addfirst(12);
        list.addfirst(14);
        list.printn();
        list.addlast(10);
        list.printn();
        list.addlast(45);
        list.printn();
        int n=list.getln();
        System.out.println(n);
        list.insertatpos(2, 5);
        list.printn();
        list.insertatpos(2, 7); 
        list.printn();
        list.deletefirst();
        list.printn();
        list.deletelastnode();
        list.printn();
        
    }
    
}
