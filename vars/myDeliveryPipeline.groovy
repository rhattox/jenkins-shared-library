def call(body) {
    
    pipeline {
        agent any
        stages {
            stage('build') {
                steps {
                    sh 'mvn clean package -DskipTests=true'
                }
            }
        }
    }
}