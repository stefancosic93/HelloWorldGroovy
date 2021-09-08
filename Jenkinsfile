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
            modules.first = load "HelloWorldScript.groovy"
            modules.first.call('Stefan') 
          }
      }
    }
  }
} 
