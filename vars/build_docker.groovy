#!/usr/bin/env groovy

import org.library.dockerBuild

def call() {
    build_docker_image = new dockerBuild()

    pipeline {
        agent any
        stages {
            stage('Build') {
                steps {
                    build_docker_image ''
                }
            }
        }
    }
}
