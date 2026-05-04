package com.baicizhan.biz.online.resource_api;

import kotlin.jvm.internal.v;
import m00.c;
import m80.k;
import m80.l;
import w00.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class WordBugType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ WordBugType[] $VALUES;

    @k
    public static final a Companion;

    @g
    public final int value;
    public static final WordBugType BASIC = new WordBugType("BASIC", 0, 1);
    public static final WordBugType VARIANT = new WordBugType("VARIANT", 1, 2);
    public static final WordBugType SENTENCE = new WordBugType("SENTENCE", 2, 3);
    public static final WordBugType VIDEO = new WordBugType("VIDEO", 3, 4);
    public static final WordBugType SYNONYM = new WordBugType("SYNONYM", 4, 5);
    public static final WordBugType ANTONYM = new WordBugType("ANTONYM", 5, 6);
    public static final WordBugType SHORT_PHRASE = new WordBugType("SHORT_PHRASE", 6, 7);
    public static final WordBugType ETYMA = new WordBugType("ETYMA", 7, 8);
    public static final WordBugType DEFORMATION = new WordBugType("DEFORMATION", 8, 9);
    public static final WordBugType EN_MEAN = new WordBugType("EN_MEAN", 9, 10);
    public static final WordBugType SIMILAR = new WordBugType("SIMILAR", 10, 11);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @l
        public final WordBugType a(int i11) {
            switch (i11) {
                case 1:
                    return WordBugType.BASIC;
                case 2:
                    return WordBugType.VARIANT;
                case 3:
                    return WordBugType.SENTENCE;
                case 4:
                    return WordBugType.VIDEO;
                case 5:
                    return WordBugType.SYNONYM;
                case 6:
                    return WordBugType.ANTONYM;
                case 7:
                    return WordBugType.SHORT_PHRASE;
                case 8:
                    return WordBugType.ETYMA;
                case 9:
                    return WordBugType.DEFORMATION;
                case 10:
                    return WordBugType.EN_MEAN;
                case 11:
                    return WordBugType.SIMILAR;
                default:
                    return null;
            }
        }

        public a() {
        }
    }

    private static final /* synthetic */ WordBugType[] $values() {
        return new WordBugType[]{BASIC, VARIANT, SENTENCE, VIDEO, SYNONYM, ANTONYM, SHORT_PHRASE, ETYMA, DEFORMATION, EN_MEAN, SIMILAR};
    }

    static {
        WordBugType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
    }

    private WordBugType(String str, int i11, int i12) {
        this.value = i12;
    }

    @k
    public static m00.a<WordBugType> getEntries() {
        return $ENTRIES;
    }

    public static WordBugType valueOf(String str) {
        return (WordBugType) Enum.valueOf(WordBugType.class, str);
    }

    public static WordBugType[] values() {
        return (WordBugType[]) $VALUES.clone();
    }
}
