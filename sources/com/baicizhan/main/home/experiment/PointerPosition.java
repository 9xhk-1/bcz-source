package com.baicizhan.main.home.experiment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class PointerPosition {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ PointerPosition[] $VALUES;
    public static final PointerPosition TOP_LEFT = new PointerPosition("TOP_LEFT", 0);
    public static final PointerPosition TOP_RIGHT = new PointerPosition("TOP_RIGHT", 1);
    public static final PointerPosition BOTTOM_RIGHT = new PointerPosition("BOTTOM_RIGHT", 2);
    public static final PointerPosition BOTTOM_LEFT = new PointerPosition("BOTTOM_LEFT", 3);

    private static final /* synthetic */ PointerPosition[] $values() {
        return new PointerPosition[]{TOP_LEFT, TOP_RIGHT, BOTTOM_RIGHT, BOTTOM_LEFT};
    }

    static {
        PointerPosition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private PointerPosition(String str, int i11) {
    }

    @m80.k
    public static m00.a<PointerPosition> getEntries() {
        return $ENTRIES;
    }

    public static PointerPosition valueOf(String str) {
        return (PointerPosition) Enum.valueOf(PointerPosition.class, str);
    }

    public static PointerPosition[] values() {
        return (PointerPosition[]) $VALUES.clone();
    }
}
