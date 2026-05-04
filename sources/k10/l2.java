package k10;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.KParameter;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final l2 f64961a = new l2();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final p20.m f64962b = p20.m.f78747h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f64963a;

        static {
            int[] iArr = new int[KParameter.Kind.values().length];
            try {
                iArr[KParameter.Kind.EXTENSION_RECEIVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KParameter.Kind.INSTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KParameter.Kind.VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f64963a = iArr;
        }
    }

    public static final CharSequence g(p10.j1 j1Var) {
        l2 l2Var = f64961a;
        e30.r0 type = j1Var.getType();
        kotlin.jvm.internal.g0.o(type, "getType(...)");
        return l2Var.l(type);
    }

    public static final CharSequence i(p10.j1 j1Var) {
        l2 l2Var = f64961a;
        e30.r0 type = j1Var.getType();
        kotlin.jvm.internal.g0.o(type, "getType(...)");
        return l2Var.l(type);
    }

    public final void c(StringBuilder sb2, p10.t0 t0Var) {
        if (t0Var != null) {
            e30.r0 type = t0Var.getType();
            kotlin.jvm.internal.g0.o(type, "getType(...)");
            sb2.append(l(type));
            sb2.append(".");
        }
    }

    public final void d(StringBuilder sb2, kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        p10.t0 k11 = q2.k(aVar);
        p10.t0 f02 = aVar.f0();
        c(sb2, k11);
        boolean z11 = (k11 == null || f02 == null) ? false : true;
        if (z11) {
            sb2.append(pn.j.f81006c);
        }
        c(sb2, f02);
        if (z11) {
            sb2.append(pn.j.f81007d);
        }
    }

    public final String e(kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        if (aVar instanceof p10.q0) {
            return k((p10.q0) aVar);
        }
        if (aVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            return f((kotlin.reflect.jvm.internal.impl.descriptors.e) aVar);
        }
        throw new IllegalStateException(("Illegal callable: " + aVar).toString());
    }

    @m80.k
    public final String f(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.e descriptor) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fun ");
        l2 l2Var = f64961a;
        l2Var.d(sb2, descriptor);
        p20.m mVar = f64962b;
        n20.f name = descriptor.getName();
        kotlin.jvm.internal.g0.o(name, "getName(...)");
        sb2.append(mVar.V(name, true));
        List<p10.j1> g11 = descriptor.g();
        kotlin.jvm.internal.g0.o(g11, "getValueParameters(...)");
        a00.r0.p3(g11, sb2, org.junit.jupiter.api.j2.O, pn.j.f81006c, pn.j.f81007d, 0, null, j2.f64950a, 48, null);
        sb2.append(": ");
        e30.r0 returnType = descriptor.getReturnType();
        kotlin.jvm.internal.g0.m(returnType);
        sb2.append(l2Var.l(returnType));
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb3, "toString(...)");
        return sb3;
    }

    @m80.k
    public final String h(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.e invoke) {
        kotlin.jvm.internal.g0.p(invoke, "invoke");
        StringBuilder sb2 = new StringBuilder();
        l2 l2Var = f64961a;
        l2Var.d(sb2, invoke);
        List<p10.j1> g11 = invoke.g();
        kotlin.jvm.internal.g0.o(g11, "getValueParameters(...)");
        a00.r0.p3(g11, sb2, org.junit.jupiter.api.j2.O, pn.j.f81006c, pn.j.f81007d, 0, null, k2.f64957a, 48, null);
        sb2.append(" -> ");
        e30.r0 returnType = invoke.getReturnType();
        kotlin.jvm.internal.g0.m(returnType);
        sb2.append(l2Var.l(returnType));
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb3, "toString(...)");
        return sb3;
    }

    @m80.k
    public final String j(@m80.k kotlin.reflect.jvm.internal.l parameter) {
        kotlin.jvm.internal.g0.p(parameter, "parameter");
        StringBuilder sb2 = new StringBuilder();
        int i11 = a.f64963a[parameter.getKind().ordinal()];
        if (i11 == 1) {
            sb2.append("extension receiver parameter");
        } else if (i11 == 2) {
            sb2.append("instance parameter");
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            sb2.append("parameter #" + parameter.getIndex() + ' ' + parameter.getName());
        }
        sb2.append(" of ");
        sb2.append(f64961a.e(parameter.n().c0()));
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb3, "toString(...)");
        return sb3;
    }

    @m80.k
    public final String k(@m80.k p10.q0 descriptor) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(descriptor.E() ? "var " : "val ");
        l2 l2Var = f64961a;
        l2Var.d(sb2, descriptor);
        p20.m mVar = f64962b;
        n20.f name = descriptor.getName();
        kotlin.jvm.internal.g0.o(name, "getName(...)");
        sb2.append(mVar.V(name, true));
        sb2.append(": ");
        e30.r0 type = descriptor.getType();
        kotlin.jvm.internal.g0.o(type, "getType(...)");
        sb2.append(l2Var.l(type));
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb3, "toString(...)");
        return sb3;
    }

    @m80.k
    public final String l(@m80.k e30.r0 type) {
        kotlin.jvm.internal.g0.p(type, "type");
        return f64962b.W(type);
    }
}
