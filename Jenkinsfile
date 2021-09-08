//@Library('HelloWorldGroovy')_
 
import var.HelloWorldGroovy
// Jenkinsfile (Declarative Pipeline)
pipeline {
  agent any
  stages {
    stage('Stage 1') {
      steps {
        echo 'Hello world!'
        HelloWorldGroovy 'Stefan'
      }
    }
  }
} 
