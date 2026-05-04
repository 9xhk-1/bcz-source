package androidx.compose.material;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class DismissValue {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DismissValue[] $VALUES;
    public static final DismissValue Default = new DismissValue("Default", 0);
    public static final DismissValue DismissedToEnd = new DismissValue("DismissedToEnd", 1);
    public static final DismissValue DismissedToStart = new DismissValue("DismissedToStart", 2);

    private static final /* synthetic */ DismissValue[] $values() {
        return new DismissValue[]{Default, DismissedToEnd, DismissedToStart};
    }

    static {
        DismissValue[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private DismissValue(String str, int i11) {
    }

    @k
    public static a<DismissValue> getEntries() {
        return $ENTRIES;
    }

    public static DismissValue valueOf(String str) {
        return (DismissValue) Enum.valueOf(DismissValue.class, str);
    }

    public static DismissValue[] values() {
        return (DismissValue[]) $VALUES.clone();
    }
}
