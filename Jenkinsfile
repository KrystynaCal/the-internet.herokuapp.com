pipeline {
    agent any
    stages {
        stage('Verify') {
            steps {
                sh 'google-chrome --version'
                sh 'firefox --version'
            }
        }
        stage('Run Tests') {
            steps {
                sh './mvnw clean'
            }
        }
    }
}