pipeline {
    agent any

    stages {
        stage('Checkout SCM') {
            steps {
                checkout([$class: 'GitSCM',
                          branches: [[name: '*/master']],
                          userRemoteConfigs: [[url: 'https://github.com/KrystynaCal/the-internet.herokuapp.com.git']]])
            }
        }

        stage('Build and Test') {
            steps {
                script {
                    // Sprawdź, czy system działa na Windowsie
                    if (isUnix()) {
                        // Jeśli to UNIX, użyj polecenia 'nohup' w tle
                        sh 'nohup mvn clean test &'
                    } else {
                        // W przeciwnym razie użyj standardowego polecenia
                        sh 'mvn clean test'
                    }
                }
            }
        }
    }
}

def isUnix() {
    return !isWindows()
}

def isWindows() {
    return System.getProperty('os.name').toLowerCase().contains('win')
}
