#!/usr/bin/env groovy
import org.library.dockerBuildStage

def call(args) {
    def dockerVersion = new dockerBuildStage()
    pipeline {
        agent any
        options {
            // Timeout counter starts AFTER agent is allocated
            timeout(time: 1, unit: 'SECONDS')
        }
        stages {
            stage('Checks Existing file'){
                steps{
                    fileExists 'Dockerfile'
                }
            }
            stage('Example') {
                steps {
                    echo 'Hello World'
                }
            }
            stage('Docker') {
                steps {
                    script {
                        dockerVersion('')
                    }
                }
            }
        }
    }
}
