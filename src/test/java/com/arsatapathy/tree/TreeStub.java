package com.arsatapathy.tree;

import org.junit.Before;

public abstract class TreeStub {
    /*

          1
        /   \
       2     3
      / \   / \
     4   5  6  7
      \
       8

     */
    protected Node one = new Node(1);
    protected Node two = new Node(2);
    protected Node three = new Node(3);
    protected Node four = new Node(4);
    protected Node five = new Node(5);
    protected Node six = new Node(6);
    protected Node seven = new Node(7);
    protected Node eight = new Node(8);

    @Before
    public void init() {
        one.left = two;
        one.right = three;
        two.left = four;
        two.right = five;
        four.right = eight;
        three.left = six;
        three.right = seven;
    }
}
