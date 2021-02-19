
class Client {                                  
    String name
    Integer age
	
	def getName() {
		return name
	}
}
def person = new Client(name: "${params.CLIENT}", age: 2)

def buildApp(){
    echo "le client est ${params.CLIENT}"
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
