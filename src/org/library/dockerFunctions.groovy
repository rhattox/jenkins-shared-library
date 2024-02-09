#!/usr/bin/env groovy
package org.library

def checkDockerfileExists(args) {
    def filePath = "${workspace}/Dockerfile"
    if (!fileExists(filePath)) {
        echo 'File does not exist. Exiting pipeline.'
        currentBuild.result = 'FAILURE'
        error "File not found: ${filePath}"
    }
}
