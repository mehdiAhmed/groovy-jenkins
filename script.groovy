
class Client {                                  
    String name
    Integer age
}
def person = new client(name: 'Betclic', age: 2)

def buildApp(){
    println "Hello from the shebang ${person.name}"
    echo "building the application
}

def testApp(){
    echo 'Testying the application'
}

def deployApp(){
    echo 'deploying the application'
    echo "deploying version: ${params.VERSION}"
}

return this
