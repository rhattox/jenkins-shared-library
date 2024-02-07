#!/usr/bin/env groovy

import org.library.dockerBuild

def call() {
    dockerbuild = new dockerBuild()

    pipeline {
        agent any
        stages {
            stage('Build') {
                steps {
                    dockerbuild
                }
            }
        }
    }
}
