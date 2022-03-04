package Message;

import org.junit.Assert;
import org.junit.Test;

public class TestMessage {

    Message msg = new Message();

    @Test
    public void t1(){
        Assert.assertTrue(msg.sendMessage("A","B","C"));
    }
    @Test
    public void t2(){
        Assert.assertTrue(msg.sendMessage("A","B","C"));
    }
    @Test
    public void t3(){
        Assert.assertTrue(msg.sendMessage("","","C"));
    }
    @Test
    public void t4(){
        Assert.assertTrue(msg.sendMessage("","","C"));
    }


}
