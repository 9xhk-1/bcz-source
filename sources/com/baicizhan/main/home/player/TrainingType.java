package com.baicizhan.main.home.player;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class TrainingType implements d9 {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ TrainingType[] $VALUES;

    @m80.k
    private final String title;
    private final int type;
    public static final TrainingType WORD_2_MEANING = new TrainingType("WORD_2_MEANING", 0, "单词选义", 3);
    public static final TrainingType MEANING_2_WORD = new TrainingType("MEANING_2_WORD", 1, "中文选词", 24);
    public static final TrainingType WORD_SPELLING = new TrainingType("WORD_SPELLING", 2, "单词拼写", 4);
    public static final TrainingType LISTENING_2_MEANING = new TrainingType("LISTENING_2_MEANING", 3, "听音选义", 23);
    public static final TrainingType COMBINATION = new TrainingType("COMBINATION", 4, "组合拼写", 22);
    public static final TrainingType SPELLING_OF_FILLING = new TrainingType("SPELLING_OF_FILLING", 5, "填空拼写", 21);
    public static final TrainingType FILLING_BY_READING = new TrainingType("FILLING_BY_READING", 6, "读词填空", 5);
    public static final TrainingType NONE = new TrainingType("NONE", 7, "", -1);

    private static final /* synthetic */ TrainingType[] $values() {
        return new TrainingType[]{WORD_2_MEANING, MEANING_2_WORD, WORD_SPELLING, LISTENING_2_MEANING, COMBINATION, SPELLING_OF_FILLING, FILLING_BY_READING, NONE};
    }

    static {
        TrainingType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private TrainingType(String str, int i11, String str2, int i12) {
        this.title = str2;
        this.type = i12;
    }

    @m80.k
    public static m00.a<TrainingType> getEntries() {
        return $ENTRIES;
    }

    public static TrainingType valueOf(String str) {
        return (TrainingType) Enum.valueOf(TrainingType.class, str);
    }

    public static TrainingType[] values() {
        return (TrainingType[]) $VALUES.clone();
    }

    @m80.k
    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }
}
