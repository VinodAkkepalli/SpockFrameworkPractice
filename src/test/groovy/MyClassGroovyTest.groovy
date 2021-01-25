package org.shine.demo

import org.location.custom.CustomSrcClass
import spock.lang.Specification

class MyClassGroovyTest extends Specification {

    def "GetStr success case test"() {
        System.out.println("*****Running Groovy tests*****");

        given:
        String input = "Hi There"

        when:
        MyClass mc = new MyClass(input)

        then:
        input == mc.getStr()
    }

    def "GetStr failure case test"() {
        System.out.println("*****Running Groovy tests*****");

        given:
        String input = "Hi There"

        when:
        MyClass mc = new MyClass(input)

        then:
        input + " Vinod" != mc.getStr()
    }

    def "test custom reply"() {
        System.out.println("*****Running Groovy tests*****");

        when:
        CustomSrcClass csc = new CustomSrcClass()

        then:
        "Custom Reply!!!" == csc.customMethod(20)
        "999 Reply!!!" == csc.customMethod(999)
    }
}
