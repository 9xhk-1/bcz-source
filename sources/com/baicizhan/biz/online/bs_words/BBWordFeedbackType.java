package com.baicizhan.biz.online.bs_words;

import kotlin.jvm.internal.v;
import m00.c;
import m80.k;
import m80.l;
import w00.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class BBWordFeedbackType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ BBWordFeedbackType[] $VALUES;

    @k
    public static final a Companion;

    @g
    public final int value;
    public static final BBWordFeedbackType FEEDBACK_TYPE_NONE = new BBWordFeedbackType("FEEDBACK_TYPE_NONE", 0, 0);
    public static final BBWordFeedbackType FEEDBACK_TYPE_LIKE = new BBWordFeedbackType("FEEDBACK_TYPE_LIKE", 1, 1);
    public static final BBWordFeedbackType FEEDBACK_TYPE_WORD_SPELL = new BBWordFeedbackType("FEEDBACK_TYPE_WORD_SPELL", 2, 2);
    public static final BBWordFeedbackType FEEDBACK_TYPE_WORD_ACCENT = new BBWordFeedbackType("FEEDBACK_TYPE_WORD_ACCENT", 3, 3);
    public static final BBWordFeedbackType FEEDBACK_TYPE_WORD_MEAN = new BBWordFeedbackType("FEEDBACK_TYPE_WORD_MEAN", 4, 4);
    public static final BBWordFeedbackType FEEDBACK_TYPE_WORD_AUDIO = new BBWordFeedbackType("FEEDBACK_TYPE_WORD_AUDIO", 5, 5);
    public static final BBWordFeedbackType FEEDBACK_TYPE_SENTENCE = new BBWordFeedbackType("FEEDBACK_TYPE_SENTENCE", 6, 6);
    public static final BBWordFeedbackType FEEDBACK_TYPE_SENTENCE_SPEEL = new BBWordFeedbackType("FEEDBACK_TYPE_SENTENCE_SPEEL", 7, 7);
    public static final BBWordFeedbackType FEEDBACK_TYPE_SENTENCE_MEAN = new BBWordFeedbackType("FEEDBACK_TYPE_SENTENCE_MEAN", 8, 8);
    public static final BBWordFeedbackType FEEDBACK_TYPE_SENTENCE_AUDIO = new BBWordFeedbackType("FEEDBACK_TYPE_SENTENCE_AUDIO", 9, 9);
    public static final BBWordFeedbackType FEEDBACK_TYPE_DEFORMATION = new BBWordFeedbackType("FEEDBACK_TYPE_DEFORMATION", 10, 10);
    public static final BBWordFeedbackType FEEDBACK_TYPE_IMAGE = new BBWordFeedbackType("FEEDBACK_TYPE_IMAGE", 11, 11);
    public static final BBWordFeedbackType FEEDBACK_TYPE_OPTION = new BBWordFeedbackType("FEEDBACK_TYPE_OPTION", 12, 12);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @l
        public final BBWordFeedbackType a(int i11) {
            switch (i11) {
                case 0:
                    return BBWordFeedbackType.FEEDBACK_TYPE_NONE;
                case 1:
                    return BBWordFeedbackType.FEEDBACK_TYPE_LIKE;
                case 2:
                    return BBWordFeedbackType.FEEDBACK_TYPE_WORD_SPELL;
                case 3:
                    return BBWordFeedbackType.FEEDBACK_TYPE_WORD_ACCENT;
                case 4:
                    return BBWordFeedbackType.FEEDBACK_TYPE_WORD_MEAN;
                case 5:
                    return BBWordFeedbackType.FEEDBACK_TYPE_WORD_AUDIO;
                case 6:
                    return BBWordFeedbackType.FEEDBACK_TYPE_SENTENCE;
                case 7:
                    return BBWordFeedbackType.FEEDBACK_TYPE_SENTENCE_SPEEL;
                case 8:
                    return BBWordFeedbackType.FEEDBACK_TYPE_SENTENCE_MEAN;
                case 9:
                    return BBWordFeedbackType.FEEDBACK_TYPE_SENTENCE_AUDIO;
                case 10:
                    return BBWordFeedbackType.FEEDBACK_TYPE_DEFORMATION;
                case 11:
                    return BBWordFeedbackType.FEEDBACK_TYPE_IMAGE;
                case 12:
                    return BBWordFeedbackType.FEEDBACK_TYPE_OPTION;
                default:
                    return null;
            }
        }

        public a() {
        }
    }

    private static final /* synthetic */ BBWordFeedbackType[] $values() {
        return new BBWordFeedbackType[]{FEEDBACK_TYPE_NONE, FEEDBACK_TYPE_LIKE, FEEDBACK_TYPE_WORD_SPELL, FEEDBACK_TYPE_WORD_ACCENT, FEEDBACK_TYPE_WORD_MEAN, FEEDBACK_TYPE_WORD_AUDIO, FEEDBACK_TYPE_SENTENCE, FEEDBACK_TYPE_SENTENCE_SPEEL, FEEDBACK_TYPE_SENTENCE_MEAN, FEEDBACK_TYPE_SENTENCE_AUDIO, FEEDBACK_TYPE_DEFORMATION, FEEDBACK_TYPE_IMAGE, FEEDBACK_TYPE_OPTION};
    }

    static {
        BBWordFeedbackType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
    }

    private BBWordFeedbackType(String str, int i11, int i12) {
        this.value = i12;
    }

    @k
    public static m00.a<BBWordFeedbackType> getEntries() {
        return $ENTRIES;
    }

    public static BBWordFeedbackType valueOf(String str) {
        return (BBWordFeedbackType) Enum.valueOf(BBWordFeedbackType.class, str);
    }

    public static BBWordFeedbackType[] values() {
        return (BBWordFeedbackType[]) $VALUES.clone();
    }
}
