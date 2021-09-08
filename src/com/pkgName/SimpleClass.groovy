#!/usr/bin/env groovy
package com.pkgName

class SimpleClass {
   String name
   Integer age

   SimpleClass(String name) {
      this.name = name;
   }

   public void print(def script) {
      script.sh "echo Name:" + name + "  Age:" + this.age
   }

   def increaseAge(Integer years) {
      this.age += years
   }
}

SimpleClass createPerson(String name) {
    new SimpleClass(name)
}

return this
