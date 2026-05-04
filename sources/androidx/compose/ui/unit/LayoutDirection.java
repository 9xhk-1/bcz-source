package androidx.compose.ui.unit;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class LayoutDirection {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LayoutDirection[] $VALUES;
    public static final LayoutDirection Ltr = new LayoutDirection("Ltr", 0);
    public static final LayoutDirection Rtl = new LayoutDirection("Rtl", 1);

    private static final /* synthetic */ LayoutDirection[] $values() {
        return new LayoutDirection[]{Ltr, Rtl};
    }

    static {
        LayoutDirection[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private LayoutDirection(String str, int i11) {
    }

    @k
    public static a<LayoutDirection> getEntries() {
        return $ENTRIES;
    }

    public static LayoutDirection valueOf(String str) {
        return (LayoutDirection) Enum.valueOf(LayoutDirection.class, str);
    }

    public static LayoutDirection[] values() {
        return (LayoutDirection[]) $VALUES.clone();
    }
}
