package com.zipcodewilmington.singlylinkedlist;

import java.util.Comparator;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> implements  LinkedListIface{

    private Node<T> head = null;


    public SinglyLinkedList()
    {

    }

    @Override
    public void add(Object data) {
    Node newnode = new Node(data);
    if(this.head == null)
    {
        this.head = newnode;
    }
    else{
        Node<T> temp = head;
        while(temp.hasNext()){
            temp = temp.getNext();
        }
        temp.setNext(newnode);
    }
    }

    @Override
    public void remove(int index) throws IndexOutOfBoundsException {

    }

    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public boolean contains(Object data) {
      return (this.find(data) != -1);
    }

    @Override
    public int find(Object data) {

        if(this.isEmpty()) return -1;
        int found = -1;
        Node<T> temp = head;
        do {
            found++;
            if(temp.getData().equals(data)) return found;
            temp = temp.getNext();
        }while(temp!=null);

        return -1;
    }

    @Override
    public int size() {
        int count =0;
        Node<T> temp  = this.head;
        if(temp == null)
        {
            return 0;
        }
        while(temp != null)
        {
            temp = temp.getNext();
            count++;
        }
        return count;
    }

    @Override
    public SinglyLinkedList copy() {
        return null;
    }

    @Override
    public void sort(Comparator comparator) {

    }

    public Boolean isEmpty()
    {
        if(head == null)
        {
            return true;
        }
        else return false;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("head -> ");
        Node<T> temp = head;
        if(head!=null) {
            do {
                sb.append("[" + temp.getData() + "]" + " -> ");
                temp = temp.getNext();
            }
            while((temp != null));
        }
        sb.append("NULL");
            return sb.toString();
}}
