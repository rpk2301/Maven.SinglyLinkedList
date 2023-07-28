package com.zipcodewilmington.singlylinkedlist;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList   {
    Node head;
    public SinglyLinkedList()
    {
    head = new Node();
    }
    public static class Node
    {
        int data;
        Node next;

        public Node()
        {
            data = 0;
            next = null;
        }
        public Node(Node node)
        {
            this.data =0;
            this.next = node;
        }
        public Node getNext() {
            return next;
        }
        public void setNext(Node next)
        {
            this.next = next;
        }
    }

   public Node getTail(Node head)
   {
       if(hasNext(head))
       {
           return getTail(head.next);
       }
       return head;
   }

   public boolean hasNext(Node node)
   {
       if(node.getNext()!=null)
       {
           return true;
       }
       else return false;
   }

   public Node gotoNext(Node n)
   {
       return n.getNext();
   }

    public Node add(Node n)
    {
     getTail(head).setNext(n);
     return n;
    }

    public void remove(int index)
    {
       Node p = get(index);
       Node f = get(index+1);
       Node r = get(index-1);
       r.setNext(f);
       p.setNext(null);


    }

    public Node get(int ret)
    {
        if(ret==0)
        {
            return this.head;
        }
        else
        {
            Node p = head;
            for(int i=1;i<=ret;i++)
            {
                p = p.getNext();
            }
            return p;
        }

    }


    public int size()
    {
        int count=2;
        if(!hasNext(head))
        {
            return 1;
        }
        Node p =head.getNext();
        {
            while(p.getNext()!=null)
            {
                p = p.getNext();
                count++;
            }
    }
return count;
    }
}
