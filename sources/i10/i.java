package i10;

import a00.h0;
import a00.i0;
import e30.b2;
import e30.c1;
import e30.c2;
import e30.j1;
import e30.r0;
import e30.r1;
import e30.u1;
import h10.t;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import k10.v0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.r;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "KClassifiers")
@u0({"SMAP\nKClassifiers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClassifiers.kt\nkotlin/reflect/full/KClassifiers\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,97:1\n1567#2:98\n1598#2,4:99\n1557#2:103\n1628#2,3:104\n*S KotlinDebug\n*F\n+ 1 KClassifiers.kt\nkotlin/reflect/full/KClassifiers\n*L\n69#1:98\n69#1:99,4\n95#1:103\n95#1:104,3\n*E\n"})
/* loaded from: classes8.dex */
public final class i {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f60113a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f60113a = iArr;
        }
    }

    public static final c1 a(r1 r1Var, u1 u1Var, List<t> list, boolean z11) {
        b2 j1Var;
        List<p10.c1> parameters = u1Var.getParameters();
        g0.o(parameters, "getParameters(...)");
        List<t> list2 = list;
        ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                h0.b0();
            }
            t tVar = (t) obj;
            r rVar = (r) tVar.g();
            r0 D = rVar != null ? rVar.D() : null;
            KVariance h11 = tVar.h();
            int i13 = h11 == null ? -1 : a.f60113a[h11.ordinal()];
            if (i13 == -1) {
                p10.c1 c1Var = parameters.get(i11);
                g0.o(c1Var, "get(...)");
                j1Var = new j1(c1Var);
            } else if (i13 == 1) {
                Variance variance = Variance.INVARIANT;
                g0.m(D);
                j1Var = new c2(variance, D);
            } else if (i13 == 2) {
                Variance variance2 = Variance.IN_VARIANCE;
                g0.m(D);
                j1Var = new c2(variance2, D);
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Variance variance3 = Variance.OUT_VARIANCE;
                g0.m(D);
                j1Var = new c2(variance3, D);
            }
            arrayList.add(j1Var);
            i11 = i12;
        }
        return e30.u0.m(r1Var, u1Var, arrayList, z11, null, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.1")
    @m80.k
    public static final h10.r b(@m80.k h10.g gVar, @m80.k List<t> arguments, boolean z11, @m80.k List<? extends Annotation> annotations) {
        p10.d a11;
        g0.p(gVar, "<this>");
        g0.p(arguments, "arguments");
        g0.p(annotations, "annotations");
        x00.a aVar = null;
        Object[] objArr = 0;
        v0 v0Var = gVar instanceof v0 ? (v0) gVar : null;
        if (v0Var == null || (a11 = v0Var.a()) == null) {
            throw new KotlinReflectionInternalError("Cannot create type for an unsupported classifier: " + gVar + " (" + gVar.getClass() + ')');
        }
        u1 o11 = a11.o();
        g0.o(o11, "getTypeConstructor(...)");
        List<p10.c1> parameters = o11.getParameters();
        g0.o(parameters, "getParameters(...)");
        if (parameters.size() == arguments.size()) {
            return new r(a(annotations.isEmpty() ? r1.f48652b.j() : r1.f48652b.j(), o11, arguments, z11), aVar, 2, objArr == true ? 1 : 0);
        }
        throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + arguments.size() + " were provided.");
    }

    public static /* synthetic */ h10.r c(h10.g gVar, List list, boolean z11, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = h0.J();
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            list2 = h0.J();
        }
        return b(gVar, list, z11, list2);
    }

    @m80.k
    public static final h10.r d(@m80.k h10.g gVar) {
        p10.d a11;
        g0.p(gVar, "<this>");
        v0 v0Var = gVar instanceof v0 ? (v0) gVar : null;
        if (v0Var == null || (a11 = v0Var.a()) == null) {
            return c(gVar, null, false, null, 7, null);
        }
        List<p10.c1> parameters = a11.o().getParameters();
        g0.o(parameters, "getParameters(...)");
        if (parameters.isEmpty()) {
            return c(gVar, null, false, null, 7, null);
        }
        List<p10.c1> list = parameters;
        ArrayList arrayList = new ArrayList(i0.d0(list, 10));
        for (p10.c1 c1Var : list) {
            arrayList.add(t.f57954c.c());
        }
        return c(gVar, arrayList, false, null, 6, null);
    }

    @y0(version = "1.1")
    public static /* synthetic */ void e(h10.g gVar) {
    }
}
