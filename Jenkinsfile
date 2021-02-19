def grv

pipeline {
    agent any
    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0'], description: 'The version')
        string(name: 'CLIENT', defaultValue:'Betclic', description: 'name of the client')
    }
    stages {
        stage('init') {
             steps {
                echo 'LOAD GROOVY SCRIPT'
                script{
                    grv = load "script.groovy"
                 }
            }
        }
        stage('Build') {
            steps {
                script{
                    grv.buildApp()
                }
            }
        }
        stage('Test') {
            when {
                expression {
                    BRANCH_NAME == 'master' || BRANCH_NAME == 'dev'
                }
            }
            steps {
                script{
                    grv.testApp()
                }
                whateverFunction()
            }
        }
        stage('Deploy') {
            steps {
                script{
                    grv.deployApp()
                }
            }
        }
    }
    post {
        always {
            echo 'send email'
        }
    }
}

void whateverFunction() {
    println("Hello Word")
}