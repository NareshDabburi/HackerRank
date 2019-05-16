

    // Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode newNode=new SinglyLinkedListNode(data);
        newNode.next=null;
        newNode.next=llist;
        llist=newNode;

        return llist;


    }

