package com.zipcodewilmington.singlylinkedlist;

import org.junit.*;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {


@Test
    public void testConstructor()
{
    SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
    Assert.assertNotNull(llist);
}


@Test
    public void testIsEmpty()
{
    SinglyLinkedList<Integer> llist = new SinglyLinkedList<Integer>();
    Assert.assertEquals((Boolean) true, llist.isEmpty());
}


    @Test
    public void testAdd1()
    {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<Integer>();
        llist.add(1);
        Assert.assertEquals((Boolean) false, llist.isEmpty());
    }

    @Test
    public void testAdd2()
    {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<Integer>();
        llist.add(1);
        llist.add(2);
        Assert.assertEquals((Boolean) false, llist.isEmpty());
    }


    @Test
    public void testToString()
    {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        String expected = "head -> NULL";
        String actual = llist.toString();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testToString2()
    {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(1);
        String expected = "head -> [1] -> NULL";
        String actual = llist.toString();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testToString3()
    {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(1);
        llist.add(2);
        String expected = "head -> [1] -> [2] -> NULL";
        String actual = llist.toString();
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void testSize0()
    {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<Integer>();
        Assert.assertEquals(0,llist.size());
    }

    @Test
    public void testSize1()
    {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<Integer>();
        llist.add(1);
        Assert.assertEquals(1,llist.size());
    }

    @Test
    public void testSize2()
    {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<Integer>();
        llist.add(1);
        llist.add(2);
        Assert.assertEquals(2,llist.size());
    }


    @Test
    public void testSize3()
    {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<Integer>();
        llist.add(1);
        llist.add(2);
        llist.add(3);
        Assert.assertEquals(3,llist.size());
    }

}

