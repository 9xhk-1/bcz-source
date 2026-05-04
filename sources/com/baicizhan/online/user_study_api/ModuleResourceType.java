package com.baicizhan.online.user_study_api;

import org.apache.thrift.TEnum;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public enum ModuleResourceType implements TEnum {
    WORD_LISTENING(1),
    WORD_CHECK(2),
    ENGLISH_RECOGNIZED(3),
    CHINESE_RECOGNIZED(4),
    LISTENING_RECOGNIZED(5),
    FILL_BLANK_SPELLING(6),
    COMBINE_SPELLING(7),
    ALL_SPELLING(8),
    WORD_READING(9),
    WORD_VIDEO(10),
    WORD_RADIO(11),
    WORD_TRAINING(12);

    private final int value;

    ModuleResourceType(int value) {
        this.value = value;
    }

    public static ModuleResourceType findByValue(int value) {
        switch (value) {
            case 1:
                return WORD_LISTENING;
            case 2:
                return WORD_CHECK;
            case 3:
                return ENGLISH_RECOGNIZED;
            case 4:
                return CHINESE_RECOGNIZED;
            case 5:
                return LISTENING_RECOGNIZED;
            case 6:
                return FILL_BLANK_SPELLING;
            case 7:
                return COMBINE_SPELLING;
            case 8:
                return ALL_SPELLING;
            case 9:
                return WORD_READING;
            case 10:
                return WORD_VIDEO;
            case 11:
                return WORD_RADIO;
            case 12:
                return WORD_TRAINING;
            default:
                return null;
        }
    }

    @Override // org.apache.thrift.TEnum
    public int getValue() {
        return this.value;
    }
}
