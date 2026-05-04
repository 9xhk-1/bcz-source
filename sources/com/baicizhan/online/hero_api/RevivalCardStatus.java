package com.baicizhan.online.hero_api;

import org.apache.thrift.TEnum;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public enum RevivalCardStatus implements TEnum {
    NO_AVAILABLE(0),
    AVAILABLE(1);

    private final int value;

    RevivalCardStatus(int value) {
        this.value = value;
    }

    public static RevivalCardStatus findByValue(int value) {
        if (value == 0) {
            return NO_AVAILABLE;
        }
        if (value != 1) {
            return null;
        }
        return AVAILABLE;
    }

    @Override // org.apache.thrift.TEnum
    public int getValue() {
        return this.value;
    }
}
