package com.baicizhan.online.hero_api;

import org.apache.thrift.TEnum;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public enum TopicStatus implements TEnum {
    QUESTION(0),
    ANSWER(1);

    private final int value;

    TopicStatus(int value) {
        this.value = value;
    }

    public static TopicStatus findByValue(int value) {
        if (value == 0) {
            return QUESTION;
        }
        if (value != 1) {
            return null;
        }
        return ANSWER;
    }

    @Override // org.apache.thrift.TEnum
    public int getValue() {
        return this.value;
    }
}
