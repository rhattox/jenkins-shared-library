#!/usr/bin/env groovy

import org.library.dockerBuild

def call(String name = 'human') {
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
