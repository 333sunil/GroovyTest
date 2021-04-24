package com.test

import hudson.model.*

def env = System.getenv()
env.each{
println it
}
