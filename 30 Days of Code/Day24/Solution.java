    public static Node removeDuplicates(Node head) {
      //Write your code here
        Node current = head;
      if (head == null) {
          return head;
      }
        else {
            while (current.next != null){
                if (current.data == current.next.data) {
                    current.next = current.next.next;
                }
                else {current=current.next;}
            }
            return head;
        }
    }
