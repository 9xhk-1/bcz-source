package com.baicizhan.online.advertise_api;

import org.apache.thrift.TEnum;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public enum BczLaunchAdClickType implements TEnum {
    WEBVIEW(1),
    BROWSER(2),
    OTHERAPP(3),
    OTHERAPP_THEN_WEBVIEW(4),
    OTHERAPP_THEN_BROWSER(5),
    MINI_PROGRAM(6);

    private final int value;

    BczLaunchAdClickType(int value) {
        this.value = value;
    }

    public static BczLaunchAdClickType findByValue(int value) {
        switch (value) {
            case 1:
                return WEBVIEW;
            case 2:
                return BROWSER;
            case 3:
                return OTHERAPP;
            case 4:
                return OTHERAPP_THEN_WEBVIEW;
            case 5:
                return OTHERAPP_THEN_BROWSER;
            case 6:
                return MINI_PROGRAM;
            default:
                return null;
        }
    }

    @Override // org.apache.thrift.TEnum
    public int getValue() {
        return this.value;
    }
}
