package l50;

import h50.m;
import h50.n;
import kotlinx.serialization.json.internal.WriteMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nWriteMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n1#1,53:1\n36#1,9:54\n*S KotlinDebug\n*F\n+ 1 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n26#1:54,9\n*E\n"})
/* loaded from: classes8.dex */
public final class v1 {
    @m80.k
    public static final h50.f a(@m80.k h50.f fVar, @m80.k o50.f module) {
        h50.f a11;
        kotlin.jvm.internal.g0.p(fVar, "<this>");
        kotlin.jvm.internal.g0.p(module, "module");
        if (!kotlin.jvm.internal.g0.g(fVar.getKind(), m.a.f58539a)) {
            return fVar.isInline() ? a(fVar.e(0), module) : fVar;
        }
        h50.f c11 = h50.b.c(module, fVar);
        return (c11 == null || (a11 = a(c11, module)) == null) ? fVar : a11;
    }

    public static final <T, R1 extends T, R2 extends T> T b(@m80.k k50.a aVar, @m80.k h50.f mapDescriptor, @m80.k x00.a<? extends R1> ifMap, @m80.k x00.a<? extends R2> ifList) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        kotlin.jvm.internal.g0.p(mapDescriptor, "mapDescriptor");
        kotlin.jvm.internal.g0.p(ifMap, "ifMap");
        kotlin.jvm.internal.g0.p(ifList, "ifList");
        h50.f a11 = a(mapDescriptor.e(0), aVar.getSerializersModule());
        h50.m kind = a11.getKind();
        if ((kind instanceof h50.e) || kotlin.jvm.internal.g0.g(kind, m.b.f58540a)) {
            return ifMap.invoke();
        }
        if (aVar.i().d()) {
            return ifList.invoke();
        }
        throw i0.d(a11);
    }

    @m80.k
    public static final WriteMode c(@m80.k k50.a aVar, @m80.k h50.f desc) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        kotlin.jvm.internal.g0.p(desc, "desc");
        h50.m kind = desc.getKind();
        if (kind instanceof h50.d) {
            return WriteMode.POLY_OBJ;
        }
        if (kotlin.jvm.internal.g0.g(kind, n.b.f58542a)) {
            return WriteMode.LIST;
        }
        if (!kotlin.jvm.internal.g0.g(kind, n.c.f58543a)) {
            return WriteMode.OBJ;
        }
        h50.f a11 = a(desc.e(0), aVar.getSerializersModule());
        h50.m kind2 = a11.getKind();
        if ((kind2 instanceof h50.e) || kotlin.jvm.internal.g0.g(kind2, m.b.f58540a)) {
            return WriteMode.MAP;
        }
        if (aVar.i().d()) {
            return WriteMode.LIST;
        }
        throw i0.d(a11);
    }
}
