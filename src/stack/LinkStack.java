package stack;

import link.Node;

public class LinkStack {

    private Node top = null;

    public void push(int data){
        Node node = new Node(data);
        if(top == null){
            top = node;
            return;
        }
        Node temp = top;
        top = node;
        node.next = temp;
    }

    public int pop() {
        if(top == null){
            return 0;
        }
        Node node = top;
        top = top.next;
        return node.data;
    }

    public boolean hasNext(){
        if(top == null){
            return false;
        }
        //第一个元素
        if(top != null && top.next == null) {
            return true;
        }
        return top.next != null;
    }

    public void testLinkStack() {
        LinkStack ls = new LinkStack();
        ls.push(1);
        ls.push(2);
        ls.push(3);
        ls.push(4);
        ls.push(5);
        ls.push(6);
        ls.push(7);

        while (ls.hasNext()){
            System.out.println(ls.pop());
        }
    }
}
