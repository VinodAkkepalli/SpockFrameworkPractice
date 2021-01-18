package org.shine.demo;

import org.junit.Assert;
import org.junit.Test;

public class MyClassTest {

    @Test
    public void testGetStr() {
        System.out.println("*****Running Java tests*****");
        String input = "Hi There";

        MyClass mc = new MyClass(input);

        Assert.assertEquals(input, mc.getStr());
    }
}