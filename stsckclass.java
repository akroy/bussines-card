

public class stsckclass {

    static class node{
        int data;
        node next;
        node(int data)
        {
            this.data=data;
            this.next=null;
        }


    }
    static class stack{
        public static node head;// it is important to create node= head static if we not make it static then 
        // it gave error


        public static boolean isempty()
        {
            return head==null;
        }

        public static void push(int data)
        {
            node newnode=new node(data);

            if(isempty()){
                head = newnode;
                return;

            }
            newnode.next=head;
            head=newnode;

        }
        public static int pop()
        {
            if(isempty())
            {
                return -1;
            }
            int top= head.data;
            head= head.next;
            return top;
        }
        public static int peek(){
            if(isempty())
            {
                return -1;
            }
            return head.data;
        }

    }
 public static void main(String[] args) {
     stack s= new stack();
     s.push(1);
     s.push(2);
     s.push(4);
     s.push(5);
     while(!s.isempty())
     {
         System.out.println(s.peek());
         s.pop();
     }
     
 }

    
}
