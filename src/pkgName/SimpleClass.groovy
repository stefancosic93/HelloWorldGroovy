#!/usr/bin/env groovy

package pkgName

class SimpleClass {
   String name
   Integer age

   def increaseAge(Integer years) {
      this.age += years
   }
}
