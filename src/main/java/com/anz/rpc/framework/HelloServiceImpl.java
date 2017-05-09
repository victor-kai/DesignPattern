package com.anz.rpc.framework;

public class HelloServiceImpl implements HelloService {

    /**
     * HelloServiceImpl
     * 
     * @author william.liangf
     */
    @Override
    public String hello(String name) {
        return "Hello " + name;
    }

}
