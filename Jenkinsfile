def modules = [:]

//import com.pkgName.SimpleClass
//import com.pkgName.GlobalVars

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
      }
    }
    stage('Stage 2') {
      steps {
         script {
              modules.global = load "src/com/pkgName/GlobalVars.groovy"
              echo 'The value of foo is : ' + modules.global.foo
           
              modules.simple = load "src/com/pkgName/SimpleClass.groovy"

              def person = new modules.simple()
              person.age = 21
              person.increaseAge(10)
              echo 'Incremented age, is now : ' + person.age
          }
      }
    }
    
  }
} 
