package com.anz.rpc.framework;

public class RpcProvider {

    /**
     * RpcProvider
     * 
     * @author william.liangf
     */
    public static void main(String[] args) throws Exception {
        HelloService service = new HelloServiceImpl();
        RpcFramework.export(service, 1234);
    }

}
