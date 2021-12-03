package com.rrtv.rpc.core.serialization;

import java.io.IOException;

/**
 * @Date: 2021/7/4 13:36
 */
public interface RpcSerialization {
    <T> byte[] serialize(T obj) throws IOException;

    <T> T deserialize(byte[] data, Class<T> clz) throws IOException;
}