package com.baicizhan.online.advertise_api;

import org.apache.thrift.TEnum;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public enum AdvertiseLoadingModule implements TEnum {
    MODULE_FM(1),
    MODULE_MAIN(2),
    MODULE_PK(3);

    private final int value;

    AdvertiseLoadingModule(int value) {
        this.value = value;
    }

    public static AdvertiseLoadingModule findByValue(int value) {
        if (value == 1) {
            return MODULE_FM;
        }
        if (value == 2) {
            return MODULE_MAIN;
        }
        if (value != 3) {
            return null;
        }
        return MODULE_PK;
    }

    @Override // org.apache.thrift.TEnum
    public int getValue() {
        return this.value;
    }
}
