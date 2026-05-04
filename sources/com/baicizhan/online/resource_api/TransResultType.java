package com.baicizhan.online.resource_api;

import org.apache.thrift.TEnum;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public enum TransResultType implements TEnum {
    TRANS(1),
    SUGGEST(2),
    NOTFOUND(3),
    WORD(4);

    private final int value;

    TransResultType(int value) {
        this.value = value;
    }

    public static TransResultType findByValue(int value) {
        if (value == 1) {
            return TRANS;
        }
        if (value == 2) {
            return SUGGEST;
        }
        if (value == 3) {
            return NOTFOUND;
        }
        if (value != 4) {
            return null;
        }
        return WORD;
    }

    @Override // org.apache.thrift.TEnum
    public int getValue() {
        return this.value;
    }
}
