package com.baicizhan.online.hero_api;

import org.apache.thrift.TEnum;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public enum SysStatus implements TEnum {
    COUNT_DOWN(0),
    START(1),
    OVER(2),
    FATAL(3);

    private final int value;

    SysStatus(int value) {
        this.value = value;
    }

    public static SysStatus findByValue(int value) {
        if (value == 0) {
            return COUNT_DOWN;
        }
        if (value == 1) {
            return START;
        }
        if (value == 2) {
            return OVER;
        }
        if (value != 3) {
            return null;
        }
        return FATAL;
    }

    @Override // org.apache.thrift.TEnum
    public int getValue() {
        return this.value;
    }
}
