package coil.size;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class Precision {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Precision[] $VALUES;
    public static final Precision EXACT = new Precision("EXACT", 0);
    public static final Precision INEXACT = new Precision("INEXACT", 1);
    public static final Precision AUTOMATIC = new Precision("AUTOMATIC", 2);

    private static final /* synthetic */ Precision[] $values() {
        return new Precision[]{EXACT, INEXACT, AUTOMATIC};
    }

    static {
        Precision[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private Precision(String str, int i11) {
    }

    @k
    public static a<Precision> getEntries() {
        return $ENTRIES;
    }

    public static Precision valueOf(String str) {
        return (Precision) Enum.valueOf(Precision.class, str);
    }

    public static Precision[] values() {
        return (Precision[]) $VALUES.clone();
    }
}
