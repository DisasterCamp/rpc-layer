package com.rpc.layer.base.enums;

import com.rpc.layer.base.share.ValueObject;


public enum BootStrapType implements ValueObject<BootStrapType> {
    SERVER,CLIENT;

    @Override
    public boolean sameValueAs(BootStrapType other) {
        return false;
    }
}
