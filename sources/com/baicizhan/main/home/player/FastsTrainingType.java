package com.baicizhan.main.home.player;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class FastsTrainingType implements d9 {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ FastsTrainingType[] $VALUES;

    @m80.k
    private final String title;
    public static final FastsTrainingType SELF_TEST = new FastsTrainingType("SELF_TEST", 0, "单词自检");
    public static final FastsTrainingType LISTENING = new FastsTrainingType("LISTENING", 1, "单词速听");

    private static final /* synthetic */ FastsTrainingType[] $values() {
        return new FastsTrainingType[]{SELF_TEST, LISTENING};
    }

    static {
        FastsTrainingType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private FastsTrainingType(String str, int i11, String str2) {
        this.title = str2;
    }

    @m80.k
    public static m00.a<FastsTrainingType> getEntries() {
        return $ENTRIES;
    }

    public static FastsTrainingType valueOf(String str) {
        return (FastsTrainingType) Enum.valueOf(FastsTrainingType.class, str);
    }

    public static FastsTrainingType[] values() {
        return (FastsTrainingType[]) $VALUES.clone();
    }

    @m80.k
    public final String getTitle() {
        return this.title;
    }
}
