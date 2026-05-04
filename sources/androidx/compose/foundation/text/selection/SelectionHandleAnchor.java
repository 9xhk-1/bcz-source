package androidx.compose.foundation.text.selection;

import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class SelectionHandleAnchor {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ SelectionHandleAnchor[] $VALUES;
    public static final SelectionHandleAnchor Left = new SelectionHandleAnchor("Left", 0);
    public static final SelectionHandleAnchor Middle = new SelectionHandleAnchor("Middle", 1);
    public static final SelectionHandleAnchor Right = new SelectionHandleAnchor("Right", 2);

    private static final /* synthetic */ SelectionHandleAnchor[] $values() {
        return new SelectionHandleAnchor[]{Left, Middle, Right};
    }

    static {
        SelectionHandleAnchor[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private SelectionHandleAnchor(String str, int i11) {
    }

    @k
    public static m00.a<SelectionHandleAnchor> getEntries() {
        return $ENTRIES;
    }

    public static SelectionHandleAnchor valueOf(String str) {
        return (SelectionHandleAnchor) Enum.valueOf(SelectionHandleAnchor.class, str);
    }

    public static SelectionHandleAnchor[] values() {
        return (SelectionHandleAnchor[]) $VALUES.clone();
    }
}
