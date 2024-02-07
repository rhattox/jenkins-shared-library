#!/usr/bin/env groovy

def call(args) {
    dockerBuildStageFunc = new org.library.dockerBuildStage()

    pipeline {
        agent any
        stages {
            stage('Build') {
                steps {
                    dockerBuildStageFunc.buildDockerStage('5555')
                }
            }
        }
    }
}
