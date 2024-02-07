#!/usr/bin/env groovy

import org.library.dockerBuildStage

def call(String name = 'human') {
    dockerBuildStageFunc = new dockerBuildStage()

    pipeline {
        agent any
        stages {
            stage('Build') {
                steps {
                    dockerBuildStageFunc '5555'
                }
            }
        }
    }
}
