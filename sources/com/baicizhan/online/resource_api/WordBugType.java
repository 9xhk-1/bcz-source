package com.baicizhan.online.resource_api;

import org.apache.thrift.TEnum;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public enum WordBugType implements TEnum {
    BASIC(1),
    VARIANT(2),
    SENTENCE(3),
    VIDEO(4),
    SYNONYM(5),
    ANTONYM(6),
    SHORT_PHRASE(7),
    ETYMA(8),
    DEFORMATION(9),
    EN_MEAN(10),
    SIMILAR(11);

    private final int value;

    WordBugType(int value) {
        this.value = value;
    }

    public static WordBugType findByValue(int value) {
        switch (value) {
            case 1:
                return BASIC;
            case 2:
                return VARIANT;
            case 3:
                return SENTENCE;
            case 4:
                return VIDEO;
            case 5:
                return SYNONYM;
            case 6:
                return ANTONYM;
            case 7:
                return SHORT_PHRASE;
            case 8:
                return ETYMA;
            case 9:
                return DEFORMATION;
            case 10:
                return EN_MEAN;
            case 11:
                return SIMILAR;
            default:
                return null;
        }
    }

    @Override // org.apache.thrift.TEnum
    public int getValue() {
        return this.value;
    }
}
