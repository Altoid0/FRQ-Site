package com.application.frq.Nathan;

public class LinkedList {

    static class Item {
        Item next;
        private int value;
        public Item(int val){
            next = null;
            value = val;
        }

        public int getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "value=" + value +
                    '}';
        }
    }


    Item head = null;
    public void addHead(Item i){
        if(head == null){
            head = i;
            return;
        }

        i.next = head;
        head = i;
    }

    public Item getLast(){
        if(head == null) return null;
        Item temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        return temp;
    }

    public void addTail(Item i){
        Item last = getLast();
        if(last == null) return;
        last.next = i;
    }

    public Item removeFirst(){
        if(head == null) return null;
        Item second = head.next;
        Item first = head;
        head = second;
        return first;
    }

    public Item removeLast(){
        if(head == null) return null;
        Item last = head;
        Item secondToLast = null;
        while (last.next != null){
            secondToLast = last;
            last = last.next;
        }
        secondToLast.next = null;
        return last;
    }


    @Override
    public String toString() {
        String s = "";
        Item temp = head;
        while (temp != null){
            s += temp+", ";
            temp = temp.next;
        }
        return s;
        //String sup = super.toString();
        //return sup.substring(27);
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.addHead(new Item(1));
        l.addHead(new Item(2));
        l.addHead(new Item(3));
        l.addTail(new Item(4));
        l.addTail(new Item(5));
        l.addTail(new Item(6));

        System.out.println(l);
        l.removeFirst();
        System.out.println(l);
        l.removeLast();
        System.out.println(l);


        //System.out.println(l.getLast());
        //System.out.println(l.getClass());
    }
}
