package org.shine.demo

import org.shine.demo.MyClassTest
import spock.lang.Specification

class ConditionDiffing extends Specification {

    def "compare sets"() {
        expect:
        ["abc", "xyz", "lmn"] as Set == ["abc", "lmn", "xyz"] as Set
        ["abc", "xyz", "lmn"] as Set != ["abc", "almnmm", "xyz"] as Set
    }

    def "compare POJOs"() {
        given:
        def mc1 = new MyClass("Vinod");
        def mc2 = new MyClass("Vin" + "od")

        expect:
        //uses equals method of MyClass()
        mc1 == mc2
    }




}
