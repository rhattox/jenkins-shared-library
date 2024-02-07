#!/usr/bin/env groovy
package org.library

def getDockerVersion(name) {
    sh  'docker --version'
}
