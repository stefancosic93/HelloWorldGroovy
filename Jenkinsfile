//@Library('HelloWorldGroovy')_
def modules = [:]

// Jenkinsfile (Declarative Pipeline)
pipeline {
  agent any
  stages {
    stage('Stage 1') {
      steps {
          script{
            echo 'Hello world!'
            modules.first = load "vars/HelloWorldScript.groovy"
            modules.first.call('Stefan') 
          }
      }
    }
  }
} 
