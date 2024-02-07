#!/usr/bin/env groovy

import org.library.dockerBuild

def call() {
    docker_build = new dockerBuild()

    pipeline {
        agent any
        stages {
            stage('Build') {
                steps {
                    docker_build
                }
            }
        }
    }
}
