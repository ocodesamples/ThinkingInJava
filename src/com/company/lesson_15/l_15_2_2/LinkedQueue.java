package com.company.lesson_15.l_15_2_2;


public class LinkedQueue<T> {

    public static class Node<U> {

        U item;
        Node next;

        Node() {
            item = null;
            next = null;
        }



    }

    private Node<T> mTop  = new Node<>();
    private Node<T> mButton = mTop;

    public void push(T item) {
//      if(mTop == null) {
//          mTop = new Node<>();
//          mTop.item = item;
//          mButton = new Node<>();
//          mTop.next = mButton;
//      } else {
//          Node<T> temp = new Node();
//          mButton.item = item;
//          mButton.next = temp;
//          mButton = temp;
//      }
//
      Node<T> temp = new Node<>();
      mButton.item = item;
      mButton.next = temp;
      mButton = temp;

    }

    public T pop() {
        T i  = mTop.item;
        if(i != null) {
            mTop = mTop.next;
        }
        return i;
    }


    public static void main(String[] argc) {
        LinkedQueue<String> lss = new LinkedQueue<>();
        for (String s : "Phasers on stun!".split(" ")) {
            lss.push(s);
        }

        String s;
        while ((s = lss.pop()) != null) {
            System.out.println(s);
        }
    }

}
