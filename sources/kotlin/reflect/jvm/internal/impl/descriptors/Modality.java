package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.v;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class Modality {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ Modality[] $VALUES;

    @k
    public static final a Companion;
    public static final Modality FINAL = new Modality("FINAL", 0);
    public static final Modality SEALED = new Modality("SEALED", 1);
    public static final Modality OPEN = new Modality("OPEN", 2);
    public static final Modality ABSTRACT = new Modality("ABSTRACT", 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final Modality a(boolean z11, boolean z12, boolean z13) {
            return z11 ? Modality.SEALED : z12 ? Modality.ABSTRACT : z13 ? Modality.OPEN : Modality.FINAL;
        }

        public a() {
        }
    }

    private static final /* synthetic */ Modality[] $values() {
        return new Modality[]{FINAL, SEALED, OPEN, ABSTRACT};
    }

    static {
        Modality[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
        Companion = new a(null);
    }

    private Modality(String str, int i11) {
    }

    public static Modality valueOf(String str) {
        return (Modality) Enum.valueOf(Modality.class, str);
    }

    public static Modality[] values() {
        return (Modality[]) $VALUES.clone();
    }
}
