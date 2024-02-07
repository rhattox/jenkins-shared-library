#!/usr/bin/env groovy

import org.library.dockerBuild

def call() {
    notification = new dockerBuild()

    pipeline {
        agent any
        stages {
            stage('Build') {
                steps {
                    notification.call()
                }
            }
        }
    }
}
