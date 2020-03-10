package com.writeinthecode.bohrmod.Proxy;

import com.writeinthecode.bohrmod.Init.WorldGenerator;

public class CommonProxy {

    public void construct(){}

    public void setup(){
        WorldGenerator.setup();
    }

    public void complete(){}
}