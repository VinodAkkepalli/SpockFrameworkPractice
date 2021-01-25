package org.shine.demo;

import org.junit.Assert;
import org.junit.Test;
import org.location.custom.CustomSrcClass;

public class MyClassTest {

    @Test
    public void testGetStr() {
        System.out.println("*****Running Java tests*****");
        String input = "Hi There";

        MyClass mc = new MyClass(input);

        Assert.assertEquals(input, mc.getStr());
    }

    @Test
    public void testGetReply() {
        System.out.println("*****Running Java tests*****");

        CustomSrcClass csc = new CustomSrcClass();

        Assert.assertEquals("Custom Reply!!!", csc.customMethod(10));
        Assert.assertEquals("999 Reply!!!", csc.customMethod(999));
    }
}