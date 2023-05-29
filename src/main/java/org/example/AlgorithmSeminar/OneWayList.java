package org.example.AlgorithmSeminar;

import org.example.List;

public class OneWayList<E> {
    private Node<E> head;
    private Node<E> tail;  //для переворота


    public void add(E value) {
        Node<E> newNode = new Node<>();
        newNode.value = value;
        if (head != null) {
            newNode.nextNode = head;
        }
        head = newNode;
    }

    public int size() {
        Node<E> currentNode = head;
        int counter = 0;
        while (currentNode != null) {
            counter++;
            currentNode = currentNode.nextNode;
        }
        return counter;
    }

    public E get(int index) {
        Node<E> currentNode = head;
        int counter = 0;
        while (counter < index) {
            counter++;
            if (currentNode.nextNode == null) throw new ArrayIndexOutOfBoundsException();
            currentNode = currentNode.nextNode;
        }
        return currentNode.value;
    }

    public boolean contains(E value) {

        Node<E> currentNode = head;
        while (currentNode != null) {

            if (currentNode.value == value) {
                return true;
            }
            currentNode = currentNode.nextNode;
        }
        return false;
    }

    public int indexOf(E value) {
        int counter = 0;
        Node<E> currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return counter;
            }
            counter++;
            currentNode = currentNode.nextNode;
        }
        return -1;
    }

    public void add(E value, int index) {
        if (index > size() || index < 0) throw new ArrayIndexOutOfBoundsException();
        if (index != 0) {
            Node<E> currentNode = head;
            while (index > 1) {
                index--;
                currentNode = currentNode.nextNode;
            }
            Node<E> newNode = new Node<>();
            newNode.value = value;
            Node<E> temp = currentNode.nextNode;
            currentNode.nextNode = newNode;
            newNode.nextNode = temp;
        } else add(value);
    }

    public void addLast(E value) {
        add(value, size());
    }

//    public void revert(){
//        if (head!=null && head.next!=null ){
//            List.Node temp = head;
//            revert(head.next, head);
//            temp.next = null;
//        }
//    }
public void revert(){
    Node<E> currentNode = head;
    while (currentNode!= null){
        Node<E> next = currentNode.nextNode;
        Node<E> previous = currentNode.previousNode;
        currentNode.nextNode = previous;
        currentNode.previousNode = next;
        if(previous==null){
            tail = currentNode;
        }
        if (next==null){
            head = currentNode;
        }
        currentNode = next;
    }
}
}