package androidx.compose.material;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class DismissDirection {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DismissDirection[] $VALUES;
    public static final DismissDirection StartToEnd = new DismissDirection("StartToEnd", 0);
    public static final DismissDirection EndToStart = new DismissDirection("EndToStart", 1);

    private static final /* synthetic */ DismissDirection[] $values() {
        return new DismissDirection[]{StartToEnd, EndToStart};
    }

    static {
        DismissDirection[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private DismissDirection(String str, int i11) {
    }

    @k
    public static a<DismissDirection> getEntries() {
        return $ENTRIES;
    }

    public static DismissDirection valueOf(String str) {
        return (DismissDirection) Enum.valueOf(DismissDirection.class, str);
    }

    public static DismissDirection[] values() {
        return (DismissDirection[]) $VALUES.clone();
    }
}
