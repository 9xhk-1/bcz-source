package h20;

import e30.g2;
import g20.h1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import o10.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\ntypeSignatureMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeSignatureMapping.kt\norg/jetbrains/kotlin/load/kotlin/TypeSignatureMappingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n1#2:104\n1755#3,3:105\n*S KotlinDebug\n*F\n+ 1 typeSignatureMapping.kt\norg/jetbrains/kotlin/load/kotlin/TypeSignatureMappingKt\n*L\n55#1:105,3\n*E\n"})
/* loaded from: classes8.dex */
public final class j0 {
    @m80.k
    public static final <T> T a(@m80.k t<T> tVar, @m80.k T possiblyPrimitiveType, boolean z11) {
        kotlin.jvm.internal.g0.p(tVar, "<this>");
        kotlin.jvm.internal.g0.p(possiblyPrimitiveType, "possiblyPrimitiveType");
        return z11 ? tVar.c(possiblyPrimitiveType) : possiblyPrimitiveType;
    }

    @m80.l
    public static final <T> T b(@m80.k g2 g2Var, @m80.k i30.g type, @m80.k t<T> typeFactory, @m80.k i0 mode) {
        kotlin.jvm.internal.g0.p(g2Var, "<this>");
        kotlin.jvm.internal.g0.p(type, "type");
        kotlin.jvm.internal.g0.p(typeFactory, "typeFactory");
        kotlin.jvm.internal.g0.p(mode, "mode");
        i30.l A0 = g2Var.A0(type);
        if (!g2Var.w(A0)) {
            return null;
        }
        PrimitiveType O = g2Var.O(A0);
        if (O != null) {
            return (T) a(typeFactory, typeFactory.d(O), g2Var.t0(type) || h1.c(g2Var, type));
        }
        PrimitiveType y02 = g2Var.y0(A0);
        if (y02 != null) {
            return typeFactory.a('[' + JvmPrimitiveType.get(y02).getDesc());
        }
        if (g2Var.c0(A0)) {
            n20.d D = g2Var.D(A0);
            n20.b n11 = D != null ? o10.a.f75522a.n(D) : null;
            if (n11 != null) {
                if (!mode.a()) {
                    List<a.C0920a> i11 = o10.a.f75522a.i();
                    if (!(i11 instanceof Collection) || !i11.isEmpty()) {
                        Iterator<T> it = i11.iterator();
                        while (it.hasNext()) {
                            if (kotlin.jvm.internal.g0.g(((a.C0920a) it.next()).d(), n11)) {
                                return null;
                            }
                        }
                    }
                }
                String h11 = v20.d.h(n11);
                kotlin.jvm.internal.g0.o(h11, "internalNameByClassId(...)");
                return typeFactory.f(h11);
            }
        }
        return null;
    }
}
