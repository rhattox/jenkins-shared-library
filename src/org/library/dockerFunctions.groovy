#!/usr/bin/env groovy
package org.library

def checkDockerfileExists() {
    def filePath = "${workspace}/Dockerfile"
    if (!fileExists(filePath)) {
        echo 'File does not exist. Exiting pipeline.'
        currentBuild.result = 'FAILURE'
        error "File not found: ${filePath}"
    }
}

def checkDockercomposeExists() {
    def filePath1 = "${workspace}/docker-compose.yaml"
    def filePath2 = "${workspace}/docker-compose.yml"
    if (! fileExists(filePath1) && ! fileExists(filePath2)) {
        echo 'File does not exist. Exiting pipeline.'
        currentBuild.result = 'FAILURE'
        error "File not found: ${filePath1} or ${filePath2}"
    }
}

def dockerBuildImage() {
    sh(script: "whoami")
    def filePath1 = "${workspace}/docker-compose.yaml"
    def filePath2 = "${workspace}/docker-compose.yml"
    if (fileExists(filePath1)) {
       docker.build('my-image:latest')
    } else {
        sh(script: "docker compose -f ${filePath2} build")
    }
}
