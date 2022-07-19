import java.util.ArrayList;
import java.util.HashSet;

public class linked {
    // here we write the code for reverse the linked list 
    public static node head;

    public static class node{
        int data;
        node next;
        node(int data)
        {
            this.data= data;
            this.next=null;

        }
    }
    public static boolean isempty()
    {
        return head==null;
    }
    public static void addfirst(int data)
    {
        node nodetoins=new node(data);
        if(isempty())
        {
            head=nodetoins;
            return;
        }
        nodetoins.next=head;
        head=nodetoins;
    }
    public static void print()
    {
        node temp= head;
        while(temp!=null)
        {
            System.err.print(temp.data+" ");
            temp= temp.next;
        }
        System.out.println();
    }
    public static node reverse()
    {
        node curr= head;
        node pre=null;
        node nxt=null;
        while(curr!=null)
        {
            nxt=curr.next;
            curr.next=pre;
            pre=curr;
            curr=nxt;

        }
        head=pre;
        return head;

    }
    public static int getnthnodefromlast(int n)
    {
        node temp= head;
        int cnt=0;
        while(temp!=null)
        {
            cnt++;
            temp= temp.next;
        }
        int pos=cnt-n+1;
        temp= head;
        if(n>cnt)
        {
            return -1;
        }
        else
        {
            for(int i=1;i<pos;i++)
            {
                temp=temp.next;
            }
            return temp.data;
        }
    }
    public static boolean checkpali(ArrayList<Integer> s)
    {
        int n= s.size();
        int i=0;
        int j=n-1;
        while(i<j)
        {
            if(s.get(i)!=s.get(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static boolean ispalindrom()
    {
        node temp= head;
        //HashSet<Integer>s= new HashSet<>();
        ArrayList<Integer>v=new ArrayList<>();
        while(temp!=null)
        {
            v.add(temp.data);
            temp=temp.next;
        }
        return checkpali(v);

    }


    public static void main(String[] args) {

        linked ll= new linked();
        ll.addfirst(12);
        ll.addfirst(44);
        ll.addfirst(2);
        ll.addfirst(9);
        ll.addfirst(2);
        ll.addfirst(44);
        ll.addfirst(12);
        ll.print();

        // ll.reverse();
        // ll.print();
       // System.out.println(ll.getnthnodefromlast(2));
        System.out.println(ll.ispalindrom());


    }
    
}
