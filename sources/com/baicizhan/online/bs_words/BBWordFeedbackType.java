package com.baicizhan.online.bs_words;

import org.apache.thrift.TEnum;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public enum BBWordFeedbackType implements TEnum {
    FEEDBACK_TYPE_NONE(0),
    FEEDBACK_TYPE_LIKE(1),
    FEEDBACK_TYPE_WORD_SPELL(2),
    FEEDBACK_TYPE_WORD_ACCENT(3),
    FEEDBACK_TYPE_WORD_MEAN(4),
    FEEDBACK_TYPE_WORD_AUDIO(5),
    FEEDBACK_TYPE_SENTENCE(6),
    FEEDBACK_TYPE_SENTENCE_SPEEL(7),
    FEEDBACK_TYPE_SENTENCE_MEAN(8),
    FEEDBACK_TYPE_SENTENCE_AUDIO(9),
    FEEDBACK_TYPE_DEFORMATION(10),
    FEEDBACK_TYPE_IMAGE(11),
    FEEDBACK_TYPE_OPTION(12);

    private final int value;

    BBWordFeedbackType(int value) {
        this.value = value;
    }

    public static BBWordFeedbackType findByValue(int value) {
        switch (value) {
            case 0:
                return FEEDBACK_TYPE_NONE;
            case 1:
                return FEEDBACK_TYPE_LIKE;
            case 2:
                return FEEDBACK_TYPE_WORD_SPELL;
            case 3:
                return FEEDBACK_TYPE_WORD_ACCENT;
            case 4:
                return FEEDBACK_TYPE_WORD_MEAN;
            case 5:
                return FEEDBACK_TYPE_WORD_AUDIO;
            case 6:
                return FEEDBACK_TYPE_SENTENCE;
            case 7:
                return FEEDBACK_TYPE_SENTENCE_SPEEL;
            case 8:
                return FEEDBACK_TYPE_SENTENCE_MEAN;
            case 9:
                return FEEDBACK_TYPE_SENTENCE_AUDIO;
            case 10:
                return FEEDBACK_TYPE_DEFORMATION;
            case 11:
                return FEEDBACK_TYPE_IMAGE;
            case 12:
                return FEEDBACK_TYPE_OPTION;
            default:
                return null;
        }
    }

    @Override // org.apache.thrift.TEnum
    public int getValue() {
        return this.value;
    }
}
