package com.baicizhan.online.resource_api;

import org.apache.thrift.TEnum;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public enum GetTopicResourceChannel implements TEnum {
    SEARCH_WORD(1),
    STUDY(2),
    WORD_LIST_LEARNED(3),
    WORD_LIST_UNLEARNED(4),
    WORD_LIST_KILLED(5),
    WORD_LIST_COLLECTED(6),
    LOOK_UP(7),
    OTHER(9);

    private final int value;

    GetTopicResourceChannel(int value) {
        this.value = value;
    }

    public static GetTopicResourceChannel findByValue(int value) {
        switch (value) {
            case 1:
                return SEARCH_WORD;
            case 2:
                return STUDY;
            case 3:
                return WORD_LIST_LEARNED;
            case 4:
                return WORD_LIST_UNLEARNED;
            case 5:
                return WORD_LIST_KILLED;
            case 6:
                return WORD_LIST_COLLECTED;
            case 7:
                return LOOK_UP;
            case 8:
            default:
                return null;
            case 9:
                return OTHER;
        }
    }

    @Override // org.apache.thrift.TEnum
    public int getValue() {
        return this.value;
    }
}
