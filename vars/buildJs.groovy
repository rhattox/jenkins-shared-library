#!/usr/bin/env groovy

import org.library.sayHello

def call(String name = 'human') {
    pipeline {
        agent any
        stages {
            stage('Build') {
                steps {
                    cho "Bye, ${name}."
                    def notification = new sayHello()
                    notification 'Zina'
                }
            }
        }
    }
}
