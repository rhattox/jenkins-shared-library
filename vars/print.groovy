pipeline {
    agent any
    stages {
        stage('checkout git') {
            steps {
                echo "test"
            }
        }
    }
}