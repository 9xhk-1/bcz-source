package com.baicizhan.online.bs_words;

import org.apache.thrift.TEnum;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public enum BBWordFeedbackModule implements TEnum {
    FEEDBACK_MODULE_OTHER(0),
    FEEDBACK_MODULE_WIKI(1),
    FEEDBACK_MODULE_STUDY(2),
    FEEDBACK_MODULE_FM(3),
    FEEDBACK_MODULE_POSTER(4);

    private final int value;

    BBWordFeedbackModule(int value) {
        this.value = value;
    }

    public static BBWordFeedbackModule findByValue(int value) {
        if (value == 0) {
            return FEEDBACK_MODULE_OTHER;
        }
        if (value == 1) {
            return FEEDBACK_MODULE_WIKI;
        }
        if (value == 2) {
            return FEEDBACK_MODULE_STUDY;
        }
        if (value == 3) {
            return FEEDBACK_MODULE_FM;
        }
        if (value != 4) {
            return null;
        }
        return FEEDBACK_MODULE_POSTER;
    }

    @Override // org.apache.thrift.TEnum
    public int getValue() {
        return this.value;
    }
}
