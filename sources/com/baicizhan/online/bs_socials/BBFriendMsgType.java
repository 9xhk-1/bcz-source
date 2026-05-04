package com.baicizhan.online.bs_socials;

import org.apache.thrift.TEnum;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public enum BBFriendMsgType implements TEnum {
    APPLY_FRIEND(100),
    ACCEPT_FRIEND(102);

    private final int value;

    BBFriendMsgType(int value) {
        this.value = value;
    }

    public static BBFriendMsgType findByValue(int value) {
        if (value == 100) {
            return APPLY_FRIEND;
        }
        if (value != 102) {
            return null;
        }
        return ACCEPT_FRIEND;
    }

    @Override // org.apache.thrift.TEnum
    public int getValue() {
        return this.value;
    }
}
