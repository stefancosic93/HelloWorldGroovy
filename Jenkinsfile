def modules = [:]

node {
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
          Object person = p.createPerson('Stefan', 20)
          person.increaseAge(10)
          echo 'Incremented age, is now : ' + person.age
          person.print(this)
        }
      }
    }
    stage('Stage 3') {
      steps {
        script {
          Object gv = load 'src/com/pkgName/GlobalVars.groovy'
          Object globalVar = gv.createGlobalVars()
          globalVar.print(this)
        }
      }
    }
}
