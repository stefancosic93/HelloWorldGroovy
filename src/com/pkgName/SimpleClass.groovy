#!/usr/bin/env groovy
package com.pkgName

class SimpleClass {
   String name
   Integer age

   def increaseAge(Integer years) {
      this.age += years
   }
}
