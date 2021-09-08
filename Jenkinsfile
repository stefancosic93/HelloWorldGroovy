//@Library('HelloWorldGroovy')_
def modules = [:]

// Jenkinsfile (Declarative Pipeline)
pipeline {
  agent any
  stages {
    stage('Stage 1') {
      steps {
        echo 'Hello world!'
        modules.first = load "HelloWorldGroovy.groovy"
        modules.first.call('Stefan') 
      }
    }
  }
} 
