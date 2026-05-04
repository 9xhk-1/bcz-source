package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.g0;
import m00.a;
import m00.c;
import m80.k;
import n20.b;
import n20.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class UnsignedType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UnsignedType[] $VALUES;
    public static final UnsignedType UBYTE;
    public static final UnsignedType UINT;
    public static final UnsignedType ULONG;
    public static final UnsignedType USHORT;

    @k
    private final b arrayClassId;

    @k
    private final b classId;

    @k
    private final f typeName;

    private static final /* synthetic */ UnsignedType[] $values() {
        return new UnsignedType[]{UBYTE, USHORT, UINT, ULONG};
    }

    static {
        b.a aVar = b.f74280d;
        UBYTE = new UnsignedType("UBYTE", 0, b.a.b(aVar, "kotlin/UByte", false, 2, null));
        USHORT = new UnsignedType("USHORT", 1, b.a.b(aVar, "kotlin/UShort", false, 2, null));
        UINT = new UnsignedType("UINT", 2, b.a.b(aVar, "kotlin/UInt", false, 2, null));
        ULONG = new UnsignedType("ULONG", 3, b.a.b(aVar, "kotlin/ULong", false, 2, null));
        UnsignedType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private UnsignedType(String str, int i11, b bVar) {
        this.classId = bVar;
        f h11 = bVar.h();
        this.typeName = h11;
        n20.c f11 = bVar.f();
        f f12 = f.f(h11.b() + "Array");
        g0.o(f12, "identifier(...)");
        this.arrayClassId = new b(f11, f12);
    }

    public static UnsignedType valueOf(String str) {
        return (UnsignedType) Enum.valueOf(UnsignedType.class, str);
    }

    public static UnsignedType[] values() {
        return (UnsignedType[]) $VALUES.clone();
    }

    @k
    public final b getArrayClassId() {
        return this.arrayClassId;
    }

    @k
    public final b getClassId() {
        return this.classId;
    }

    @k
    public final f getTypeName() {
        return this.typeName;
    }
}
