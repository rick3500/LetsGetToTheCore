pipeline {
    agent {
        dockerfile {
            filename 'Dockerfile.sdk'
        }
    }
    stages {
        stage('Verify') {
            steps {
                sh '''
                    dotnet --list-sdks
                    dotnet --list-runtimes
                '''
              
            }
        }
        stage('Build') {
            steps {
               sh 'dotnet build LetsGetToTheCore.xproj'
            }
        }
    }
}