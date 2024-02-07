#!/usr/bin/env groovy

import org.library.sayHello

def call(String name = 'human') {
    notification = new sayHello()

    pipeline {
        agent any
        stages {
            stage('Build') {
                steps {
                    echo(message: "Byesdoiahdoisahdla, ${name}")
                    notification '328765196846587684'
                }
            }
        }
    }
}
