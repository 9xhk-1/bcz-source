package androidx.compose.foundation.text;

import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class Handle {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ Handle[] $VALUES;
    public static final Handle Cursor = new Handle("Cursor", 0);
    public static final Handle SelectionStart = new Handle("SelectionStart", 1);
    public static final Handle SelectionEnd = new Handle("SelectionEnd", 2);

    private static final /* synthetic */ Handle[] $values() {
        return new Handle[]{Cursor, SelectionStart, SelectionEnd};
    }

    static {
        Handle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private Handle(String str, int i11) {
    }

    @k
    public static m00.a<Handle> getEntries() {
        return $ENTRIES;
    }

    public static Handle valueOf(String str) {
        return (Handle) Enum.valueOf(Handle.class, str);
    }

    public static Handle[] values() {
        return (Handle[]) $VALUES.clone();
    }
}
