package com.baicizhan.online.bs_socials;

import org.apache.thrift.TEnum;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public enum BBShareChannel implements TEnum {
    SHARE_CHANNEL_WEIXIN_CIRCLE(0),
    SHARE_CHANNEL_WEIXIN_FRIEND(1),
    SHARE_CHANNEL_SINA(2),
    SHARE_CHANNEL_QQ_CIRCLE(3),
    SHARE_CHANNEL_QQ_FRIEND(4);

    private final int value;

    BBShareChannel(int value) {
        this.value = value;
    }

    public static BBShareChannel findByValue(int value) {
        if (value == 0) {
            return SHARE_CHANNEL_WEIXIN_CIRCLE;
        }
        if (value == 1) {
            return SHARE_CHANNEL_WEIXIN_FRIEND;
        }
        if (value == 2) {
            return SHARE_CHANNEL_SINA;
        }
        if (value == 3) {
            return SHARE_CHANNEL_QQ_CIRCLE;
        }
        if (value != 4) {
            return null;
        }
        return SHARE_CHANNEL_QQ_FRIEND;
    }

    @Override // org.apache.thrift.TEnum
    public int getValue() {
        return this.value;
    }
}
