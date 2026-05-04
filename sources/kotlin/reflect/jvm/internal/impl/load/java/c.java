package kotlin.reflect.jvm.internal.impl.load.java;

import a00.r0;
import a20.e;
import h20.c0;
import h20.s;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import m80.k;
import m80.l;
import n10.j;
import n20.f;
import p10.h;
import p10.j1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c implements ExternalOverridabilityCondition {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f67274a = new a(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public final boolean a(@k kotlin.reflect.jvm.internal.impl.descriptors.a superDescriptor, @k kotlin.reflect.jvm.internal.impl.descriptors.a subDescriptor) {
            g0.p(superDescriptor, "superDescriptor");
            g0.p(subDescriptor, "subDescriptor");
            if ((subDescriptor instanceof e) && (superDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
                e eVar = (e) subDescriptor;
                eVar.g().size();
                kotlin.reflect.jvm.internal.impl.descriptors.e eVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.e) superDescriptor;
                eVar2.g().size();
                List<j1> g11 = eVar.a().g();
                g0.o(g11, "getValueParameters(...)");
                List<j1> g12 = eVar2.a().g();
                g0.o(g12, "getValueParameters(...)");
                for (Pair pair : r0.o6(g11, g12)) {
                    j1 j1Var = (j1) pair.component1();
                    j1 j1Var2 = (j1) pair.component2();
                    g0.m(j1Var);
                    boolean z11 = c((kotlin.reflect.jvm.internal.impl.descriptors.e) subDescriptor, j1Var) instanceof s.d;
                    g0.m(j1Var2);
                    if (z11 != (c(eVar2, j1Var2) instanceof s.d)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final boolean b(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            if (eVar.g().size() != 1) {
                return false;
            }
            h b11 = eVar.b();
            p10.b bVar = b11 instanceof p10.b ? (p10.b) b11 : null;
            if (bVar == null) {
                return false;
            }
            List<j1> g11 = eVar.g();
            g0.o(g11, "getValueParameters(...)");
            p10.d r11 = ((j1) r0.m5(g11)).getType().I0().r();
            p10.b bVar2 = r11 instanceof p10.b ? (p10.b) r11 : null;
            return bVar2 != null && j.r0(bVar) && g0.g(u20.e.o(bVar), u20.e.o(bVar2));
        }

        public final s c(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, j1 j1Var) {
            if (c0.e(eVar) || b(eVar)) {
                e30.r0 type = j1Var.getType();
                g0.o(type, "getType(...)");
                return c0.g(j30.e.C(type));
            }
            e30.r0 type2 = j1Var.getType();
            g0.o(type2, "getType(...)");
            return c0.g(type2);
        }

        public a() {
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @k
    public ExternalOverridabilityCondition.Result a(@k kotlin.reflect.jvm.internal.impl.descriptors.a superDescriptor, @k kotlin.reflect.jvm.internal.impl.descriptors.a subDescriptor, @l p10.b bVar) {
        g0.p(superDescriptor, "superDescriptor");
        g0.p(subDescriptor, "subDescriptor");
        return c(superDescriptor, subDescriptor, bVar) ? ExternalOverridabilityCondition.Result.INCOMPATIBLE : f67274a.a(superDescriptor, subDescriptor) ? ExternalOverridabilityCondition.Result.INCOMPATIBLE : ExternalOverridabilityCondition.Result.UNKNOWN;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @k
    public ExternalOverridabilityCondition.Contract b() {
        return ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY;
    }

    public final boolean c(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, p10.b bVar) {
        if ((aVar instanceof CallableMemberDescriptor) && (aVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && !j.g0(aVar2)) {
            b bVar2 = b.f67273o;
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar = (kotlin.reflect.jvm.internal.impl.descriptors.e) aVar2;
            f name = eVar.getName();
            g0.o(name, "getName(...)");
            if (!bVar2.n(name)) {
                SpecialGenericSignatures.a aVar3 = SpecialGenericSignatures.f67253a;
                f name2 = eVar.getName();
                g0.o(name2, "getName(...)");
                if (!aVar3.k(name2)) {
                    return false;
                }
            }
            CallableMemberDescriptor j11 = d.j((CallableMemberDescriptor) aVar);
            boolean z11 = aVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e;
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar2 = z11 ? (kotlin.reflect.jvm.internal.impl.descriptors.e) aVar : null;
            if (!(eVar2 != null && eVar.D0() == eVar2.D0()) && (j11 == null || !eVar.D0())) {
                return true;
            }
            if ((bVar instanceof a20.c) && eVar.w0() == null && j11 != null && !d.l(bVar, j11)) {
                if ((j11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && z11 && b.l((kotlin.reflect.jvm.internal.impl.descriptors.e) j11) != null) {
                    String c11 = c0.c(eVar, false, false, 2, null);
                    kotlin.reflect.jvm.internal.impl.descriptors.e a11 = ((kotlin.reflect.jvm.internal.impl.descriptors.e) aVar).a();
                    g0.o(a11, "getOriginal(...)");
                    if (g0.g(c11, c0.c(a11, false, false, 2, null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
