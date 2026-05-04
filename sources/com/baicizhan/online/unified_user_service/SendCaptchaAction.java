package com.baicizhan.online.unified_user_service;

import org.apache.thrift.TEnum;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public enum SendCaptchaAction implements TEnum {
    REGISTER(1),
    RESET_PW(2),
    BIND_PHONE(3),
    LOGIN(5),
    OLD_BIND(6),
    NEW_BIND(7),
    CHECK_PASS(8);

    private final int value;

    SendCaptchaAction(int value) {
        this.value = value;
    }

    public static SendCaptchaAction findByValue(int value) {
        switch (value) {
            case 1:
                return REGISTER;
            case 2:
                return RESET_PW;
            case 3:
                return BIND_PHONE;
            case 4:
            default:
                return null;
            case 5:
                return LOGIN;
            case 6:
                return OLD_BIND;
            case 7:
                return NEW_BIND;
            case 8:
                return CHECK_PASS;
        }
    }

    @Override // org.apache.thrift.TEnum
    public int getValue() {
        return this.value;
    }
}
