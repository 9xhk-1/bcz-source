package com.baicizhan.main.home.player;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class ExtraTrainingType implements d9 {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ ExtraTrainingType[] $VALUES;

    @m80.k
    private final String title;
    public static final ExtraTrainingType VIDEO = new ExtraTrainingType("VIDEO", 0, "单词视频");
    public static final ExtraTrainingType FM = new ExtraTrainingType("FM", 1, "单词电台");

    private static final /* synthetic */ ExtraTrainingType[] $values() {
        return new ExtraTrainingType[]{VIDEO, FM};
    }

    static {
        ExtraTrainingType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private ExtraTrainingType(String str, int i11, String str2) {
        this.title = str2;
    }

    @m80.k
    public static m00.a<ExtraTrainingType> getEntries() {
        return $ENTRIES;
    }

    public static ExtraTrainingType valueOf(String str) {
        return (ExtraTrainingType) Enum.valueOf(ExtraTrainingType.class, str);
    }

    public static ExtraTrainingType[] values() {
        return (ExtraTrainingType[]) $VALUES.clone();
    }

    @m80.k
    public final String getTitle() {
        return this.title;
    }
}
