package org.shine.demo


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
}
