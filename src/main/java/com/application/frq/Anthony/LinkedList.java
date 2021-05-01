package com.application.frq.Anthony;

public class LinkedList {
    //init list head
    Node head = null;

    //creates node class
    public static class Node {
        int data;
        Node next;
        public Node (int n) {
            data = n;
            next = null;
        }
    }

    //adds node to end of list
    public static LinkedList addLast (LinkedList l, int data) {
        Node n = new Node(data);
        n.next = null;

        if (l.head == null) {
            l.head = n;
        } else {
            Node temp = l.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
        return l;
    }

    //adds node by position
    public static LinkedList addNode (LinkedList l, int data, int position) {
        Node n = new Node(data);
        n.next = null;

        //if you want to change the head
        if (position == 0) {
            n.next = l.head;
            l.head = n;
            return l;
        }

        //if you want to change something inside of the array
        int counter = 1;
        Node temp = l.head;
        while (temp.next != null) {
            if (counter == position) {
                n.next = temp.next;
                temp.next = n;
                return l;
            } else {
                temp = temp.next;
                counter++;
            }
        }

        //if position is outside of index
        return l;
    }

    //deletes note by position
    public static LinkedList deleteNode (LinkedList l, int position) {
        // Store head node
        Node currNode = l.head, prev = null;

        //if delete the head
        if (position == 0 && currNode != null) {
            l.head = currNode.next;

            return l;
        }

        int counter = 0;
        //if changing stuff inside the linked list
        while (currNode != null) {
            System.out.println(currNode.data);
            if (counter == position) {
                prev.next = currNode.next;
            }
            else {
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }
        //if position is outside of index
        return l;
    }


    public static String listString (LinkedList l) {
        String s = "{";
        Node current = l.head;
        while (current.next != null) {
            s += current.data + ", ";
            current = current.next;
        }
        s += current.data + "}";

        return s;
    }

}
