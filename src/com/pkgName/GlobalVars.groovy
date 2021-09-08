#!/usr/bin/env groovy

package com.pkgName

class GlobalVars {
   static String foo = "bar"

   // refer to this in a pipeline using:
   //
   // import com.pkgName.GlobalVars
   // println GlobalVars.foo
}
