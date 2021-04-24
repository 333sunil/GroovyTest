package com.test

import hudson.model.*
 
// get current thread / Executor
def thr = Thread.currentThread()
// get current build
def build = thr?.executable
 
 
// get parameters
def parameters = build?.actions.find{ it instanceof ParametersAction }?.parameters
parameters.each {
   println "parameter ${it.name}:"
   println it.dump()
   println "-" * 80
}
