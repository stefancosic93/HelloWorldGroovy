#!/usr/bin/env groovy

def callName(String name = 'human') {
    echo "Hello, ${name}."
    def out
    def config = new HashMap()
    def bindings = getBinding()
    config.putAll(bindings.getVariables())
    out = config['out']
    out.println "Printed do Jenkins console."
}
