#!/usr/bin/env groovy
@Library("junit-4.3.jar") _
import junit.framework.TestCase

package com.pkgName

class TestSimpleClass extends TestCase {
    // create a simple class
    SimpleClass sc = new SimpleClass("Stefan", 23)

    @Test
    public void test1() {
        // check the name
        assertFalse(sc.name != "Stefan")

        // check the age
        assertFalse(sc.age != 23)

        // else
        assertTrue(true)
    }

}

TestSimpleClass createTest() {
    new TestSimpleClass()
}

return this
