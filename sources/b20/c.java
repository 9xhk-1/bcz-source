package b20;

import f20.z;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.g0;
import y10.a0;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {
    @m80.k
    public static final k c(@m80.k k kVar, @m80.k p typeParameterResolver) {
        g0.p(kVar, "<this>");
        g0.p(typeParameterResolver, "typeParameterResolver");
        return new k(kVar.a(), typeParameterResolver, kVar.c());
    }

    public static final k d(k kVar, p10.h hVar, z zVar, int i11, c0<a0> c0Var) {
        return new k(kVar.a(), zVar != null ? new m(kVar, hVar, zVar, i11) : kVar.f(), c0Var);
    }

    @m80.k
    public static final k e(@m80.k k kVar, @m80.k p10.c containingDeclaration, @m80.l z zVar, int i11) {
        g0.p(kVar, "<this>");
        g0.p(containingDeclaration, "containingDeclaration");
        return d(kVar, containingDeclaration, zVar, i11, e0.b(LazyThreadSafetyMode.NONE, new a(kVar, containingDeclaration)));
    }

    public static /* synthetic */ k f(k kVar, p10.c cVar, z zVar, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            zVar = null;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return e(kVar, cVar, zVar, i11);
    }

    public static final a0 g(k kVar, p10.c cVar) {
        return j(kVar, cVar.getAnnotations());
    }

    @m80.k
    public static final k h(@m80.k k kVar, @m80.k p10.h containingDeclaration, @m80.k z typeParameterOwner, int i11) {
        g0.p(kVar, "<this>");
        g0.p(containingDeclaration, "containingDeclaration");
        g0.p(typeParameterOwner, "typeParameterOwner");
        return d(kVar, containingDeclaration, typeParameterOwner, i11, kVar.c());
    }

    public static /* synthetic */ k i(k kVar, p10.h hVar, z zVar, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return h(kVar, hVar, zVar, i11);
    }

    @m80.l
    public static final a0 j(@m80.k k kVar, @m80.k q10.g additionalAnnotations) {
        g0.p(kVar, "<this>");
        g0.p(additionalAnnotations, "additionalAnnotations");
        return kVar.a().a().d(kVar.b(), additionalAnnotations);
    }

    @m80.k
    public static final k k(@m80.k k kVar, @m80.k q10.g additionalAnnotations) {
        g0.p(kVar, "<this>");
        g0.p(additionalAnnotations, "additionalAnnotations");
        return additionalAnnotations.isEmpty() ? kVar : new k(kVar.a(), kVar.f(), e0.b(LazyThreadSafetyMode.NONE, new b(kVar, additionalAnnotations)));
    }

    public static final a0 l(k kVar, q10.g gVar) {
        return j(kVar, gVar);
    }

    @m80.k
    public static final k m(@m80.k k kVar, @m80.k d components) {
        g0.p(kVar, "<this>");
        g0.p(components, "components");
        return new k(components, kVar.f(), kVar.c());
    }
}
