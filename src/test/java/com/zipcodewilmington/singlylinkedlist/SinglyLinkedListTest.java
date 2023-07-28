package com.zipcodewilmington.singlylinkedlist;

import org.junit.*;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {




    @Test
    public void AddTest()
    {
        //Given
        SinglyLinkedList list = new SinglyLinkedList();
        SinglyLinkedList.Node node = new SinglyLinkedList.Node();
        //When
        list.add(node);
        //Then
        Assert.assertTrue(list.head.next.equals(node));
    }

    @Test
    public void HasNextTest()
    {
        //Given
        SinglyLinkedList list = new SinglyLinkedList();
        //Then
        Assert.assertFalse(list.hasNext(list.head));
    }

    @Test
    public void HasNextTest2()
    {
        //Given
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(new SinglyLinkedList.Node());
        //Then
        Assert.assertTrue(list.hasNext(list.head));
    }

    @Test
    public void gotonextTest2()
    {
        //Given
        SinglyLinkedList list = new SinglyLinkedList();
        list.head.setNext(new SinglyLinkedList.Node());
        //Then
        Assert.assertTrue(list.head.next.equals(list.gotoNext(list.head)));
    }

    @Test
    public void getTailtest2()
    {
        //Given
        SinglyLinkedList list = new SinglyLinkedList();
        list.head.setNext(new SinglyLinkedList.Node());
        list.gotoNext(list.head).setNext(new SinglyLinkedList.Node());
        SinglyLinkedList.Node p= list.head.getNext().getNext();

        //Then
        Assert.assertTrue(p.equals(list.getTail(list.head)));
    }

    @Test
    public void getTest()
    {
        //Given
        SinglyLinkedList list = new SinglyLinkedList();
        SinglyLinkedList.Node p = list.get(0);

        //Then
        Assert.assertTrue(p.equals(list.head));
    }



    @Test
    public void getTest2()
    {
        //Given
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(new SinglyLinkedList.Node());
       SinglyLinkedList.Node p = list.add(new SinglyLinkedList.Node());
        SinglyLinkedList.Node f = list.add(new SinglyLinkedList.Node());

        //Then
        Assert.assertTrue(p.equals(list.get(2)));
    }




    @Test
    public void removeTest()
    {
        //Given
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(new SinglyLinkedList.Node());
        SinglyLinkedList.Node p = list.add(new SinglyLinkedList.Node());
        SinglyLinkedList.Node f = list.add(new SinglyLinkedList.Node());
         list.remove(2);
        //Then
        Assert.assertTrue(f.equals(list.get(2)));
    }


    @Test
    public void SizeTest()
    {
        //Given
        SinglyLinkedList list = new SinglyLinkedList();


        Assert.assertEquals(list.size(),1);
    }


    @Test
    public void SizeTest2()
    {
        //Given
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(new SinglyLinkedList.Node());


        Assert.assertEquals(list.size(),2);
    }


    @Test
    public void SizeTest3()
    {
        //Given
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(new SinglyLinkedList.Node());
        list.add(new SinglyLinkedList.Node());
        list.add(new SinglyLinkedList.Node());
        list.add(new SinglyLinkedList.Node());
        list.add(new SinglyLinkedList.Node());
        list.add(new SinglyLinkedList.Node());
        list.add(new SinglyLinkedList.Node());
        list.add(new SinglyLinkedList.Node());
        list.add(new SinglyLinkedList.Node());
        list.add(new SinglyLinkedList.Node());
        list.add(new SinglyLinkedList.Node());
        list.add(new SinglyLinkedList.Node());
        list.add(new SinglyLinkedList.Node());
        list.add(new SinglyLinkedList.Node());
        list.add(new SinglyLinkedList.Node());
        list.add(new SinglyLinkedList.Node());
        list.add(new SinglyLinkedList.Node());
        list.add(new SinglyLinkedList.Node());
        list.add(new SinglyLinkedList.Node());
        Assert.assertEquals(list.size(),20);
    }


}

