package link;

public class SingleLink {

    public Node header = null;

    public void add(int data){
        if(header == null) {
            header = new Node(data);
            return;
        }
        Node temp = header;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(data);
    }

    public void delete(int data) {
        if(header == null) {
            return;
        }
        if(header.data == data){
            header = header.next;
            return;
        }

        Node pre = null;
        Node temp = header;

        while (temp.next != null){
            pre = temp;
            temp = temp.next;
            if(temp.data == data) {
                pre.next = temp.next;
                return;
            }
        };
    }

    public void printAll(){
        printAll(this.header);
    }

    public static void printAll(Node header){
        if(header == null){
            return;
        }
        Node temp = header;
        System.out.println(temp.data);
        while (temp.next != null){
            System.out.println(temp.next.data);
            temp = temp.next;
        }
    }
}
