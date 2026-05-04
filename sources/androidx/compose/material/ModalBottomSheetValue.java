package androidx.compose.material;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ModalBottomSheetValue {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ModalBottomSheetValue[] $VALUES;
    public static final ModalBottomSheetValue Hidden = new ModalBottomSheetValue("Hidden", 0);
    public static final ModalBottomSheetValue Expanded = new ModalBottomSheetValue("Expanded", 1);
    public static final ModalBottomSheetValue HalfExpanded = new ModalBottomSheetValue("HalfExpanded", 2);

    private static final /* synthetic */ ModalBottomSheetValue[] $values() {
        return new ModalBottomSheetValue[]{Hidden, Expanded, HalfExpanded};
    }

    static {
        ModalBottomSheetValue[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private ModalBottomSheetValue(String str, int i11) {
    }

    @k
    public static a<ModalBottomSheetValue> getEntries() {
        return $ENTRIES;
    }

    public static ModalBottomSheetValue valueOf(String str) {
        return (ModalBottomSheetValue) Enum.valueOf(ModalBottomSheetValue.class, str);
    }

    public static ModalBottomSheetValue[] values() {
        return (ModalBottomSheetValue[]) $VALUES.clone();
    }
}
