package com.codurance.ocp;

interface IEmployee {
    
    default int payAmount() {
        return 0;
    }
}
