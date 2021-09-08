#!/usr/bin/env groovy
@Grab(org.robolectric:junit:4.6.1)
import junit.framework.TestCase

package com.pkgName

import junit.framework.TestCase
import org.junit.Test

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
