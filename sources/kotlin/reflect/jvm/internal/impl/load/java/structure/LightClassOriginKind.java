package kotlin.reflect.jvm.internal.impl.load.java.structure;

import m00.a;
import m00.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class LightClassOriginKind {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LightClassOriginKind[] $VALUES;
    public static final LightClassOriginKind SOURCE = new LightClassOriginKind("SOURCE", 0);
    public static final LightClassOriginKind BINARY = new LightClassOriginKind("BINARY", 1);

    private static final /* synthetic */ LightClassOriginKind[] $values() {
        return new LightClassOriginKind[]{SOURCE, BINARY};
    }

    static {
        LightClassOriginKind[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private LightClassOriginKind(String str, int i11) {
    }

    public static LightClassOriginKind valueOf(String str) {
        return (LightClassOriginKind) Enum.valueOf(LightClassOriginKind.class, str);
    }

    public static LightClassOriginKind[] values() {
        return (LightClassOriginKind[]) $VALUES.clone();
    }
}
