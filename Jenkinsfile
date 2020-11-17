pipeline {
    agent {
        dockerfile {
            dir 'm4'
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
                sh 'printenv'
                sh 'ls -l "$WORKSPACE"'
            }
        }
        stage('Build') {
            steps {
                sh 'dotnet build "$WORKSPACE/'
            }
        }
    }
}