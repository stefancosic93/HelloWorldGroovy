#!/usr/bin/env groovy

package com.pkgName

class GlobalVars {
   static String foo = "bar"

   // refer to this in a pipeline using:
   //
   // import com.pkgName.GlobalVars
   // println GlobalVars.foo
   
    public void print(def script) {
        script.sh "echo " + this.foo
    }
}

GlobalVars createGlobalVars() {
   new GlobalVars()
}

return this
