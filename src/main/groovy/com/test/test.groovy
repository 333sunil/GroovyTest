package com.test

import hudson.model.*

// Get the out variable
def out = getBinding().out;

class OutputClass
{
    OutputClass(out)  // Have to pass the out variable to the class
    {
        out.println ("Inside class")
        out.println ("${WORKSPACE}")
    }
}

out.println("Outside class")
output = new OutputClass(out)
