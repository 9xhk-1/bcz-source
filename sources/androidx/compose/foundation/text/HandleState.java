package androidx.compose.foundation.text;

import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class HandleState {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ HandleState[] $VALUES;
    public static final HandleState None = new HandleState("None", 0);
    public static final HandleState Selection = new HandleState("Selection", 1);
    public static final HandleState Cursor = new HandleState("Cursor", 2);

    private static final /* synthetic */ HandleState[] $values() {
        return new HandleState[]{None, Selection, Cursor};
    }

    static {
        HandleState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private HandleState(String str, int i11) {
    }

    @k
    public static m00.a<HandleState> getEntries() {
        return $ENTRIES;
    }

    public static HandleState valueOf(String str) {
        return (HandleState) Enum.valueOf(HandleState.class, str);
    }

    public static HandleState[] values() {
        return (HandleState[]) $VALUES.clone();
    }
}
