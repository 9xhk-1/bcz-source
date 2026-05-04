package kotlin.reflect.jvm.internal.impl.resolve;

import a00.r0;
import e30.u1;
import f30.g;
import java.util.Collection;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import m80.k;
import m80.l;
import p10.b;
import p10.c1;
import p10.d;
import p10.h;
import p10.x;
import p10.x0;
import q20.c;
import q20.e;
import q20.f;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f67651a = new a();

    public static /* synthetic */ boolean f(a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, kotlin.reflect.jvm.internal.impl.descriptors.a aVar3, boolean z11, boolean z12, boolean z13, g gVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z12 = true;
        }
        boolean z14 = z12;
        if ((i11 & 16) != 0) {
            z13 = false;
        }
        return aVar.e(aVar2, aVar3, z11, z14, z13, gVar);
    }

    public static final boolean g(h hVar, h hVar2) {
        return false;
    }

    public static final boolean h(boolean z11, kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, u1 c12, u1 c22) {
        g0.p(c12, "c1");
        g0.p(c22, "c2");
        if (g0.g(c12, c22)) {
            return true;
        }
        d r11 = c12.r();
        d r12 = c22.r();
        if ((r11 instanceof c1) && (r12 instanceof c1)) {
            return f67651a.n((c1) r11, (c1) r12, z11, new f(aVar, aVar2));
        }
        return false;
    }

    public static final boolean i(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, h hVar, h hVar2) {
        return g0.g(hVar, aVar) && g0.g(hVar2, aVar2);
    }

    public static /* synthetic */ boolean l(a aVar, h hVar, h hVar2, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z12 = true;
        }
        return aVar.k(hVar, hVar2, z11, z12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean o(a aVar, c1 c1Var, c1 c1Var2, boolean z11, p pVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            pVar = c.f81462a;
        }
        return aVar.n(c1Var, c1Var2, z11, pVar);
    }

    public static final boolean p(h hVar, h hVar2) {
        return false;
    }

    public final boolean e(@k kotlin.reflect.jvm.internal.impl.descriptors.a a11, @k kotlin.reflect.jvm.internal.impl.descriptors.a b11, boolean z11, boolean z12, boolean z13, @k g kotlinTypeRefiner) {
        g0.p(a11, "a");
        g0.p(b11, "b");
        g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (g0.g(a11, b11)) {
            return true;
        }
        if (!g0.g(a11.getName(), b11.getName())) {
            return false;
        }
        if (z12 && (a11 instanceof x) && (b11 instanceof x) && ((x) a11).q0() != ((x) b11).q0()) {
            return false;
        }
        if ((g0.g(a11.b(), b11.b()) && (!z11 || !g0.g(r(a11), r(b11)))) || q20.h.E(a11) || q20.h.E(b11) || !q(a11, b11, q20.d.f81463a, z11)) {
            return false;
        }
        OverridingUtil i11 = OverridingUtil.i(kotlinTypeRefiner, new e(z11, a11, b11));
        g0.o(i11, "create(...)");
        OverridingUtil.OverrideCompatibilityInfo.Result c11 = i11.E(a11, b11, null, !z13).c();
        OverridingUtil.OverrideCompatibilityInfo.Result result = OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
        return c11 == result && i11.E(b11, a11, null, z13 ^ true).c() == result;
    }

    public final boolean j(b bVar, b bVar2) {
        return g0.g(bVar.o(), bVar2.o());
    }

    public final boolean k(@l h hVar, @l h hVar2, boolean z11, boolean z12) {
        return ((hVar instanceof b) && (hVar2 instanceof b)) ? j((b) hVar, (b) hVar2) : ((hVar instanceof c1) && (hVar2 instanceof c1)) ? o(this, (c1) hVar, (c1) hVar2, z11, null, 8, null) : ((hVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.a) && (hVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.a)) ? f(this, (kotlin.reflect.jvm.internal.impl.descriptors.a) hVar, (kotlin.reflect.jvm.internal.impl.descriptors.a) hVar2, z11, z12, false, g.a.f50432a, 16, null) : ((hVar instanceof p10.g0) && (hVar2 instanceof p10.g0)) ? g0.g(((p10.g0) hVar).d(), ((p10.g0) hVar2).d()) : g0.g(hVar, hVar2);
    }

    @w00.k
    public final boolean m(@k c1 a11, @k c1 b11, boolean z11) {
        g0.p(a11, "a");
        g0.p(b11, "b");
        return o(this, a11, b11, z11, null, 8, null);
    }

    @w00.k
    public final boolean n(@k c1 a11, @k c1 b11, boolean z11, @k p<? super h, ? super h, Boolean> equivalentCallables) {
        g0.p(a11, "a");
        g0.p(b11, "b");
        g0.p(equivalentCallables, "equivalentCallables");
        if (g0.g(a11, b11)) {
            return true;
        }
        return !g0.g(a11.b(), b11.b()) && q(a11, b11, equivalentCallables, z11) && a11.getIndex() == b11.getIndex();
    }

    public final boolean q(h hVar, h hVar2, p<? super h, ? super h, Boolean> pVar, boolean z11) {
        h b11 = hVar.b();
        h b12 = hVar2.b();
        return ((b11 instanceof CallableMemberDescriptor) || (b12 instanceof CallableMemberDescriptor)) ? pVar.invoke(b11, b12).booleanValue() : l(this, b11, b12, z11, false, 8, null);
    }

    public final x0 r(kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        while (aVar instanceof CallableMemberDescriptor) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) aVar;
            if (callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends CallableMemberDescriptor> e11 = callableMemberDescriptor.e();
            g0.o(e11, "getOverriddenDescriptors(...)");
            aVar = (CallableMemberDescriptor) r0.n5(e11);
            if (aVar == null) {
                return null;
            }
        }
        return aVar.getSource();
    }
}
