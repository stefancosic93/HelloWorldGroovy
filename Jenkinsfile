//@Library('junit.framework.TestCase')_
@Library("junit-4.3.jar") _

def modules = [:]

node {
    stage('Stage 1 - Build') {
          script{
            echo 'Hello world!'
            modules.first = load "vars/HelloWorldScript.groovy"
            modules.first.callName('Stefan') 
          }
    }
    
    stage('Stage 2') {
        script {
          Object p = load 'src/com/pkgName/SimpleClass.groovy'
          Object person = p.createPerson('Stefan', 20)
          person.increaseAge(10)
          echo 'Incremented age, is now : ' + person.age
          person.print(this)
        }
    }
    
    stage('Stage 3') {
        script {
          Object gv = load 'src/com/pkgName/GlobalVars.groovy'
          Object globalVar = gv.createGlobalVars()
          globalVar.print(this)
        }
    }
    
    stage('Stage 4 - Unit test') {
        script {
          Object t1 = load 'src/com/pkgName/TestSimpleClass.groovy'
          Object test1 = t1.createTest()
          test1.test1()
        }
    }
    
}
