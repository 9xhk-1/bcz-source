package j50;

import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nPrimitives.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Primitives.kt\nkotlinx/serialization/internal/PrimitivesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
/* loaded from: classes8.dex */
public final class u2 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final Map<h10.d<?>, f50.i<?>> f63477a = f2.k();

    @m80.k
    public static final h50.f a(@m80.k String serialName, @m80.k h50.e kind) {
        kotlin.jvm.internal.g0.p(serialName, "serialName");
        kotlin.jvm.internal.g0.p(kind, "kind");
        d(serialName);
        return new t2(serialName, kind);
    }

    @m80.l
    public static final <T> f50.i<T> b(@m80.k h10.d<T> dVar) {
        kotlin.jvm.internal.g0.p(dVar, "<this>");
        return (f50.i) f63477a.get(dVar);
    }

    public static final String c(String str) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char charAt = str.charAt(0);
        sb2.append((Object) (Character.isLowerCase(charAt) ? u30.c.N(charAt) : String.valueOf(charAt)));
        String substring = str.substring(1);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        sb2.append(substring);
        return sb2.toString();
    }

    public static final void d(@m80.k String serialName) {
        kotlin.jvm.internal.g0.p(serialName, "serialName");
        for (f50.i<?> iVar : f63477a.values()) {
            if (kotlin.jvm.internal.g0.g(serialName, iVar.a().k())) {
                throw new IllegalArgumentException(u30.y.v("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + serialName + " there already exists " + kotlin.jvm.internal.o0.d(iVar.getClass()).C() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}
