package com.baicizhan.main.wikiv2.lookup;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class WikiType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ WikiType[] $VALUES;

    /* renamed from: id, reason: collision with root package name */
    private final int f25555id;
    public static final WikiType WORD_VARIATIONS = new WikiType("WORD_VARIATIONS", 0, 10);
    public static final WikiType SENTENCE_ILLUSTRATION = new WikiType("SENTENCE_ILLUSTRATION", 1, 20);
    public static final WikiType PARAPHRASES = new WikiType("PARAPHRASES", 2, 30);
    public static final WikiType WORD_VIDEO = new WikiType("WORD_VIDEO", 3, 40);
    public static final WikiType PHRASES = new WikiType("PHRASES", 4, 50);
    public static final WikiType WORD_SYNONYM = new WikiType("WORD_SYNONYM", 5, 60);
    public static final WikiType WORD_ANTONYM = new WikiType("WORD_ANTONYM", 6, 70);
    public static final WikiType WORD_SIMILAR = new WikiType("WORD_SIMILAR", 7, 80);
    public static final WikiType WORD_ETYMON = new WikiType("WORD_ETYMON", 8, 90);
    public static final WikiType PARAPHRASES_EN = new WikiType("PARAPHRASES_EN", 9, 100);
    public static final WikiType WORD_PICTOGRAM = new WikiType("WORD_PICTOGRAM", 10, 110);

    private static final /* synthetic */ WikiType[] $values() {
        return new WikiType[]{WORD_VARIATIONS, SENTENCE_ILLUSTRATION, PARAPHRASES, WORD_VIDEO, PHRASES, WORD_SYNONYM, WORD_ANTONYM, WORD_SIMILAR, WORD_ETYMON, PARAPHRASES_EN, WORD_PICTOGRAM};
    }

    static {
        WikiType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private WikiType(String str, int i11, int i12) {
        this.f25555id = i12;
    }

    @k
    public static a<WikiType> getEntries() {
        return $ENTRIES;
    }

    public static WikiType valueOf(String str) {
        return (WikiType) Enum.valueOf(WikiType.class, str);
    }

    public static WikiType[] values() {
        return (WikiType[]) $VALUES.clone();
    }

    public final int getId() {
        return this.f25555id;
    }
}
