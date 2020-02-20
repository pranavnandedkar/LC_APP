package com.lc;

public class LinkedListLC<T> {
    Node<T> head = null;

    public class Node<T>{
      T data;
      Node<T>next;
      public Node(T t){
          data = t;
        }
    }


    public T get(int index) {
        Node<T> temp = this.head;
        int i =0;
        while(i < index){
            temp = temp.next;
            if(temp == null){
                return null;
            }
            i++;
        }
        return temp.data;
    }

    /** Add a Node<T>of value val before the first element of the linked list. After the insertion, the new Node<T>will be the first Node<T>of the linked list. */
    public void addAtHead(T val) {
        Node<T> newNode= new Node(val);
        if(this.head == null){
            this.head = newNode;
        } else {
            newNode.next = this.head;
            head = newNode;
        }
    }

    /** Append a Node<T>of value val to the last element of the linked list. */
    public void addAtTail(T val) {
        if(head == null){
             head = new Node(val);
             return;
        }
        Node<T>temp = head;
        while(temp.next != null){
            temp = temp.next;

        }
        temp.next = new Node(val);

    }

    /** Add a Node<T>of value val before the index-th Node<T>in the linked list. If index equals to the length of linked list, the Node<T>will be appended to the end of linked list. If index is greater than the length, the Node<T>will not be inserted. */
    public void addAtIndex(int index, T val) {
        if(index == 0){
            Node<T> n = new Node(val);
            n.next = this.head;
            this.head =  n;
        } else {
            Node<T> temp = this.head;
            int i = 0;
            while (i < index - 1) {
                i++;
                temp = temp.next;
            }
            Node<T>n = new Node(val);
            n.next = temp.next;
            temp.next = n;
        }
    }

    /** Delete the index-th Node<T>in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        Node<T> temp = head;
        int i =0 ;
        while(i < index-1){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;

    }
    /** Append a Node<T>of value val to the last element of the linked list. */
    public void print( ) {
        Node<T>temp = this.head;
        int i = 0;
        while(temp.next != null){
            System.out.print(i++ + ":" +temp.data + " ");
            temp = temp.next;
        }
        System.out.println(i++ + ":" +temp.data + " ");

    }

    public static void main(String[] args) {
        LinkedListLC<Integer>  list = new LinkedListLC<>();
        list.addAtTail(4);     list.print();
        list.addAtTail(2); list.print();
        list.addAtTail(33); list.print();
        list.addAtTail(5); list.print();
        list.addAtTail(6); list.print();
        list.addAtTail(8); list.print();
        list.addAtTail(7); list.print();
        list.addAtTail(42); list.print();

        list.addAtIndex(0,55);
        list.addAtHead(41);
        list.print();
        list.addAtTail(44);
        list.print();
        list.deleteAtIndex(2);
        list.print();
        list.deleteAtIndex(8);
        list.print();
        list.deleteAtIndex(2);
        list.print();
        list.deleteAtIndex(2);
        list.print();
        list.deleteAtIndex(6);
        list.print();




        LinkedListLC<String>  list2 = new LinkedListLC<>();
        list2.addAtTail("A");     list.print();
        list2.addAtTail("B"); list.print();
        list2.addAtTail("C"); list.print();
        list2.addAtTail("D"); list.print();
        list2.addAtTail("F"); list.print();
        list2.addAtTail("G"); list.print();
        list2.addAtTail("H"); list.print();
        list2.addAtTail("I"); list.print();

        list2.addAtIndex(0,"J");
        list2.addAtHead("K");
        list2.print();
        list2.addAtTail("L");
        list2.print();
        list2.deleteAtIndex(2);
        list2.print();
        list2.deleteAtIndex(8);
        list2.print();
        list2.deleteAtIndex(2);
        list2.print();
        list2.deleteAtIndex(2);
        list2.print();
        list2.deleteAtIndex(6);
        list2.print();

    }



}
