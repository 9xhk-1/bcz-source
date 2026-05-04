package kotlin.reflect;

import m00.a;
import m00.c;
import m80.k;
import yz.y0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.1")
/* loaded from: classes8.dex */
public final class KVariance {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ KVariance[] $VALUES;
    public static final KVariance INVARIANT = new KVariance("INVARIANT", 0);
    public static final KVariance IN = new KVariance("IN", 1);
    public static final KVariance OUT = new KVariance("OUT", 2);

    private static final /* synthetic */ KVariance[] $values() {
        return new KVariance[]{INVARIANT, IN, OUT};
    }

    static {
        KVariance[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private KVariance(String str, int i11) {
    }

    @k
    public static a<KVariance> getEntries() {
        return $ENTRIES;
    }

    public static KVariance valueOf(String str) {
        return (KVariance) Enum.valueOf(KVariance.class, str);
    }

    public static KVariance[] values() {
        return (KVariance[]) $VALUES.clone();
    }
}
