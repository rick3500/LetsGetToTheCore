pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git url 'https://github.com/rick3500/LetsGetToTheCore', branch: 'master'
            }
        }
        stage ('Build') {
            steps {
                sh './'
            }
        }
    }
}