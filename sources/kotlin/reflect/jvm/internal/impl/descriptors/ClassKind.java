package kotlin.reflect.jvm.internal.impl.descriptors;

import m80.l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class ClassKind {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ ClassKind[] $VALUES;

    @l
    private final String codeRepresentation;
    public static final ClassKind CLASS = new ClassKind("CLASS", 0, "class");
    public static final ClassKind INTERFACE = new ClassKind("INTERFACE", 1, "interface");
    public static final ClassKind ENUM_CLASS = new ClassKind("ENUM_CLASS", 2, "enum class");
    public static final ClassKind ENUM_ENTRY = new ClassKind("ENUM_ENTRY", 3, null);
    public static final ClassKind ANNOTATION_CLASS = new ClassKind("ANNOTATION_CLASS", 4, "annotation class");
    public static final ClassKind OBJECT = new ClassKind("OBJECT", 5, "object");

    private static final /* synthetic */ ClassKind[] $values() {
        return new ClassKind[]{CLASS, INTERFACE, ENUM_CLASS, ENUM_ENTRY, ANNOTATION_CLASS, OBJECT};
    }

    static {
        ClassKind[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private ClassKind(String str, int i11, String str2) {
        this.codeRepresentation = str2;
    }

    public static ClassKind valueOf(String str) {
        return (ClassKind) Enum.valueOf(ClassKind.class, str);
    }

    public static ClassKind[] values() {
        return (ClassKind[]) $VALUES.clone();
    }

    public final boolean isSingleton() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
