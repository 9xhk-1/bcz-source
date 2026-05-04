package com.baicizhan.online.bs_socials;

import org.apache.thrift.TEnum;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public enum BBShareModule implements TEnum {
    SHARE_MODULE_DAKA(0);

    private final int value;

    BBShareModule(int value) {
        this.value = value;
    }

    public static BBShareModule findByValue(int value) {
        if (value != 0) {
            return null;
        }
        return SHARE_MODULE_DAKA;
    }

    @Override // org.apache.thrift.TEnum
    public int getValue() {
        return this.value;
    }
}
