package kotlin.reflect.jvm.internal.impl.types;

import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class Variance {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ Variance[] $VALUES;
    public static final Variance INVARIANT = new Variance("INVARIANT", 0, "", true, true, 0);
    public static final Variance IN_VARIANCE = new Variance("IN_VARIANCE", 1, "in", true, false, -1);
    public static final Variance OUT_VARIANCE = new Variance("OUT_VARIANCE", 2, "out", false, true, 1);
    private final boolean allowsInPosition;
    private final boolean allowsOutPosition;

    @k
    private final String label;
    private final int superpositionFactor;

    private static final /* synthetic */ Variance[] $values() {
        return new Variance[]{INVARIANT, IN_VARIANCE, OUT_VARIANCE};
    }

    static {
        Variance[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private Variance(String str, int i11, String str2, boolean z11, boolean z12, int i12) {
        this.label = str2;
        this.allowsInPosition = z11;
        this.allowsOutPosition = z12;
        this.superpositionFactor = i12;
    }

    public static Variance valueOf(String str) {
        return (Variance) Enum.valueOf(Variance.class, str);
    }

    public static Variance[] values() {
        return (Variance[]) $VALUES.clone();
    }

    public final boolean getAllowsOutPosition() {
        return this.allowsOutPosition;
    }

    @k
    public final String getLabel() {
        return this.label;
    }

    @Override // java.lang.Enum
    @k
    public String toString() {
        return this.label;
    }
}
