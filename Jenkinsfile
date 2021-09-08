//@Library('HelloWorldGroovy')_
def modules = [:]

import com.pkgName.SimpleClass
import com.pkgName.GlobalVars

// Jenkinsfile (Declarative Pipeline)
pipeline {
  agent any
  stages {
    stage('Stage 1') {
      steps {
          script{
            echo 'Hello world!'
            modules.first = load "vars/HelloWorldScript.groovy"
            modules.first.callName('Stefan') 
          }
        
            echo 'The value of foo is : ' + GlobalVars.foo

            script {
                def person = new SimpleClass()
                person.age = 21
                person.increaseAge(10)
                echo 'Incremented age, is now : ' + person.age
            }
      }
    }
  }
} 
