package stack;

import com.arsatapathy.stack.MyStack;
import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {

    @Test
    public void test_01() {
        MyStack myStack = new MyStack();

        Assert.assertTrue(myStack.isEmpty());

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        Assert.assertFalse(myStack.isEmpty());

        Assert.assertEquals(5, myStack.peek());
        Assert.assertEquals(5, myStack.pop());
        Assert.assertEquals(4, myStack.pop());
        Assert.assertEquals(3, myStack.pop());
        Assert.assertEquals(2, myStack.pop());
        Assert.assertEquals(1, myStack.pop());

        Assert.assertTrue(myStack.isEmpty());
    }
}
