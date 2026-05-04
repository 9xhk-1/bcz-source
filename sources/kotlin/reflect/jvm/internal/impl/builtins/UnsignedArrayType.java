package kotlin.reflect.jvm.internal.impl.builtins;

import m00.a;
import m00.c;
import m80.k;
import n20.b;
import n20.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class UnsignedArrayType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UnsignedArrayType[] $VALUES;
    public static final UnsignedArrayType UBYTEARRAY;
    public static final UnsignedArrayType UINTARRAY;
    public static final UnsignedArrayType ULONGARRAY;
    public static final UnsignedArrayType USHORTARRAY;

    @k
    private final b classId;

    @k
    private final f typeName;

    private static final /* synthetic */ UnsignedArrayType[] $values() {
        return new UnsignedArrayType[]{UBYTEARRAY, USHORTARRAY, UINTARRAY, ULONGARRAY};
    }

    static {
        b.a aVar = b.f74280d;
        UBYTEARRAY = new UnsignedArrayType("UBYTEARRAY", 0, b.a.b(aVar, "kotlin/UByteArray", false, 2, null));
        USHORTARRAY = new UnsignedArrayType("USHORTARRAY", 1, b.a.b(aVar, "kotlin/UShortArray", false, 2, null));
        UINTARRAY = new UnsignedArrayType("UINTARRAY", 2, b.a.b(aVar, "kotlin/UIntArray", false, 2, null));
        ULONGARRAY = new UnsignedArrayType("ULONGARRAY", 3, b.a.b(aVar, "kotlin/ULongArray", false, 2, null));
        UnsignedArrayType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private UnsignedArrayType(String str, int i11, b bVar) {
        this.classId = bVar;
        this.typeName = bVar.h();
    }

    public static UnsignedArrayType valueOf(String str) {
        return (UnsignedArrayType) Enum.valueOf(UnsignedArrayType.class, str);
    }

    public static UnsignedArrayType[] values() {
        return (UnsignedArrayType[]) $VALUES.clone();
    }

    @k
    public final f getTypeName() {
        return this.typeName;
    }
}
