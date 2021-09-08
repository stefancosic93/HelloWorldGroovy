#!/usr/bin/env groovy
package com.cleverbuilder

class SimpleClass {
   String name
   Integer age

   def increaseAge(Integer years) {
      this.age += years
   }
}
