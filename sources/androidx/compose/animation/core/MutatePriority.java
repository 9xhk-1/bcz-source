package androidx.compose.animation.core;

import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class MutatePriority {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ MutatePriority[] $VALUES;
    public static final MutatePriority Default = new MutatePriority("Default", 0);
    public static final MutatePriority UserInput = new MutatePriority("UserInput", 1);
    public static final MutatePriority PreventUserInput = new MutatePriority("PreventUserInput", 2);

    private static final /* synthetic */ MutatePriority[] $values() {
        return new MutatePriority[]{Default, UserInput, PreventUserInput};
    }

    static {
        MutatePriority[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private MutatePriority(String str, int i11) {
    }

    @k
    public static m00.a<MutatePriority> getEntries() {
        return $ENTRIES;
    }

    public static MutatePriority valueOf(String str) {
        return (MutatePriority) Enum.valueOf(MutatePriority.class, str);
    }

    public static MutatePriority[] values() {
        return (MutatePriority[]) $VALUES.clone();
    }
}
