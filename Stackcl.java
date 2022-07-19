public class Stackcl {

    public static class node{
        int data;
        node next;
        node(int data)
        {
            this.data= data;
            this.next=null;
        }
    }
    public static class stack{
        public static node head;

        public static boolean isempty()
        {
            return head==null;
        }
        public static void push(int data)
        {
            node nodetoinsert= new node(data);

            if(isempty())
            {
                head= nodetoinsert;
                return;
            }
            nodetoinsert.next=head;
            head=nodetoinsert;
        }
        public static int pop()
        {
            if(isempty())
            {
                return -1;
            }
            int top= head.data;
            head=head.next;
            return top;
        }
        public static int peek()
        {
            if(isempty())
            {
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        stack s= new stack();
        s.push(55);
        s.push(66);
        s.push(55);
        s.push(99);
        while(!s.isempty())
        {
            System.out.println(s.peek());
            s.pop();
        }
        
    }
    
}
