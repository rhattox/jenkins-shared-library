#!/usr/bin/env groovy
import org.library.dockerBuildStage

def call(args) {
    def dockerVersion = new dockerBuildStage()

    pipeline {
        agent any
        stages {
            stage('Checks Existing file') {
                steps {
                    script {
                        def myStage = load 'dockerBuildStage.groovy'
                        myStage.call()
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
