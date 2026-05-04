package com.baicizhan.main.home.plan.newexam;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class LearnButtonType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ LearnButtonType[] $VALUES;
    public static final LearnButtonType Primary = new LearnButtonType("Primary", 0);
    public static final LearnButtonType Secondary = new LearnButtonType("Secondary", 1);

    private static final /* synthetic */ LearnButtonType[] $values() {
        return new LearnButtonType[]{Primary, Secondary};
    }

    static {
        LearnButtonType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private LearnButtonType(String str, int i11) {
    }

    @m80.k
    public static m00.a<LearnButtonType> getEntries() {
        return $ENTRIES;
    }

    public static LearnButtonType valueOf(String str) {
        return (LearnButtonType) Enum.valueOf(LearnButtonType.class, str);
    }

    public static LearnButtonType[] values() {
        return (LearnButtonType[]) $VALUES.clone();
    }
}
