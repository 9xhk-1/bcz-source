package com.baicizhan.online.hero_api;

import org.apache.thrift.TEnum;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public enum UserStatus implements TEnum {
    ONGOING(0),
    FAIL(1),
    WIN(2);

    private final int value;

    UserStatus(int value) {
        this.value = value;
    }

    public static UserStatus findByValue(int value) {
        if (value == 0) {
            return ONGOING;
        }
        if (value == 1) {
            return FAIL;
        }
        if (value != 2) {
            return null;
        }
        return WIN;
    }

    @Override // org.apache.thrift.TEnum
    public int getValue() {
        return this.value;
    }
}
