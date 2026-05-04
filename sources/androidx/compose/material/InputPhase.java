package androidx.compose.material;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class InputPhase {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ InputPhase[] $VALUES;
    public static final InputPhase Focused = new InputPhase("Focused", 0);
    public static final InputPhase UnfocusedEmpty = new InputPhase("UnfocusedEmpty", 1);
    public static final InputPhase UnfocusedNotEmpty = new InputPhase("UnfocusedNotEmpty", 2);

    private static final /* synthetic */ InputPhase[] $values() {
        return new InputPhase[]{Focused, UnfocusedEmpty, UnfocusedNotEmpty};
    }

    static {
        InputPhase[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private InputPhase(String str, int i11) {
    }

    @k
    public static a<InputPhase> getEntries() {
        return $ENTRIES;
    }

    public static InputPhase valueOf(String str) {
        return (InputPhase) Enum.valueOf(InputPhase.class, str);
    }

    public static InputPhase[] values() {
        return (InputPhase[]) $VALUES.clone();
    }
}
