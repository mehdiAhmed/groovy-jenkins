
class Client {                                  
    String name
    Integer age
	
	def getName() {
		return name
	}
}
def person = new Client(name: 'Betclic', age: 2)

def buildApp(Client p){
    println "le clien est ${p.getName()}"
    println "building the application"
}

def testApp(){
    println 'Testying the application'
}

def deployApp(){
    println 'deploying the application'
    println "deploying version: ${params.VERSION}"
}

//buildApp(person)

return this
