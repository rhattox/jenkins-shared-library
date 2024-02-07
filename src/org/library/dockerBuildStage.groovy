#!/usr/bin/env groovy
package org.library

def buildDockerStage(name) {
    sh(script: 'echo ${name}')
}
