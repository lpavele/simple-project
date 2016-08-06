package by.lpe.simple

import spock.lang.Specification

/**
 * Created by jsvkv on 02.08.2016.
 */
class SimpleTest extends Specification {
    def "first simple"() {
        setup:
        def stack = new Stack();
        def elem = "push me";
        when:
        stack.push(elem);
        then:
        !stack.empty
        stack.size() == 1
        stack.peek() == elem
    }

    def "second"(){
        expect: Math.max(10,4) == 10
    }

    def "third" (){
        expect: Math.max(a,b) == c
        where:"начинается проверка"
        a<<[3,5]
        b<<[5,1]
        c<<[5,5]
    }
}
