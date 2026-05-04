package kotlin.jvm.internal;

import java.util.Arrays;
import java.util.Collections;
import k10.i2;
import kotlin.reflect.KVariance;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final p0 f67013a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f67014b = " (Kotlin reflection is not available)";

    /* renamed from: c, reason: collision with root package name */
    public static final h10.d[] f67015c;

    static {
        p0 p0Var = null;
        try {
            p0Var = (p0) i2.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (p0Var == null) {
            p0Var = new p0();
        }
        f67013a = p0Var;
        f67015c = new h10.d[0];
    }

    @yz.y0(version = "1.4")
    public static h10.r A(h10.g gVar) {
        return f67013a.s(gVar, Collections.EMPTY_LIST, false);
    }

    @yz.y0(version = "1.4")
    public static h10.r B(Class cls) {
        return f67013a.s(d(cls), Collections.EMPTY_LIST, false);
    }

    @yz.y0(version = "1.4")
    public static h10.r C(Class cls, h10.t tVar) {
        return f67013a.s(d(cls), Collections.singletonList(tVar), false);
    }

    @yz.y0(version = "1.4")
    public static h10.r D(Class cls, h10.t tVar, h10.t tVar2) {
        return f67013a.s(d(cls), Arrays.asList(tVar, tVar2), false);
    }

    @yz.y0(version = "1.4")
    public static h10.r E(Class cls, h10.t... tVarArr) {
        return f67013a.s(d(cls), a00.a0.dz(tVarArr), false);
    }

    @yz.y0(version = "1.4")
    public static h10.s F(Object obj, String str, KVariance kVariance, boolean z11) {
        return f67013a.t(obj, str, kVariance, z11);
    }

    public static h10.d a(Class cls) {
        return f67013a.a(cls);
    }

    public static h10.d b(Class cls, String str) {
        return f67013a.b(cls, str);
    }

    public static h10.i c(FunctionReference functionReference) {
        return f67013a.c(functionReference);
    }

    public static h10.d d(Class cls) {
        return f67013a.d(cls);
    }

    public static h10.d e(Class cls, String str) {
        return f67013a.e(cls, str);
    }

    public static h10.d[] f(Class[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return f67015c;
        }
        h10.d[] dVarArr = new h10.d[length];
        for (int i11 = 0; i11 < length; i11++) {
            dVarArr[i11] = d(clsArr[i11]);
        }
        return dVarArr;
    }

    @yz.y0(version = "1.4")
    public static h10.h g(Class cls) {
        return f67013a.f(cls, "");
    }

    public static h10.h h(Class cls, String str) {
        return f67013a.f(cls, str);
    }

    @yz.y0(version = "1.6")
    public static h10.r i(h10.r rVar) {
        return f67013a.g(rVar);
    }

    public static h10.k j(MutablePropertyReference0 mutablePropertyReference0) {
        return f67013a.h(mutablePropertyReference0);
    }

    public static h10.l k(MutablePropertyReference1 mutablePropertyReference1) {
        return f67013a.i(mutablePropertyReference1);
    }

    public static h10.m l(MutablePropertyReference2 mutablePropertyReference2) {
        return f67013a.j(mutablePropertyReference2);
    }

    @yz.y0(version = "1.6")
    public static h10.r m(h10.r rVar) {
        return f67013a.k(rVar);
    }

    @yz.y0(version = "1.4")
    public static h10.r n(h10.g gVar) {
        return f67013a.s(gVar, Collections.EMPTY_LIST, true);
    }

    @yz.y0(version = "1.4")
    public static h10.r o(Class cls) {
        return f67013a.s(d(cls), Collections.EMPTY_LIST, true);
    }

    @yz.y0(version = "1.4")
    public static h10.r p(Class cls, h10.t tVar) {
        return f67013a.s(d(cls), Collections.singletonList(tVar), true);
    }

    @yz.y0(version = "1.4")
    public static h10.r q(Class cls, h10.t tVar, h10.t tVar2) {
        return f67013a.s(d(cls), Arrays.asList(tVar, tVar2), true);
    }

    @yz.y0(version = "1.4")
    public static h10.r r(Class cls, h10.t... tVarArr) {
        return f67013a.s(d(cls), a00.a0.dz(tVarArr), true);
    }

    @yz.y0(version = "1.6")
    public static h10.r s(h10.r rVar, h10.r rVar2) {
        return f67013a.l(rVar, rVar2);
    }

    public static h10.o t(PropertyReference0 propertyReference0) {
        return f67013a.m(propertyReference0);
    }

    public static h10.p u(PropertyReference1 propertyReference1) {
        return f67013a.n(propertyReference1);
    }

    public static h10.q v(PropertyReference2 propertyReference2) {
        return f67013a.o(propertyReference2);
    }

    @yz.y0(version = "1.3")
    public static String w(c0 c0Var) {
        return f67013a.p(c0Var);
    }

    @yz.y0(version = "1.1")
    public static String x(Lambda lambda) {
        return f67013a.q(lambda);
    }

    @yz.y0(version = "1.4")
    public static void y(h10.s sVar, h10.r rVar) {
        f67013a.r(sVar, Collections.singletonList(rVar));
    }

    @yz.y0(version = "1.4")
    public static void z(h10.s sVar, h10.r... rVarArr) {
        f67013a.r(sVar, a00.a0.dz(rVarArr));
    }
}
