public class lll {

    public static node  head;
    public static class node{
        int data;
        node next;
        node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static boolean isempty()
    {
        node temp= head;
        return temp==null;
    }

    public static void addfirst(int data)
    {
        node n1= new node(data);

        if(isempty())
        {
            head=n1;
            return;
        }
        n1.next=head;
        head=n1;


    }
    public static void intspos(int pos,int d)
    {
        node temp= new node(d);
        node t= head;
        int cnt=1;
        while(cnt<pos-1)
        {
            t= t.next;
            cnt++;
        }
        temp.next=t.next;
        t.next=temp;

    }
    public static void print()
    {
        node temp= head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        lll list= new lll();
        list.addfirst(12);
        list.addfirst(23);
        list.print();
        list.addfirst(2);
        list.print();
        list.addfirst(1);
        list.print();
        list.intspos(2, 70);
        list.print();
        
    }
    
}
