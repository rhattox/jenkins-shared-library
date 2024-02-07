#!/usr/bin/env groovy

def call(args) {
    pipeline {
        agent any
        options {
            // Timeout counter starts AFTER agent is allocated
            timeout(time: 1, unit: 'SECONDS')
        }
        stages {
            stage('Example') {
                steps {
                    echo 'Hello World'
                }
            }
            stage('Docker') {
                steps {
                    sh 'docker --version'
                }
            }
        }
    }
}
