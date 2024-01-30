#!/usr/bin/env groovy
package org.library
def call(String name = 'human') {
    echo "Hello, ${name}."
}