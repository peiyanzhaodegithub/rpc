package com.rrtv.rpc.client.transport;

import lombok.extern.slf4j.Slf4j;

/**
 * @Date: 2021/7/25 15:12
 */
@Slf4j
public class NetClientTransportFactory {

    public static NetClientTransport getNetClientTransport(){
        return new NettyNetClientTransport();
    }


}
