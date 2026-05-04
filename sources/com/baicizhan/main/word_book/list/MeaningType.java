package com.baicizhan.main.word_book.list;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public final class MeaningType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ MeaningType[] $VALUES;
    private final int cate;

    @m80.k
    private final String label;
    public static final MeaningType GENERAL = new MeaningType("GENERAL", 0, 0, "通用");
    public static final MeaningType PRIMARY_SCHOOL = new MeaningType("PRIMARY_SCHOOL", 1, 1, "小学");
    public static final MeaningType MIDDLE_EXAM = new MeaningType("MIDDLE_EXAM", 2, 2, "中考");
    public static final MeaningType COLLEGE_ENTRANCE = new MeaningType("COLLEGE_ENTRANCE", 3, 3, "高考");
    public static final MeaningType CET4 = new MeaningType("CET4", 4, 4, "四级");
    public static final MeaningType CET6 = new MeaningType("CET6", 5, 5, "六级");
    public static final MeaningType GRADUATE = new MeaningType("GRADUATE", 6, 6, "考研");
    public static final MeaningType COLLEGE_UPGRADE = new MeaningType("COLLEGE_UPGRADE", 7, 7, "专升本");
    public static final MeaningType ABROAD = new MeaningType("ABROAD", 8, 8, "出国");

    private static final /* synthetic */ MeaningType[] $values() {
        return new MeaningType[]{GENERAL, PRIMARY_SCHOOL, MIDDLE_EXAM, COLLEGE_ENTRANCE, CET4, CET6, GRADUATE, COLLEGE_UPGRADE, ABROAD};
    }

    static {
        MeaningType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private MeaningType(String str, int i11, int i12, String str2) {
        this.cate = i12;
        this.label = str2;
    }

    @m80.k
    public static m00.a<MeaningType> getEntries() {
        return $ENTRIES;
    }

    public static MeaningType valueOf(String str) {
        return (MeaningType) Enum.valueOf(MeaningType.class, str);
    }

    public static MeaningType[] values() {
        return (MeaningType[]) $VALUES.clone();
    }

    public final int getCate() {
        return this.cate;
    }

    @m80.k
    public final String getLabel() {
        return this.label;
    }

    @m80.k
    public final String getSelectorLabel() {
        return "「" + this.label + "」释义";
    }
}
