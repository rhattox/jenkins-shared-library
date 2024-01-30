#!/usr/bin/env groovy
package org.library
def call(String name = 'human') {
    echo "Bye, ${name}."
}