package com.baicizhan.main.home.experiment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class SheetType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ SheetType[] $VALUES;
    public static final SheetType UNKNOWN = new SheetType("UNKNOWN", 0);
    public static final SheetType WINNING_SPACE = new SheetType("WINNING_SPACE", 1);
    public static final SheetType TOOLS = new SheetType("TOOLS", 2);

    private static final /* synthetic */ SheetType[] $values() {
        return new SheetType[]{UNKNOWN, WINNING_SPACE, TOOLS};
    }

    static {
        SheetType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private SheetType(String str, int i11) {
    }

    @m80.k
    public static m00.a<SheetType> getEntries() {
        return $ENTRIES;
    }

    public static SheetType valueOf(String str) {
        return (SheetType) Enum.valueOf(SheetType.class, str);
    }

    public static SheetType[] values() {
        return (SheetType[]) $VALUES.clone();
    }
}
