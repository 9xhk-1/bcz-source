package s20;

import e30.c1;
import e30.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConstantValueFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstantValueFactory.kt\norg/jetbrains/kotlin/resolve/constants/ConstantValueFactory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1611#2,9:104\n1863#2:113\n1864#2:115\n1620#2:116\n1#3:114\n*S KotlinDebug\n*F\n+ 1 ConstantValueFactory.kt\norg/jetbrains/kotlin/resolve/constants/ConstantValueFactory\n*L\n64#1:104,9\n64#1:113\n64#1:115\n64#1:116\n64#1:114\n*E\n"})
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final i f87444a = new i();

    public static final r0 d(PrimitiveType primitiveType, p10.a0 it) {
        g0.p(it, "it");
        c1 O = it.q().O(primitiveType);
        g0.o(O, "getPrimitiveArrayKotlinType(...)");
        return O;
    }

    public static /* synthetic */ g f(i iVar, Object obj, p10.a0 a0Var, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            a0Var = null;
        }
        return iVar.e(obj, a0Var);
    }

    @m80.k
    public final b b(@m80.k List<? extends g<?>> value, @m80.k r0 type) {
        g0.p(value, "value");
        g0.p(type, "type");
        return new a0(value, type);
    }

    public final b c(List<?> list, p10.a0 a0Var, PrimitiveType primitiveType) {
        List a62 = a00.r0.a6(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = a62.iterator();
        while (it.hasNext()) {
            g f11 = f(this, it.next(), null, 2, null);
            if (f11 != null) {
                arrayList.add(f11);
            }
        }
        if (a0Var == null) {
            return new b(arrayList, new h(primitiveType));
        }
        c1 O = a0Var.q().O(primitiveType);
        g0.o(O, "getPrimitiveArrayKotlinType(...)");
        return new a0(arrayList, O);
    }

    @m80.l
    public final g<?> e(@m80.l Object obj, @m80.l p10.a0 a0Var) {
        if (obj instanceof Byte) {
            return new d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new x(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new n(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new u(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new m(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new j(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new y((String) obj);
        }
        if (obj instanceof byte[]) {
            return c(a00.a0.Xy((byte[]) obj), a0Var, PrimitiveType.BYTE);
        }
        if (obj instanceof short[]) {
            return c(a00.a0.ez((short[]) obj), a0Var, PrimitiveType.SHORT);
        }
        if (obj instanceof int[]) {
            return c(a00.a0.bz((int[]) obj), a0Var, PrimitiveType.INT);
        }
        if (obj instanceof long[]) {
            return c(a00.a0.cz((long[]) obj), a0Var, PrimitiveType.LONG);
        }
        if (obj instanceof char[]) {
            return c(a00.a0.Yy((char[]) obj), a0Var, PrimitiveType.CHAR);
        }
        if (obj instanceof float[]) {
            return c(a00.a0.az((float[]) obj), a0Var, PrimitiveType.FLOAT);
        }
        if (obj instanceof double[]) {
            return c(a00.a0.Zy((double[]) obj), a0Var, PrimitiveType.DOUBLE);
        }
        if (obj instanceof boolean[]) {
            return c(a00.a0.fz((boolean[]) obj), a0Var, PrimitiveType.BOOLEAN);
        }
        if (obj == null) {
            return new v();
        }
        return null;
    }
}
