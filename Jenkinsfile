pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                bat 'mvn clean test'
                echo 'Hello world'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Hello here, its  deploy stage'
            }
        }
        stage('Test') {
            steps {
                echo 'Hello from test stage'
            }
        }
        stage('Release') {
            steps {
                echo 'Hello from release stage'
            }
        }
    }
}