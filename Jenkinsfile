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
           //echo 'The value of foo is : ' + GlobalVars.foo
          Object p = load 'src/com/pkgName/SimpleClass.groovy'
          Object person = p.createPerson('STefan2')
          person.print(this)
        }
      }
    }
    
  }
} 
