def buildApp(){
    echo 'building the application'
}

def testApp(){
    echo 'Testying the application'
}

def deployApp(){
    echo 'deploying the application'
    echo "deploying version: ${params.VERSION}"
}

