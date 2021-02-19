
class Client {                                  
    String name
    Integer age
	
	def getName() {
		return name
	}
}
def person = new Client(name: 'Betclic', age: 2)

def buildApp(Client p){
    echo "le clien est ${p.getName()}"
    echo "building the application"
}

def testApp(){
    echo 'Testying the application'
}

def deployApp(){
    echo 'deploying the application'
    echo "deploying version: ${params.VERSION}"
}

//buildApp(person)

return this
