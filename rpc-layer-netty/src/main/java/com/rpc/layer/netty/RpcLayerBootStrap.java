package com.rpc.layer.netty;

import com.rpc.layer.base.enums.BootStrapType;
import java.util.concurrent.atomic.AtomicBoolean;

public class RpcLayerBootStrap {
    private final AtomicBoolean clientIsRunning = new AtomicBoolean(false);
    private final AtomicBoolean serverIsRunning = new AtomicBoolean(false);

    public static void init(BootStrapType bootStrapType){

    }
}
