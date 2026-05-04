package androidx.compose.material;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class BottomSheetValue {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BottomSheetValue[] $VALUES;
    public static final BottomSheetValue Collapsed = new BottomSheetValue("Collapsed", 0);
    public static final BottomSheetValue Expanded = new BottomSheetValue("Expanded", 1);

    private static final /* synthetic */ BottomSheetValue[] $values() {
        return new BottomSheetValue[]{Collapsed, Expanded};
    }

    static {
        BottomSheetValue[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private BottomSheetValue(String str, int i11) {
    }

    @k
    public static a<BottomSheetValue> getEntries() {
        return $ENTRIES;
    }

    public static BottomSheetValue valueOf(String str) {
        return (BottomSheetValue) Enum.valueOf(BottomSheetValue.class, str);
    }

    public static BottomSheetValue[] values() {
        return (BottomSheetValue[]) $VALUES.clone();
    }
}
