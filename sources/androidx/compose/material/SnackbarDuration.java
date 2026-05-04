package androidx.compose.material;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class SnackbarDuration {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SnackbarDuration[] $VALUES;
    public static final SnackbarDuration Short = new SnackbarDuration("Short", 0);
    public static final SnackbarDuration Long = new SnackbarDuration("Long", 1);
    public static final SnackbarDuration Indefinite = new SnackbarDuration("Indefinite", 2);

    private static final /* synthetic */ SnackbarDuration[] $values() {
        return new SnackbarDuration[]{Short, Long, Indefinite};
    }

    static {
        SnackbarDuration[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private SnackbarDuration(String str, int i11) {
    }

    @k
    public static a<SnackbarDuration> getEntries() {
        return $ENTRIES;
    }

    public static SnackbarDuration valueOf(String str) {
        return (SnackbarDuration) Enum.valueOf(SnackbarDuration.class, str);
    }

    public static SnackbarDuration[] values() {
        return (SnackbarDuration[]) $VALUES.clone();
    }
}
