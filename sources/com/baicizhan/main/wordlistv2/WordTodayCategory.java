package com.baicizhan.main.wordlistv2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public final class WordTodayCategory {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ WordTodayCategory[] $VALUES;
    public static final WordTodayCategory LEARN = new WordTodayCategory("LEARN", 0);
    public static final WordTodayCategory REVIEW = new WordTodayCategory("REVIEW", 1);

    private static final /* synthetic */ WordTodayCategory[] $values() {
        return new WordTodayCategory[]{LEARN, REVIEW};
    }

    static {
        WordTodayCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private WordTodayCategory(String str, int i11) {
    }

    @m80.k
    public static m00.a<WordTodayCategory> getEntries() {
        return $ENTRIES;
    }

    public static WordTodayCategory valueOf(String str) {
        return (WordTodayCategory) Enum.valueOf(WordTodayCategory.class, str);
    }

    public static WordTodayCategory[] values() {
        return (WordTodayCategory[]) $VALUES.clone();
    }
}
