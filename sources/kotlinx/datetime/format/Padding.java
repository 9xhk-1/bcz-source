package kotlinx.datetime.format;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class Padding {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Padding[] $VALUES;
    public static final Padding NONE = new Padding("NONE", 0);
    public static final Padding ZERO = new Padding("ZERO", 1);
    public static final Padding SPACE = new Padding("SPACE", 2);

    private static final /* synthetic */ Padding[] $values() {
        return new Padding[]{NONE, ZERO, SPACE};
    }

    static {
        Padding[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private Padding(String str, int i11) {
    }

    @k
    public static a<Padding> getEntries() {
        return $ENTRIES;
    }

    public static Padding valueOf(String str) {
        return (Padding) Enum.valueOf(Padding.class, str);
    }

    public static Padding[] values() {
        return (Padding[]) $VALUES.clone();
    }
}
