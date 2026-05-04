package kotlin.reflect.jvm.internal.impl.types.model;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class TypeVariance {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TypeVariance[] $VALUES;

    @k
    private final String presentation;
    public static final TypeVariance IN = new TypeVariance("IN", 0, "in");
    public static final TypeVariance OUT = new TypeVariance("OUT", 1, "out");
    public static final TypeVariance INV = new TypeVariance("INV", 2, "");

    private static final /* synthetic */ TypeVariance[] $values() {
        return new TypeVariance[]{IN, OUT, INV};
    }

    static {
        TypeVariance[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private TypeVariance(String str, int i11, String str2) {
        this.presentation = str2;
    }

    public static TypeVariance valueOf(String str) {
        return (TypeVariance) Enum.valueOf(TypeVariance.class, str);
    }

    public static TypeVariance[] values() {
        return (TypeVariance[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    @k
    public String toString() {
        return this.presentation;
    }
}
