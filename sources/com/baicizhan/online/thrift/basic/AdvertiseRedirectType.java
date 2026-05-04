package com.baicizhan.online.thrift.basic;

import org.apache.thrift.TEnum;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public enum AdvertiseRedirectType implements TEnum {
    REDIRECT_NOTHING(0),
    REDIRECT_TAOBAO(1),
    REDIRECT_BROWSER(2),
    REDIRECT_SYS_NOTIFY(3),
    REDIRECT_LOCAL_STORE(4),
    REDIRECT_PI(5),
    REDIRECT_ONLY_NATIVE_MALL(6);

    private final int value;

    AdvertiseRedirectType(int value) {
        this.value = value;
    }

    public static AdvertiseRedirectType findByValue(int value) {
        switch (value) {
            case 0:
                return REDIRECT_NOTHING;
            case 1:
                return REDIRECT_TAOBAO;
            case 2:
                return REDIRECT_BROWSER;
            case 3:
                return REDIRECT_SYS_NOTIFY;
            case 4:
                return REDIRECT_LOCAL_STORE;
            case 5:
                return REDIRECT_PI;
            case 6:
                return REDIRECT_ONLY_NATIVE_MALL;
            default:
                return null;
        }
    }

    @Override // org.apache.thrift.TEnum
    public int getValue() {
        return this.value;
    }
}
