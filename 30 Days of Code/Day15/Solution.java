    public static  Node insert(Node head,int data) {
        //Complete this method
        Node current = head;        
        if (head == null){
            Node node = new Node(data);
            return node;
        }
        else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
            return head;
        }        
    }
