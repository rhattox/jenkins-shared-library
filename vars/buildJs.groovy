#!/usr/bin/env groovy

import org.library.sayHello

def call(String name = 'human') {
    echo "Bye, ${name}."
    def notification = new sayHello()
    notification 'Zina'
}