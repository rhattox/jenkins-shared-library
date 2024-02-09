#!/usr/bin/env groovy
import org.library.dockerFunctions

def call(args) {
    def dockerFunctions = new dockerFunctions()

    pipeline {
        agent any
        stages {
            stage('Checks Existing file') {
                steps {
                    script {
                        dockerFunctions.checkDockerfileExists()
                        dockerFunctions.checkDockercomposeExists()
                    }
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
