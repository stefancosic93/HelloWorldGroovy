println("Hello, Groovy!")
call()

def call() {
    println('Function CALL was initiated!')
}

def callName(String name = 'human') {
    echo "Hello, ${name}."
    call()
}