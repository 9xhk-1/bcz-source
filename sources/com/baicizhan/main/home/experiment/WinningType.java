package com.baicizhan.main.home.experiment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class WinningType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ WinningType[] $VALUES;
    public static final WinningType Done = new WinningType("Done", 0);
    public static final WinningType Hinting = new WinningType("Hinting", 1);
    public static final WinningType Default = new WinningType("Default", 2);

    private static final /* synthetic */ WinningType[] $values() {
        return new WinningType[]{Done, Hinting, Default};
    }

    static {
        WinningType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private WinningType(String str, int i11) {
    }

    @m80.k
    public static m00.a<WinningType> getEntries() {
        return $ENTRIES;
    }

    public static WinningType valueOf(String str) {
        return (WinningType) Enum.valueOf(WinningType.class, str);
    }

    public static WinningType[] values() {
        return (WinningType[]) $VALUES.clone();
    }
}
