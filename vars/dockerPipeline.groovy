#!/usr/bin/env groovy
import org.library.dockerBuildStage

def call(args) {
    def dockerVersion = new dockerBuildStage()

    pipeline {
        agent any
        options {
            timeout(time: 1, unit: 'SECONDS')
        }
        stages {
            stage('Checks Existing file') {
                steps {
                    script {
                        def filePath = "${workspace}/Dockerfile"
                        if (!fileExists(filePath)) {
                            echo 'File does not exist. Exiting pipeline.'
                            currentBuild.result = 'ABORTED'
                            error "File not found: ${filePath}"
                        }
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
