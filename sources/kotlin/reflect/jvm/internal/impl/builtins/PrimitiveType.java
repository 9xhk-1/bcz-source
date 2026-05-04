package kotlin.reflect.jvm.internal.impl.builtins;

import a00.w1;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m00.c;
import m80.k;
import n10.l;
import n10.o;
import n20.f;
import w00.g;
import yz.c0;
import yz.e0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class PrimitiveType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ PrimitiveType[] $VALUES;
    public static final PrimitiveType BOOLEAN = new PrimitiveType("BOOLEAN", 0, "Boolean");
    public static final PrimitiveType BYTE;
    public static final PrimitiveType CHAR;

    @k
    public static final a Companion;
    public static final PrimitiveType DOUBLE;
    public static final PrimitiveType FLOAT;
    public static final PrimitiveType INT;
    public static final PrimitiveType LONG;

    @g
    @k
    public static final Set<PrimitiveType> NUMBER_TYPES;
    public static final PrimitiveType SHORT;

    @k
    private final c0 arrayTypeFqName$delegate;

    @k
    private final f arrayTypeName;

    @k
    private final c0 typeFqName$delegate;

    @k
    private final f typeName;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    private static final /* synthetic */ PrimitiveType[] $values() {
        return new PrimitiveType[]{BOOLEAN, CHAR, BYTE, SHORT, INT, FLOAT, LONG, DOUBLE};
    }

    static {
        PrimitiveType primitiveType = new PrimitiveType("CHAR", 1, "Char");
        CHAR = primitiveType;
        PrimitiveType primitiveType2 = new PrimitiveType("BYTE", 2, "Byte");
        BYTE = primitiveType2;
        PrimitiveType primitiveType3 = new PrimitiveType("SHORT", 3, "Short");
        SHORT = primitiveType3;
        PrimitiveType primitiveType4 = new PrimitiveType("INT", 4, "Int");
        INT = primitiveType4;
        PrimitiveType primitiveType5 = new PrimitiveType("FLOAT", 5, "Float");
        FLOAT = primitiveType5;
        PrimitiveType primitiveType6 = new PrimitiveType("LONG", 6, "Long");
        LONG = primitiveType6;
        PrimitiveType primitiveType7 = new PrimitiveType("DOUBLE", 7, "Double");
        DOUBLE = primitiveType7;
        PrimitiveType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
        NUMBER_TYPES = w1.u(primitiveType, primitiveType2, primitiveType3, primitiveType4, primitiveType5, primitiveType6, primitiveType7);
    }

    private PrimitiveType(String str, int i11, String str2) {
        f f11 = f.f(str2);
        g0.o(f11, "identifier(...)");
        this.typeName = f11;
        f f12 = f.f(str2 + "Array");
        g0.o(f12, "identifier(...)");
        this.arrayTypeName = f12;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.typeFqName$delegate = e0.b(lazyThreadSafetyMode, new n10.k(this));
        this.arrayTypeFqName$delegate = e0.b(lazyThreadSafetyMode, new l(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n20.c arrayTypeFqName_delegate$lambda$1(PrimitiveType primitiveType) {
        n20.c c11 = o.A.c(primitiveType.arrayTypeName);
        g0.o(c11, "child(...)");
        return c11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n20.c typeFqName_delegate$lambda$0(PrimitiveType primitiveType) {
        n20.c c11 = o.A.c(primitiveType.typeName);
        g0.o(c11, "child(...)");
        return c11;
    }

    public static PrimitiveType valueOf(String str) {
        return (PrimitiveType) Enum.valueOf(PrimitiveType.class, str);
    }

    public static PrimitiveType[] values() {
        return (PrimitiveType[]) $VALUES.clone();
    }

    @k
    public final n20.c getArrayTypeFqName() {
        return (n20.c) this.arrayTypeFqName$delegate.getValue();
    }

    @k
    public final f getArrayTypeName() {
        return this.arrayTypeName;
    }

    @k
    public final n20.c getTypeFqName() {
        return (n20.c) this.typeFqName$delegate.getValue();
    }

    @k
    public final f getTypeName() {
        return this.typeName;
    }
}
