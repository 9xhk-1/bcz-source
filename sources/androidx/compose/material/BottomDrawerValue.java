package androidx.compose.material;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class BottomDrawerValue {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BottomDrawerValue[] $VALUES;
    public static final BottomDrawerValue Closed = new BottomDrawerValue("Closed", 0);
    public static final BottomDrawerValue Open = new BottomDrawerValue("Open", 1);
    public static final BottomDrawerValue Expanded = new BottomDrawerValue("Expanded", 2);

    private static final /* synthetic */ BottomDrawerValue[] $values() {
        return new BottomDrawerValue[]{Closed, Open, Expanded};
    }

    static {
        BottomDrawerValue[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private BottomDrawerValue(String str, int i11) {
    }

    @k
    public static a<BottomDrawerValue> getEntries() {
        return $ENTRIES;
    }

    public static BottomDrawerValue valueOf(String str) {
        return (BottomDrawerValue) Enum.valueOf(BottomDrawerValue.class, str);
    }

    public static BottomDrawerValue[] values() {
        return (BottomDrawerValue[]) $VALUES.clone();
    }
}
