package rx;

import ec0.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import qb0.g;
import qb0.h;
import rx.Emitter;
import rx.a;
import rx.exceptions.OnErrorFailedException;
import rx.internal.operators.EmptyObservableHolder;
import rx.internal.operators.NeverObservableHolder;
import rx.internal.operators.a1;
import rx.internal.operators.a2;
import rx.internal.operators.a3;
import rx.internal.operators.a4;
import rx.internal.operators.b0;
import rx.internal.operators.b1;
import rx.internal.operators.b2;
import rx.internal.operators.b3;
import rx.internal.operators.b4;
import rx.internal.operators.c0;
import rx.internal.operators.c1;
import rx.internal.operators.c2;
import rx.internal.operators.c3;
import rx.internal.operators.c4;
import rx.internal.operators.d0;
import rx.internal.operators.d1;
import rx.internal.operators.d2;
import rx.internal.operators.d3;
import rx.internal.operators.d4;
import rx.internal.operators.e0;
import rx.internal.operators.e1;
import rx.internal.operators.e2;
import rx.internal.operators.e3;
import rx.internal.operators.e4;
import rx.internal.operators.f0;
import rx.internal.operators.f1;
import rx.internal.operators.f2;
import rx.internal.operators.f3;
import rx.internal.operators.f4;
import rx.internal.operators.g0;
import rx.internal.operators.g1;
import rx.internal.operators.g2;
import rx.internal.operators.g3;
import rx.internal.operators.g4;
import rx.internal.operators.h0;
import rx.internal.operators.h1;
import rx.internal.operators.h2;
import rx.internal.operators.h3;
import rx.internal.operators.i0;
import rx.internal.operators.i1;
import rx.internal.operators.i2;
import rx.internal.operators.i3;
import rx.internal.operators.j0;
import rx.internal.operators.j1;
import rx.internal.operators.j2;
import rx.internal.operators.j3;
import rx.internal.operators.k0;
import rx.internal.operators.k1;
import rx.internal.operators.k2;
import rx.internal.operators.k3;
import rx.internal.operators.l0;
import rx.internal.operators.l1;
import rx.internal.operators.l2;
import rx.internal.operators.l3;
import rx.internal.operators.m0;
import rx.internal.operators.m1;
import rx.internal.operators.m2;
import rx.internal.operators.m3;
import rx.internal.operators.n0;
import rx.internal.operators.n1;
import rx.internal.operators.n2;
import rx.internal.operators.n3;
import rx.internal.operators.o0;
import rx.internal.operators.o1;
import rx.internal.operators.o2;
import rx.internal.operators.o3;
import rx.internal.operators.p0;
import rx.internal.operators.p1;
import rx.internal.operators.p3;
import rx.internal.operators.q0;
import rx.internal.operators.q1;
import rx.internal.operators.q2;
import rx.internal.operators.q3;
import rx.internal.operators.r0;
import rx.internal.operators.r1;
import rx.internal.operators.r2;
import rx.internal.operators.r3;
import rx.internal.operators.s1;
import rx.internal.operators.s2;
import rx.internal.operators.s3;
import rx.internal.operators.t1;
import rx.internal.operators.t2;
import rx.internal.operators.t3;
import rx.internal.operators.u1;
import rx.internal.operators.u2;
import rx.internal.operators.u3;
import rx.internal.operators.v0;
import rx.internal.operators.v1;
import rx.internal.operators.v2;
import rx.internal.operators.v3;
import rx.internal.operators.w;
import rx.internal.operators.w0;
import rx.internal.operators.w1;
import rx.internal.operators.w2;
import rx.internal.operators.w3;
import rx.internal.operators.x0;
import rx.internal.operators.x1;
import rx.internal.operators.x2;
import rx.internal.operators.x3;
import rx.internal.operators.y0;
import rx.internal.operators.y1;
import rx.internal.operators.y2;
import rx.internal.operators.y3;
import rx.internal.operators.z;
import rx.internal.operators.z1;
import rx.internal.operators.z2;
import rx.internal.operators.z3;
import rx.internal.util.InternalObservableUtils;
import rx.internal.util.j;
import rx.internal.util.k;
import rx.internal.util.o;
import wb0.a0;
import wb0.m;
import wb0.p;
import wb0.q;
import wb0.r;
import wb0.s;
import wb0.t;
import wb0.u;
import wb0.v;
import wb0.x;
import wb0.y;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class c<T> {

    /* renamed from: a, reason: collision with root package name */
    public final a<T> f84992a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a<T> extends wb0.b<g<? super T>> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b<R, T> extends p<g<? super R>, g<? super T>> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: rx.c$c, reason: collision with other inner class name */
    public interface InterfaceC1074c<T, R> extends p<c<T>, c<R>> {
    }

    public c(a<T> aVar) {
        this.f84992a = aVar;
    }

    public static <T> c<T> A0(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4, c<? extends T> cVar5, c<? extends T> cVar6, c<? extends T> cVar7) {
        return u0(S2(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7));
    }

    public static <T> c<T> A3(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4, c<? extends T> cVar5) {
        return v3(Q2(cVar, cVar2, cVar3, cVar4, cVar5));
    }

    public static <T> c<T> B0(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4, c<? extends T> cVar5, c<? extends T> cVar6, c<? extends T> cVar7, c<? extends T> cVar8) {
        return u0(T2(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8));
    }

    public static <T> c<T> B3(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4, c<? extends T> cVar5, c<? extends T> cVar6) {
        return v3(R2(cVar, cVar2, cVar3, cVar4, cVar5, cVar6));
    }

    public static <T> c<T> B5(c<? extends c<? extends T>> cVar) {
        return (c<T>) cVar.a3(k3.b(false));
    }

    public static <T> c<T> C0(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4, c<? extends T> cVar5, c<? extends T> cVar6, c<? extends T> cVar7, c<? extends T> cVar8, c<? extends T> cVar9) {
        return u0(U2(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9));
    }

    public static <T> c<T> C3(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4, c<? extends T> cVar5, c<? extends T> cVar6, c<? extends T> cVar7) {
        return v3(S2(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7));
    }

    public static <T> c<T> C5(c<? extends c<? extends T>> cVar) {
        return (c<T>) cVar.a3(k3.b(true));
    }

    public static <T> c<T> D0(Iterable<? extends c<? extends T>> iterable) {
        return E0(u2(iterable));
    }

    public static <T> c<T> D3(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4, c<? extends T> cVar5, c<? extends T> cVar6, c<? extends T> cVar7, c<? extends T> cVar8) {
        return v3(T2(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8));
    }

    public static <T> c<T> E0(c<? extends c<? extends T>> cVar) {
        return (c<T>) cVar.a1(o.c());
    }

    public static <T> c<T> E3(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4, c<? extends T> cVar5, c<? extends T> cVar6, c<? extends T> cVar7, c<? extends T> cVar8, c<? extends T> cVar9) {
        return v3(U2(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9));
    }

    public static <T> c<T> F0(c<? extends T> cVar, c<? extends T> cVar2) {
        return E0(N2(cVar, cVar2));
    }

    public static <T> c<T> G0(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3) {
        return E0(O2(cVar, cVar2, cVar3));
    }

    public static c<Long> G2(long j11, long j12, TimeUnit timeUnit) {
        return H2(j11, j12, timeUnit, bc0.c.a());
    }

    public static <T> c<T> H0(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4) {
        return E0(P2(cVar, cVar2, cVar3, cVar4));
    }

    public static c<Long> H2(long j11, long j12, TimeUnit timeUnit, d dVar) {
        return I6(new i1(j11, j12, timeUnit, dVar));
    }

    public static <T> c<T> H3() {
        return NeverObservableHolder.instance();
    }

    public static <T> c<T> I0(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4, c<? extends T> cVar5) {
        return E0(Q2(cVar, cVar2, cVar3, cVar4, cVar5));
    }

    public static c<Long> I2(long j11, TimeUnit timeUnit) {
        return H2(j11, j11, timeUnit, bc0.c.a());
    }

    public static <T> c<T> I6(a<T> aVar) {
        return new c<>(ac0.c.G(aVar));
    }

    public static <T> c<T> J0(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4, c<? extends T> cVar5, c<? extends T> cVar6) {
        return E0(R2(cVar, cVar2, cVar3, cVar4, cVar5, cVar6));
    }

    public static c<Long> J2(long j11, TimeUnit timeUnit, d dVar) {
        return H2(j11, j11, timeUnit, dVar);
    }

    public static <T> c<T> K0(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4, c<? extends T> cVar5, c<? extends T> cVar6, c<? extends T> cVar7) {
        return E0(S2(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7));
    }

    public static <T> c<T> L0(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4, c<? extends T> cVar5, c<? extends T> cVar6, c<? extends T> cVar7, c<? extends T> cVar8) {
        return E0(T2(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8));
    }

    public static <T, Resource> c<T> L6(wb0.o<Resource> oVar, p<? super Resource, ? extends c<? extends T>> pVar, wb0.b<? super Resource> bVar) {
        return M6(oVar, pVar, bVar, false);
    }

    public static <T> c<T> M0(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4, c<? extends T> cVar5, c<? extends T> cVar6, c<? extends T> cVar7, c<? extends T> cVar8, c<? extends T> cVar9) {
        return E0(U2(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9));
    }

    public static <T> c<T> M2(T t11) {
        return k.w7(t11);
    }

    public static <T> c<Boolean> M4(c<? extends T> cVar, c<? extends T> cVar2) {
        return N4(cVar, cVar2, InternalObservableUtils.OBJECT_EQUALS);
    }

    public static <T, Resource> c<T> M6(wb0.o<Resource> oVar, p<? super Resource, ? extends c<? extends T>> pVar, wb0.b<? super Resource> bVar, boolean z11) {
        return I6(new m1(oVar, pVar, bVar, z11));
    }

    public static <T> c<T> N0(Iterable<? extends c<? extends T>> iterable) {
        return u2(iterable).b1(o.c());
    }

    public static <T> c<T> N2(T t11, T t12) {
        return y2(new Object[]{t11, t12});
    }

    public static <T> c<Boolean> N4(c<? extends T> cVar, c<? extends T> cVar2, q<? super T, ? super T, Boolean> qVar) {
        return b3.b(cVar, cVar2, qVar);
    }

    public static <T> c<T> O0(Iterable<? extends c<? extends T>> iterable, int i11) {
        return u2(iterable).c1(o.c(), i11);
    }

    public static <T> c<T> O2(T t11, T t12, T t13) {
        return y2(new Object[]{t11, t12, t13});
    }

    public static <T> c<T> P0(c<? extends c<? extends T>> cVar) {
        return (c<T>) cVar.b1(o.c());
    }

    public static <T> c<T> P2(T t11, T t12, T t13, T t14) {
        return y2(new Object[]{t11, t12, t13, t14});
    }

    public static <T> c<T> Q0(c<? extends c<? extends T>> cVar, int i11) {
        return (c<T>) cVar.c1(o.c(), i11);
    }

    public static <T> c<T> Q2(T t11, T t12, T t13, T t14, T t15) {
        return y2(new Object[]{t11, t12, t13, t14, t15});
    }

    public static <T> c<T> R0(c<? extends T> cVar, c<? extends T> cVar2) {
        return N0(Arrays.asList(cVar, cVar2));
    }

    public static <T> c<T> R2(T t11, T t12, T t13, T t14, T t15, T t16) {
        return y2(new Object[]{t11, t12, t13, t14, t15, t16});
    }

    public static <T> c<T> S0(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3) {
        return N0(Arrays.asList(cVar, cVar2, cVar3));
    }

    public static <T> c<T> S1() {
        return EmptyObservableHolder.instance();
    }

    public static <T> c<T> S2(T t11, T t12, T t13, T t14, T t15, T t16, T t17) {
        return y2(new Object[]{t11, t12, t13, t14, t15, t16, t17});
    }

    public static <T> c<T> T0(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4) {
        return N0(Arrays.asList(cVar, cVar2, cVar3, cVar4));
    }

    public static <T> c<T> T1(Throwable th2) {
        return I6(new e1(th2));
    }

    public static <T> c<T> T2(T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18) {
        return y2(new Object[]{t11, t12, t13, t14, t15, t16, t17, t18});
    }

    public static <T> c<T> U0(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4, c<? extends T> cVar5) {
        return N0(Arrays.asList(cVar, cVar2, cVar3, cVar4, cVar5));
    }

    public static <T> c<T> U2(T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18, T t19) {
        return y2(new Object[]{t11, t12, t13, t14, t15, t16, t17, t18, t19});
    }

    public static <T> c<T> V0(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4, c<? extends T> cVar5, c<? extends T> cVar6) {
        return N0(Arrays.asList(cVar, cVar2, cVar3, cVar4, cVar5, cVar6));
    }

    public static <T> c<T> V2(T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18, T t19, T t21) {
        return y2(new Object[]{t11, t12, t13, t14, t15, t16, t17, t18, t19, t21});
    }

    public static <T> c<T> W0(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4, c<? extends T> cVar5, c<? extends T> cVar6, c<? extends T> cVar7) {
        return N0(Arrays.asList(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7));
    }

    public static <T> c<T> X0(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4, c<? extends T> cVar5, c<? extends T> cVar6, c<? extends T> cVar7, c<? extends T> cVar8) {
        return N0(Arrays.asList(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8));
    }

    public static <T> c<T> Y0(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4, c<? extends T> cVar5, c<? extends T> cVar6, c<? extends T> cVar7, c<? extends T> cVar8, c<? extends T> cVar9) {
        return N0(Arrays.asList(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9));
    }

    public static c<Integer> b4(int i11, int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException("Count can not be negative");
        }
        if (i12 == 0) {
            return S1();
        }
        if (i11 <= Integer.MIN_VALUE - i12) {
            return i12 == 1 ? M2(Integer.valueOf(i11)) : I6(new v0(i11, (i12 - 1) + i11));
        }
        throw new IllegalArgumentException("start + count can not exceed Integer.MAX_VALUE");
    }

    public static c<Integer> c4(int i11, int i12, d dVar) {
        return b4(i11, i12).w5(dVar);
    }

    public static <T> c<T> d(Iterable<? extends c<? extends T>> iterable) {
        return I6(w.a(iterable));
    }

    public static <T> c<T> e(c<? extends T> cVar, c<? extends T> cVar2) {
        return I6(w.b(cVar, cVar2));
    }

    public static <T> c<T> f(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3) {
        return I6(w.h(cVar, cVar2, cVar3));
    }

    public static <T> c<T> f3(Iterable<? extends c<? extends T>> iterable) {
        return h3(u2(iterable));
    }

    public static <T> c<T> g(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4) {
        return I6(w.j(cVar, cVar2, cVar3, cVar4));
    }

    public static <T> c<T> g3(Iterable<? extends c<? extends T>> iterable, int i11) {
        return i3(u2(iterable), i11);
    }

    public static <T> c<T> h(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4, c<? extends T> cVar5) {
        return I6(w.l(cVar, cVar2, cVar3, cVar4, cVar5));
    }

    public static <T, R> c<R> h0(Iterable<? extends c<? extends T>> iterable, y<? extends R> yVar) {
        return I6(new rx.internal.operators.y(iterable, yVar));
    }

    public static <T> c<T> h3(c<? extends c<? extends T>> cVar) {
        return cVar.getClass() == k.class ? ((k) cVar).z7(o.c()) : (c<T>) cVar.a3(o2.b(false));
    }

    public static <T> c<T> i(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4, c<? extends T> cVar5, c<? extends T> cVar6) {
        return I6(w.m(cVar, cVar2, cVar3, cVar4, cVar5, cVar6));
    }

    public static <T, R> c<R> i0(List<? extends c<? extends T>> list, y<? extends R> yVar) {
        return I6(new rx.internal.operators.y(list, yVar));
    }

    public static <T> c<T> i3(c<? extends c<? extends T>> cVar, int i11) {
        return cVar.getClass() == k.class ? ((k) cVar).z7(o.c()) : (c<T>) cVar.a3(o2.h(false, i11));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> c<R> j0(c<? extends T1> cVar, c<? extends T2> cVar2, c<? extends T3> cVar3, c<? extends T4> cVar4, c<? extends T5> cVar5, c<? extends T6> cVar6, c<? extends T7> cVar7, c<? extends T8> cVar8, c<? extends T9> cVar9, x<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> xVar) {
        return i0(Arrays.asList(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9), a0.n(xVar));
    }

    @Deprecated
    public static <T> c<T> j1(a<T> aVar) {
        return new c<>(ac0.c.G(aVar));
    }

    public static <T> c<T> j3(c<? extends T> cVar, c<? extends T> cVar2) {
        return r3(new c[]{cVar, cVar2});
    }

    public static <R> c<R> j7(Iterable<? extends c<?>> iterable, y<? extends R> yVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends c<?>> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return M2(arrayList.toArray(new c[arrayList.size()])).a3(new f4(yVar));
    }

    public static <T> c<T> k(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4, c<? extends T> cVar5, c<? extends T> cVar6, c<? extends T> cVar7) {
        return I6(w.n(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> c<R> k0(c<? extends T1> cVar, c<? extends T2> cVar2, c<? extends T3> cVar3, c<? extends T4> cVar4, c<? extends T5> cVar5, c<? extends T6> cVar6, c<? extends T7> cVar7, c<? extends T8> cVar8, wb0.w<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> wVar) {
        return i0(Arrays.asList(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8), a0.m(wVar));
    }

    public static <T> c<T> k1(wb0.b<Emitter<T>> bVar, Emitter.BackpressureMode backpressureMode) {
        return I6(new rx.internal.operators.a0(bVar, backpressureMode));
    }

    public static <T> c<T> k3(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3) {
        return r3(new c[]{cVar, cVar2, cVar3});
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> c<R> k7(c<? extends T1> cVar, c<? extends T2> cVar2, c<? extends T3> cVar3, c<? extends T4> cVar4, c<? extends T5> cVar5, c<? extends T6> cVar6, c<? extends T7> cVar7, c<? extends T8> cVar8, c<? extends T9> cVar9, x<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> xVar) {
        return M2(new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9}).a3(new f4(xVar));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> c<R> l0(c<? extends T1> cVar, c<? extends T2> cVar2, c<? extends T3> cVar3, c<? extends T4> cVar4, c<? extends T5> cVar5, c<? extends T6> cVar6, c<? extends T7> cVar7, v<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> vVar) {
        return i0(Arrays.asList(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7), a0.l(vVar));
    }

    @ub0.a
    public static <S, T> c<T> l1(yb0.a<S, T> aVar) {
        return I6(aVar);
    }

    public static <T> c<T> l3(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4) {
        return r3(new c[]{cVar, cVar2, cVar3, cVar4});
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> c<R> l7(c<? extends T1> cVar, c<? extends T2> cVar2, c<? extends T3> cVar3, c<? extends T4> cVar4, c<? extends T5> cVar5, c<? extends T6> cVar6, c<? extends T7> cVar7, c<? extends T8> cVar8, wb0.w<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> wVar) {
        return M2(new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8}).a3(new f4(wVar));
    }

    public static <T1, T2, T3, T4, T5, T6, R> c<R> m0(c<? extends T1> cVar, c<? extends T2> cVar2, c<? extends T3> cVar3, c<? extends T4> cVar4, c<? extends T5> cVar5, c<? extends T6> cVar6, u<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> uVar) {
        return i0(Arrays.asList(cVar, cVar2, cVar3, cVar4, cVar5, cVar6), a0.k(uVar));
    }

    public static <S, T> c<T> m1(yb0.e<S, T> eVar) {
        return I6(eVar);
    }

    public static <T> c<T> m3(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4, c<? extends T> cVar5) {
        return r3(new c[]{cVar, cVar2, cVar3, cVar4, cVar5});
    }

    @Deprecated
    public static c<Long> m6(long j11, long j12, TimeUnit timeUnit) {
        return H2(j11, j12, timeUnit, bc0.c.a());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> c<R> m7(c<? extends T1> cVar, c<? extends T2> cVar2, c<? extends T3> cVar3, c<? extends T4> cVar4, c<? extends T5> cVar5, c<? extends T6> cVar6, c<? extends T7> cVar7, v<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> vVar) {
        return M2(new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7}).a3(new f4(vVar));
    }

    public static <T> c<T> n(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4, c<? extends T> cVar5, c<? extends T> cVar6, c<? extends T> cVar7, c<? extends T> cVar8) {
        return I6(w.o(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8));
    }

    public static <T1, T2, T3, T4, T5, R> c<R> n0(c<? extends T1> cVar, c<? extends T2> cVar2, c<? extends T3> cVar3, c<? extends T4> cVar4, c<? extends T5> cVar5, t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> tVar) {
        return i0(Arrays.asList(cVar, cVar2, cVar3, cVar4, cVar5), a0.j(tVar));
    }

    public static <T> c<T> n3(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4, c<? extends T> cVar5, c<? extends T> cVar6) {
        return r3(new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6});
    }

    @Deprecated
    public static c<Long> n6(long j11, long j12, TimeUnit timeUnit, d dVar) {
        return H2(j11, j12, timeUnit, dVar);
    }

    public static <T1, T2, T3, T4, T5, T6, R> c<R> n7(c<? extends T1> cVar, c<? extends T2> cVar2, c<? extends T3> cVar3, c<? extends T4> cVar4, c<? extends T5> cVar5, c<? extends T6> cVar6, u<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> uVar) {
        return M2(new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6}).a3(new f4(uVar));
    }

    public static <T1, T2, T3, T4, R> c<R> o0(c<? extends T1> cVar, c<? extends T2> cVar2, c<? extends T3> cVar3, c<? extends T4> cVar4, s<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> sVar) {
        return i0(Arrays.asList(cVar, cVar2, cVar3, cVar4), a0.i(sVar));
    }

    public static <T> c<T> o3(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4, c<? extends T> cVar5, c<? extends T> cVar6, c<? extends T> cVar7) {
        return r3(new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7});
    }

    public static c<Long> o6(long j11, TimeUnit timeUnit) {
        return p6(j11, timeUnit, bc0.c.a());
    }

    public static <T1, T2, T3, T4, T5, R> c<R> o7(c<? extends T1> cVar, c<? extends T2> cVar2, c<? extends T3> cVar3, c<? extends T4> cVar4, c<? extends T5> cVar5, t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> tVar) {
        return M2(new c[]{cVar, cVar2, cVar3, cVar4, cVar5}).a3(new f4(tVar));
    }

    public static <T1, T2, T3, R> c<R> p0(c<? extends T1> cVar, c<? extends T2> cVar2, c<? extends T3> cVar3, r<? super T1, ? super T2, ? super T3, ? extends R> rVar) {
        return i0(Arrays.asList(cVar, cVar2, cVar3), a0.h(rVar));
    }

    public static <T> c<T> p3(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4, c<? extends T> cVar5, c<? extends T> cVar6, c<? extends T> cVar7, c<? extends T> cVar8) {
        return r3(new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8});
    }

    public static c<Long> p6(long j11, TimeUnit timeUnit, d dVar) {
        return I6(new h1(j11, timeUnit, dVar));
    }

    public static <T1, T2, T3, T4, R> c<R> p7(c<? extends T1> cVar, c<? extends T2> cVar2, c<? extends T3> cVar3, c<? extends T4> cVar4, s<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> sVar) {
        return M2(new c[]{cVar, cVar2, cVar3, cVar4}).a3(new f4(sVar));
    }

    public static <T> c<T> q(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4, c<? extends T> cVar5, c<? extends T> cVar6, c<? extends T> cVar7, c<? extends T> cVar8, c<? extends T> cVar9) {
        return I6(w.p(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9));
    }

    public static <T1, T2, R> c<R> q0(c<? extends T1> cVar, c<? extends T2> cVar2, q<? super T1, ? super T2, ? extends R> qVar) {
        return i0(Arrays.asList(cVar, cVar2), a0.g(qVar));
    }

    public static <T> c<T> q3(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4, c<? extends T> cVar5, c<? extends T> cVar6, c<? extends T> cVar7, c<? extends T> cVar8, c<? extends T> cVar9) {
        return r3(new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9});
    }

    public static <T1, T2, T3, R> c<R> q7(c<? extends T1> cVar, c<? extends T2> cVar2, c<? extends T3> cVar3, r<? super T1, ? super T2, ? super T3, ? extends R> rVar) {
        return M2(new c[]{cVar, cVar2, cVar3}).a3(new f4(rVar));
    }

    public static <T, R> c<R> r0(Iterable<? extends c<? extends T>> iterable, y<? extends R> yVar) {
        return I6(new rx.internal.operators.y(null, iterable, yVar, j.f86718d, true));
    }

    public static <T> c<T> r1(wb0.o<c<T>> oVar) {
        return I6(new b0(oVar));
    }

    public static <T> c<T> r3(c<? extends T>[] cVarArr) {
        return h3(y2(cVarArr));
    }

    public static <T1, T2, R> c<R> r7(c<? extends T1> cVar, c<? extends T2> cVar2, q<? super T1, ? super T2, ? extends R> qVar) {
        return M2(new c[]{cVar, cVar2}).a3(new f4(qVar));
    }

    public static <T> c<T> s3(c<? extends T>[] cVarArr, int i11) {
        return i3(y2(cVarArr), i11);
    }

    public static <T> h s5(g<? super T> gVar, c<T> cVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("subscriber can not be null");
        }
        if (cVar.f84992a == null) {
            throw new IllegalStateException("onSubscribe function can not be null.");
        }
        gVar.onStart();
        if (!(gVar instanceof zb0.e)) {
            gVar = new zb0.e(gVar);
        }
        try {
            ac0.c.O(cVar, cVar.f84992a).call(gVar);
            return ac0.c.N(gVar);
        } catch (Throwable th2) {
            vb0.a.e(th2);
            if (gVar.isUnsubscribed()) {
                ac0.c.I(ac0.c.L(th2));
            } else {
                try {
                    gVar.onError(ac0.c.L(th2));
                } catch (Throwable th3) {
                    vb0.a.e(th3);
                    OnErrorFailedException onErrorFailedException = new OnErrorFailedException("Error occurred attempting to subscribe [" + th2.getMessage() + "] and then again while trying to pass to onError.", th3);
                    ac0.c.L(onErrorFailedException);
                    throw onErrorFailedException;
                }
            }
            return f.e();
        }
    }

    public static <R> c<R> s7(c<? extends c<?>> cVar, y<? extends R> yVar) {
        return cVar.v6().c3(InternalObservableUtils.TO_ARRAY).a3(new f4(yVar));
    }

    public static <T> c<T> t0(Iterable<? extends c<? extends T>> iterable) {
        return u0(u2(iterable));
    }

    public static <T> c<T> t3(Iterable<? extends c<? extends T>> iterable) {
        return v3(u2(iterable));
    }

    public static <R> c<R> t7(c<?>[] cVarArr, y<? extends R> yVar) {
        return M2(cVarArr).a3(new f4(yVar));
    }

    public static <T> c<T> u0(c<? extends c<? extends T>> cVar) {
        return (c<T>) cVar.Z0(o.c());
    }

    public static <T> c<T> u2(Iterable<? extends T> iterable) {
        return I6(new n0(iterable));
    }

    public static <T> c<T> u3(Iterable<? extends c<? extends T>> iterable, int i11) {
        return w3(u2(iterable), i11);
    }

    public static <T> c<T> v0(c<? extends T> cVar, c<? extends T> cVar2) {
        return u0(N2(cVar, cVar2));
    }

    public static <T> c<T> v2(Future<? extends T> future) {
        return I6(l1.a(future));
    }

    public static <T> c<T> v3(c<? extends c<? extends T>> cVar) {
        return (c<T>) cVar.a3(o2.b(true));
    }

    public static <T> c<T> w0(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3) {
        return u0(O2(cVar, cVar2, cVar3));
    }

    public static <T> c<T> w2(Future<? extends T> future, long j11, TimeUnit timeUnit) {
        return I6(l1.b(future, j11, timeUnit));
    }

    public static <T> c<T> w3(c<? extends c<? extends T>> cVar, int i11) {
        return (c<T>) cVar.a3(o2.h(true, i11));
    }

    public static <T> c<T> x0(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4) {
        return u0(P2(cVar, cVar2, cVar3, cVar4));
    }

    public static <T> c<T> x2(Future<? extends T> future, d dVar) {
        return I6(l1.a(future)).w5(dVar);
    }

    public static <T> c<T> x3(c<? extends T> cVar, c<? extends T> cVar2) {
        return v3(N2(cVar, cVar2));
    }

    public static <T> c<T> y0(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4, c<? extends T> cVar5) {
        return u0(Q2(cVar, cVar2, cVar3, cVar4, cVar5));
    }

    public static <T> c<T> y2(T[] tArr) {
        int length = tArr.length;
        return length == 0 ? S1() : length == 1 ? M2(tArr[0]) : I6(new l0(tArr));
    }

    public static <T> c<T> y3(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3) {
        return v3(O2(cVar, cVar2, cVar3));
    }

    public static <T> c<T> z0(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4, c<? extends T> cVar5, c<? extends T> cVar6) {
        return u0(R2(cVar, cVar2, cVar3, cVar4, cVar5, cVar6));
    }

    public static <T> c<T> z2(Callable<? extends T> callable) {
        return I6(new m0(callable));
    }

    public static <T> c<T> z3(c<? extends T> cVar, c<? extends T> cVar2, c<? extends T> cVar3, c<? extends T> cVar4) {
        return v3(P2(cVar, cVar2, cVar3, cVar4));
    }

    public final <T2> c<T2> A1() {
        return (c<T2>) a3(z1.b());
    }

    public final <K> c<yb0.d<K, T>> A2(p<? super T, ? extends K> pVar) {
        return (c<yb0.d<K, T>>) a3(new j2(pVar));
    }

    public final yb0.c<T> A4(long j11, TimeUnit timeUnit, d dVar) {
        return w2.E7(this, j11, timeUnit, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> c<R> A5(p<? super T, ? extends c<? extends R>> pVar) {
        return C5(c3(pVar));
    }

    public final <K, V> c<Map<K, Collection<V>>> A6(p<? super T, ? extends K> pVar, p<? super T, ? extends V> pVar2) {
        return I6(new k1(this, pVar, pVar2));
    }

    public final c<T> B1() {
        return (c<T>) a3(a2.b());
    }

    public final <K, R> c<yb0.d<K, R>> B2(p<? super T, ? extends K> pVar, p<? super T, ? extends R> pVar2) {
        return a3(new j2(pVar, pVar2));
    }

    public final yb0.c<T> B4(d dVar) {
        return w2.I7(u4(), dVar);
    }

    public final <K, V> c<Map<K, Collection<V>>> B6(p<? super T, ? extends K> pVar, p<? super T, ? extends V> pVar2, wb0.o<? extends Map<K, Collection<V>>> oVar) {
        return I6(new k1(this, pVar, pVar2, oVar));
    }

    public final c<T> C() {
        return (c<T>) a3(p1.b());
    }

    public final <U> c<T> C1(p<? super T, ? extends U> pVar) {
        return (c<T>) a3(new a2(pVar));
    }

    @ub0.b
    public final <K, R> c<yb0.d<K, R>> C2(p<? super T, ? extends K> pVar, p<? super T, ? extends R> pVar2, int i11, boolean z11, p<wb0.b<Object>, Map<K, Object>> pVar3) {
        if (pVar3 != null) {
            return a3(new j2(pVar, pVar2, i11, z11, pVar3));
        }
        throw new NullPointerException("evictingMapFactory cannot be null");
    }

    public final c<T> C4() {
        return w0.p(this);
    }

    public final <K, V> c<Map<K, Collection<V>>> C6(p<? super T, ? extends K> pVar, p<? super T, ? extends V> pVar2, wb0.o<? extends Map<K, Collection<V>>> oVar, p<? super K, ? extends Collection<V>> pVar3) {
        return I6(new k1(this, pVar, pVar2, oVar, pVar3));
    }

    public final c<List<T>> D(int i11) {
        return E(i11, i11);
    }

    public final c<T> D1() {
        return (c<T>) a3(b2.h());
    }

    @Deprecated
    public final <K, R> c<yb0.d<K, R>> D2(p<? super T, ? extends K> pVar, p<? super T, ? extends R> pVar2, p<wb0.b<K>, Map<K, Object>> pVar3) {
        if (pVar3 != null) {
            return a3(new i2(pVar, pVar2, pVar3));
        }
        throw new NullPointerException("evictingMapFactory cannot be null");
    }

    public final c<T> D4(long j11) {
        return w0.q(this, j11);
    }

    public final c<T> D5(int i11) {
        return (c<T>) a3(new l3(i11));
    }

    public e<T> D6() {
        return new e<>(a1.b(this));
    }

    public final c<List<T>> E(int i11, int i12) {
        return (c<List<T>>) a3(new r1(i11, i12));
    }

    public final <U> c<T> E1(p<? super T, ? extends U> pVar) {
        return (c<T>) a3(new b2(pVar));
    }

    public final <T2, D1, D2, R> c<R> E2(c<T2> cVar, p<? super T, ? extends c<D1>> pVar, p<? super T2, ? extends c<D2>> pVar2, q<? super T, ? super c<T2>, ? extends R> qVar) {
        return I6(new o0(this, cVar, pVar, pVar2, qVar));
    }

    public final c<T> E4(q<Integer, Throwable, Boolean> qVar) {
        return (c<T>) G3().a3(new x2(qVar));
    }

    public final c<T> E5(long j11, TimeUnit timeUnit) {
        return F5(j11, timeUnit, bc0.c.a());
    }

    public final c<List<T>> E6() {
        return (c<List<T>>) a3(new w3(10));
    }

    public final c<T> F1(q<? super T, ? super T, Boolean> qVar) {
        return (c<T>) a3(new b2(qVar));
    }

    public final c<T> F2() {
        return (c<T>) a3(k2.b());
    }

    public final c<T> F3(c<? extends T> cVar) {
        return j3(this, cVar);
    }

    public final c<T> F4(p<? super c<? extends Throwable>, ? extends c<?>> pVar) {
        return w0.r(this, InternalObservableUtils.createRetryDematerializer(pVar));
    }

    public final c<T> F5(long j11, TimeUnit timeUnit, d dVar) {
        return (c<T>) a3(new o3(j11, timeUnit, dVar));
    }

    public final c<List<T>> F6(int i11) {
        return (c<List<T>>) a3(new w3(i11));
    }

    public final c<T> G1(wb0.a aVar) {
        return (c<T>) a3(new c2(aVar));
    }

    public final c<c<T>> G3() {
        return M2(this);
    }

    public final c<T> G4(p<? super c<? extends Throwable>, ? extends c<?>> pVar, d dVar) {
        return w0.s(this, InternalObservableUtils.createRetryDematerializer(pVar), dVar);
    }

    public final c<T> G5(p<? super T, Boolean> pVar) {
        return V1(pVar).D5(1);
    }

    public final c<List<T>> G6(q<? super T, ? super T, Integer> qVar) {
        return (c<List<T>>) a3(new w3(qVar, 10));
    }

    public final c<List<T>> H(long j11, long j12, TimeUnit timeUnit) {
        return I(j11, j12, timeUnit, bc0.c.a());
    }

    public final c<T> H1(wb0.a aVar) {
        return I6(new g0(this, new rx.internal.util.b(m.a(), m.a(), aVar)));
    }

    public final c<T> H4(long j11, TimeUnit timeUnit) {
        return I4(j11, timeUnit, bc0.c.a());
    }

    public final c<T> H5(int i11) {
        return i11 == 0 ? F2() : i11 == 1 ? I6(new d1(this)) : (c<T>) a3(new m3(i11));
    }

    public final c<List<T>> H6(q<? super T, ? super T, Integer> qVar, int i11) {
        return (c<List<T>>) a3(new w3(qVar, i11));
    }

    public final c<List<T>> I(long j11, long j12, TimeUnit timeUnit, d dVar) {
        return (c<List<T>>) a3(new t1(j11, j12, timeUnit, Integer.MAX_VALUE, dVar));
    }

    public final c<T> I1(qb0.c<? super T> cVar) {
        return I6(new g0(this, cVar));
    }

    public final c<T> I3(d dVar) {
        return J3(dVar, j.f86718d);
    }

    public final c<T> I4(long j11, TimeUnit timeUnit, d dVar) {
        return (c<T>) a3(new z2(j11, timeUnit, dVar));
    }

    public final c<T> I5(int i11, long j11, TimeUnit timeUnit) {
        return J5(i11, j11, timeUnit, bc0.c.a());
    }

    public final c<T> J1(wb0.b<Notification<? super T>> bVar) {
        return I6(new g0(this, new rx.internal.util.a(bVar)));
    }

    public final c<T> J3(d dVar, int i11) {
        return L3(dVar, false, i11);
    }

    public final <U> c<T> J4(c<U> cVar) {
        return (c<T>) a3(new y2(cVar));
    }

    public final c<T> J5(int i11, long j11, TimeUnit timeUnit, d dVar) {
        return (c<T>) a3(new n3(i11, j11, timeUnit, dVar));
    }

    public final h J6(g<? super T> gVar) {
        try {
            gVar.onStart();
            ac0.c.O(this, this.f84992a).call(gVar);
            return ac0.c.N(gVar);
        } catch (Throwable th2) {
            vb0.a.e(th2);
            try {
                gVar.onError(ac0.c.L(th2));
                return f.e();
            } catch (Throwable th3) {
                vb0.a.e(th3);
                OnErrorFailedException onErrorFailedException = new OnErrorFailedException("Error occurred attempting to subscribe [" + th2.getMessage() + "] and then again while trying to pass to onError.", th3);
                ac0.c.L(onErrorFailedException);
                throw onErrorFailedException;
            }
        }
    }

    public final c<T> K1(wb0.b<? super Throwable> bVar) {
        return I6(new g0(this, new rx.internal.util.b(m.a(), bVar, m.a())));
    }

    public final c<Boolean> K2() {
        return a3(InternalObservableUtils.IS_EMPTY);
    }

    public final c<T> K3(d dVar, boolean z11) {
        return L3(dVar, z11, j.f86718d);
    }

    public final <R> c<R> K4(R r11, q<R, ? super T, R> qVar) {
        return a3(new a3(r11, qVar));
    }

    public final c<T> K5(long j11, TimeUnit timeUnit) {
        return L5(j11, timeUnit, bc0.c.a());
    }

    public final c<T> K6(d dVar) {
        return (c<T>) a3(new x3(dVar));
    }

    public final c<List<T>> L(long j11, TimeUnit timeUnit) {
        return S(j11, timeUnit, Integer.MAX_VALUE, bc0.c.a());
    }

    public final c<T> L1(wb0.b<? super T> bVar) {
        return I6(new g0(this, new rx.internal.util.b(bVar, m.a(), m.a())));
    }

    public final <TRight, TLeftDuration, TRightDuration, R> c<R> L2(c<TRight> cVar, p<T, c<TLeftDuration>> pVar, p<TRight, c<TRightDuration>> pVar2, q<T, TRight, R> qVar) {
        return I6(new p0(this, cVar, pVar, pVar2, qVar));
    }

    public final c<T> L3(d dVar, boolean z11, int i11) {
        return this instanceof k ? ((k) this).A7(dVar) : (c<T>) a3(new q2(dVar, z11, i11));
    }

    public final c<T> L4(q<T, T, T> qVar) {
        return (c<T>) a3(new a3(qVar));
    }

    public final c<T> L5(long j11, TimeUnit timeUnit, d dVar) {
        return (c<T>) a3(new n3(j11, timeUnit, dVar));
    }

    public final c<T> M1(wb0.b<? super Long> bVar) {
        return (c<T>) a3(new d2(bVar));
    }

    public final <R> c<R> M3(Class<R> cls) {
        return V1(InternalObservableUtils.isInstanceOf(cls)).f0(cls);
    }

    public final c<List<T>> M5(int i11) {
        return H5(i11).v6();
    }

    public final c<T> N1(wb0.a aVar) {
        return (c<T>) a3(new e2(aVar));
    }

    public final c<T> N3() {
        return (c<T>) a3(r2.b());
    }

    public final c<List<T>> N5(int i11, long j11, TimeUnit timeUnit) {
        return I5(i11, j11, timeUnit).v6();
    }

    public final c<c<T>> N6(int i11) {
        return O6(i11, i11);
    }

    public final c<T> O1(wb0.a aVar) {
        return I6(new g0(this, new rx.internal.util.b(m.a(), m.c(aVar), aVar)));
    }

    public final c<T> O3(long j11) {
        return (c<T>) a3(new r2(j11));
    }

    public final c<T> O4() {
        return (c<T>) a3(c3.b());
    }

    public final c<List<T>> O5(int i11, long j11, TimeUnit timeUnit, d dVar) {
        return J5(i11, j11, timeUnit, dVar).v6();
    }

    public final c<c<T>> O6(int i11, int i12) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("count > 0 required but it was " + i11);
        }
        if (i12 > 0) {
            return (c<c<T>>) a3(new a4(i11, i12));
        }
        throw new IllegalArgumentException("skip > 0 required but it was " + i12);
    }

    public final c<T> P1(wb0.a aVar) {
        return (c<T>) a3(new f2(aVar));
    }

    public final c<T> P3(long j11, wb0.a aVar) {
        return (c<T>) a3(new r2(j11, aVar));
    }

    public final c<T> P4() {
        return a4().B7();
    }

    public final c<List<T>> P5(long j11, TimeUnit timeUnit) {
        return K5(j11, timeUnit).v6();
    }

    public final c<c<T>> P6(long j11, long j12, TimeUnit timeUnit) {
        return Q6(j11, j12, timeUnit, Integer.MAX_VALUE, bc0.c.a());
    }

    public final c<List<T>> Q(long j11, TimeUnit timeUnit, int i11) {
        return (c<List<T>>) a3(new t1(j11, j11, timeUnit, i11, bc0.c.a()));
    }

    public final c<T> Q1(int i11) {
        return (c<T>) a3(new h2(i11));
    }

    public final c<T> Q3(long j11, wb0.a aVar, a.d dVar) {
        return (c<T>) a3(new r2(j11, aVar, dVar));
    }

    public final c<T> Q4() {
        return (c<T>) a3(d3.b());
    }

    public final c<List<T>> Q5(long j11, TimeUnit timeUnit, d dVar) {
        return L5(j11, timeUnit, dVar).v6();
    }

    public final c<c<T>> Q6(long j11, long j12, TimeUnit timeUnit, int i11, d dVar) {
        return (c<c<T>>) a3(new c4(j11, j12, timeUnit, i11, dVar));
    }

    public final c<T> R1(int i11, T t11) {
        return (c<T>) a3(new h2(i11, t11));
    }

    public final c<T> R3() {
        return (c<T>) a3(s2.b());
    }

    public final c<T> R4(p<? super T, Boolean> pVar) {
        return V1(pVar).Q4();
    }

    public final <E> c<T> R5(c<? extends E> cVar) {
        return (c<T>) a3(new p3(cVar));
    }

    public final c<c<T>> R6(long j11, long j12, TimeUnit timeUnit, d dVar) {
        return Q6(j11, j12, timeUnit, Integer.MAX_VALUE, dVar);
    }

    public final c<List<T>> S(long j11, TimeUnit timeUnit, int i11, d dVar) {
        return (c<List<T>>) a3(new t1(j11, j11, timeUnit, i11, dVar));
    }

    public final c<T> S3(wb0.b<? super T> bVar) {
        return (c<T>) a3(new s2(bVar));
    }

    public final c<T> S4(T t11) {
        return (c<T>) a3(new d3(t11));
    }

    public final c<T> S5(p<? super T, Boolean> pVar) {
        return (c<T>) a3(new q3(pVar));
    }

    public final c<c<T>> S6(long j11, TimeUnit timeUnit) {
        return R6(j11, j11, timeUnit, bc0.c.a());
    }

    public final c<T> T3() {
        return (c<T>) a3(t2.b());
    }

    public final c<T> T4(T t11, p<? super T, Boolean> pVar) {
        return V1(pVar).S4(t11);
    }

    public final c<T> T5(p<? super T, Boolean> pVar) {
        return (c<T>) a3(new r3(pVar));
    }

    public final c<c<T>> T6(long j11, TimeUnit timeUnit, int i11) {
        return U6(j11, timeUnit, i11, bc0.c.a());
    }

    public final c<List<T>> U(long j11, TimeUnit timeUnit, d dVar) {
        return I(j11, j11, timeUnit, dVar);
    }

    public final c<Boolean> U1(p<? super T, Boolean> pVar) {
        return a3(new o1(pVar, false));
    }

    public final c<T> U3(c<? extends T> cVar) {
        return (c<T>) a3(u2.h(cVar));
    }

    public final c<T> U4(int i11) {
        return (c<T>) a3(new e3(i11));
    }

    public final zb0.a<T> U5() {
        xb0.a q11 = xb0.a.q(Long.MAX_VALUE);
        q5(q11);
        return q11;
    }

    public final c<c<T>> U6(long j11, TimeUnit timeUnit, int i11, d dVar) {
        return Q6(j11, j11, timeUnit, i11, dVar);
    }

    public final <B> c<List<T>> V(c<B> cVar) {
        return Z(cVar, 16);
    }

    public final c<T> V1(p<? super T, Boolean> pVar) {
        return I6(new h0(this, pVar));
    }

    public final c<T> V3(p<? super Throwable, ? extends c<? extends T>> pVar) {
        return (c<T>) a3(new u2(pVar));
    }

    public final c<T> V4(long j11, TimeUnit timeUnit) {
        return W4(j11, timeUnit, bc0.c.a());
    }

    public final zb0.a<T> V5(long j11) {
        xb0.a q11 = xb0.a.q(j11);
        q5(q11);
        return q11;
    }

    public final c<c<T>> V6(long j11, TimeUnit timeUnit, d dVar) {
        return U6(j11, timeUnit, Integer.MAX_VALUE, dVar);
    }

    @Deprecated
    public final c<T> W1(wb0.a aVar) {
        return (c<T>) a3(new c2(aVar));
    }

    public final c<T> W2() {
        return H5(1).Q4();
    }

    public final c<T> W3(p<? super Throwable, ? extends T> pVar) {
        return (c<T>) a3(u2.j(pVar));
    }

    public final c<T> W4(long j11, TimeUnit timeUnit, d dVar) {
        return I6(new b1(this, j11, timeUnit, dVar));
    }

    public final c<T> W5(long j11, TimeUnit timeUnit) {
        return X5(j11, timeUnit, bc0.c.a());
    }

    public final <U> c<c<T>> W6(c<U> cVar) {
        return (c<c<T>>) a3(new y3(cVar));
    }

    public final c<T> X1() {
        return D5(1).Q4();
    }

    public final c<T> X2(p<? super T, Boolean> pVar) {
        return V1(pVar).H5(1).Q4();
    }

    public final c<T> X3(c<? extends T> cVar) {
        return (c<T>) a3(u2.b(cVar));
    }

    public final c<T> X4(int i11) {
        return (c<T>) a3(new f3(i11));
    }

    public final c<T> X5(long j11, TimeUnit timeUnit, d dVar) {
        return (c<T>) a3(new s3(j11, timeUnit, dVar));
    }

    public final <TOpening, TClosing> c<c<T>> X6(c<? extends TOpening> cVar, p<? super TOpening, ? extends c<? extends TClosing>> pVar) {
        return (c<c<T>>) a3(new b4(cVar, pVar));
    }

    public final c<T> Y1(p<? super T, Boolean> pVar) {
        return G5(pVar).Q4();
    }

    public final c<T> Y2(T t11) {
        return H5(1).S4(t11);
    }

    public final c<T> Y3() {
        return I6(new f0(this));
    }

    public final c<T> Y4(long j11, TimeUnit timeUnit) {
        return Z4(j11, timeUnit, bc0.c.a());
    }

    public final c<T> Y5(long j11, TimeUnit timeUnit) {
        return H4(j11, timeUnit);
    }

    public final <TClosing> c<c<T>> Y6(wb0.o<? extends c<? extends TClosing>> oVar) {
        return (c<c<T>>) a3(new z3(oVar));
    }

    public final <B> c<List<T>> Z(c<B> cVar, int i11) {
        return (c<List<T>>) a3(new q1(cVar, i11));
    }

    public final <R> c<R> Z0(p<? super T, ? extends c<? extends R>> pVar) {
        return this instanceof k ? ((k) this).z7(pVar) : I6(new z(this, pVar, 2, 0));
    }

    public final c<T> Z1(T t11) {
        return D5(1).S4(t11);
    }

    public final c<T> Z2(T t11, p<? super T, Boolean> pVar) {
        return V1(pVar).H5(1).S4(t11);
    }

    public final <R> c<R> Z3(p<? super c<T>, ? extends c<R>> pVar) {
        return v2.C7(this, pVar);
    }

    public final c<T> Z4(long j11, TimeUnit timeUnit, d dVar) {
        return (c<T>) a3(new g3(j11, timeUnit, dVar));
    }

    public final c<T> Z5(long j11, TimeUnit timeUnit, d dVar) {
        return I4(j11, timeUnit, dVar);
    }

    public final <R> c<R> Z6(Iterable<c<?>> iterable, y<R> yVar) {
        return I6(new e4(this, null, iterable, yVar));
    }

    public final <TOpening, TClosing> c<List<T>> a0(c<? extends TOpening> cVar, p<? super TOpening, ? extends c<? extends TClosing>> pVar) {
        return (c<List<T>>) a3(new s1(cVar, pVar));
    }

    public final <R> c<R> a1(p<? super T, ? extends c<? extends R>> pVar) {
        return this instanceof k ? ((k) this).z7(pVar) : I6(new z(this, pVar, 2, 2));
    }

    public final c<T> a2(T t11, p<? super T, Boolean> pVar) {
        return G5(pVar).S4(t11);
    }

    public final <R> c<R> a3(b<? extends R, ? super T> bVar) {
        return I6(new q0(this.f84992a, bVar));
    }

    public final yb0.c<T> a4() {
        return v2.E7(this);
    }

    public final <U> c<T> a5(c<U> cVar) {
        return (c<T>) a3(new h3(cVar));
    }

    public final c<T> a6(long j11, TimeUnit timeUnit) {
        return n1(j11, timeUnit);
    }

    public final <T1, T2, T3, T4, T5, T6, T7, T8, R> c<R> a7(c<T1> cVar, c<T2> cVar2, c<T3> cVar3, c<T4> cVar4, c<T5> cVar5, c<T6> cVar6, c<T7> cVar7, c<T8> cVar8, x<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, R> xVar) {
        return I6(new e4(this, new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8}, null, a0.n(xVar)));
    }

    public final <TClosing> c<List<T>> b0(wb0.o<? extends c<? extends TClosing>> oVar) {
        return (c<List<T>>) a3(new q1(oVar, 16));
    }

    public final <R> c<R> b1(p<? super T, ? extends c<? extends R>> pVar) {
        return c1(pVar, j.f86718d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> c<R> b2(p<? super T, ? extends c<? extends R>> pVar) {
        return getClass() == k.class ? ((k) this).z7(pVar) : h3(c3(pVar));
    }

    public final c<T> b3(int i11) {
        return D5(i11);
    }

    public final c<T> b5(p<? super T, Boolean> pVar) {
        return (c<T>) a3(new i3(i3.b(pVar)));
    }

    public final c<T> b6(long j11, TimeUnit timeUnit, d dVar) {
        return o1(j11, timeUnit, dVar);
    }

    public final <T1, T2, T3, T4, T5, T6, T7, R> c<R> b7(c<T1> cVar, c<T2> cVar2, c<T3> cVar3, c<T4> cVar4, c<T5> cVar5, c<T6> cVar6, c<T7> cVar7, wb0.w<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, R> wVar) {
        return I6(new e4(this, new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7}, null, a0.m(wVar)));
    }

    public final c<Boolean> c(p<? super T, Boolean> pVar) {
        return a3(new n1(pVar));
    }

    public final c<T> c0() {
        return rx.internal.operators.h.w7(this);
    }

    public final <R> c<R> c1(p<? super T, ? extends c<? extends R>> pVar, int i11) {
        if (i11 >= 1) {
            return a3(new g2(pVar, i11, Integer.MAX_VALUE));
        }
        throw new IllegalArgumentException("capacityHint > 0 required but it was " + i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> c<R> c2(p<? super T, ? extends c<? extends R>> pVar, int i11) {
        return getClass() == k.class ? ((k) this).z7(pVar) : i3(c3(pVar), i11);
    }

    public final <R> c<R> c3(p<? super T, ? extends R> pVar) {
        return I6(new r0(this, pVar));
    }

    public final c<T> c5() {
        return (c<T>) E6().k2(o.c());
    }

    public final c<bc0.e<T>> c6() {
        return d6(bc0.c.a());
    }

    public final <T1, T2, T3, T4, T5, T6, R> c<R> c7(c<T1> cVar, c<T2> cVar2, c<T3> cVar3, c<T4> cVar4, c<T5> cVar5, c<T6> cVar6, v<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, R> vVar) {
        return I6(new e4(this, new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6}, null, a0.l(vVar)));
    }

    @Deprecated
    public final c<T> d0(int i11) {
        return e0(i11);
    }

    public final <R> c<R> d1(p<? super T, ? extends c<? extends R>> pVar, int i11, int i12) {
        if (i11 < 1) {
            throw new IllegalArgumentException("capacityHint > 0 required but it was " + i11);
        }
        if (i12 >= 1) {
            return a3(new g2(pVar, i11, i12));
        }
        throw new IllegalArgumentException("maxConcurrent > 0 required but it was " + i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> c<R> d2(p<? super T, ? extends c<? extends R>> pVar, p<? super Throwable, ? extends c<? extends R>> pVar2, wb0.o<? extends c<? extends R>> oVar) {
        return h3(d3(pVar, pVar2, oVar));
    }

    public final <R> c<R> d3(p<? super T, ? extends R> pVar, p<? super Throwable, ? extends R> pVar2, wb0.o<? extends R> oVar) {
        return a3(new l2(pVar, pVar2, oVar));
    }

    public final c<T> d4(int i11) {
        if (i11 > 0) {
            return (c<T>) a3(q2.b(i11));
        }
        throw new IllegalArgumentException("n > 0 required but it was " + i11);
    }

    public final c<T> d5(q<? super T, ? super T, Integer> qVar) {
        return (c<T>) G6(qVar).k2(o.c());
    }

    public final c<bc0.e<T>> d6(d dVar) {
        return (c<bc0.e<T>>) a3(new t3(dVar));
    }

    public final <T1, T2, T3, T4, T5, R> c<R> d7(c<T1> cVar, c<T2> cVar2, c<T3> cVar3, c<T4> cVar4, c<T5> cVar5, u<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, R> uVar) {
        return I6(new e4(this, new c[]{cVar, cVar2, cVar3, cVar4, cVar5}, null, a0.k(uVar)));
    }

    public final c<T> e0(int i11) {
        return rx.internal.operators.h.x7(this, i11);
    }

    public final <R> c<R> e1(p<? super T, ? extends Iterable<? extends R>> pVar) {
        return k0.b(this, pVar, j.f86718d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> c<R> e2(p<? super T, ? extends c<? extends R>> pVar, p<? super Throwable, ? extends c<? extends R>> pVar2, wb0.o<? extends c<? extends R>> oVar, int i11) {
        return i3(d3(pVar, pVar2, oVar), i11);
    }

    public final c<Notification<T>> e3() {
        return (c<Notification<T>>) a3(n2.b());
    }

    public final <R> c<R> e4(R r11, q<R, ? super T, R> qVar) {
        return I6(new y0(this, r11, qVar));
    }

    public final c<T> e5(Iterable<T> iterable) {
        return v0(u2(iterable), this);
    }

    public final c<T> e6(long j11, TimeUnit timeUnit) {
        return g6(j11, timeUnit, null, bc0.c.a());
    }

    public final <T1, T2, T3, T4, R> c<R> e7(c<T1> cVar, c<T2> cVar2, c<T3> cVar3, c<T4> cVar4, t<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> tVar) {
        return I6(new e4(this, new c[]{cVar, cVar2, cVar3, cVar4}, null, a0.j(tVar)));
    }

    public final <R> c<R> f0(Class<R> cls) {
        return a3(new u1(cls));
    }

    public final c<T> f1(c<? extends T> cVar) {
        return v0(this, cVar);
    }

    public final <U, R> c<R> f2(p<? super T, ? extends c<? extends U>> pVar, q<? super T, ? super U, ? extends R> qVar) {
        return h3(a3(new m2(pVar, qVar)));
    }

    public final c<T> f4(q<T, T, T> qVar) {
        return I6(new x0(this, qVar));
    }

    public final c<T> f5(T t11) {
        return v0(M2(t11), this);
    }

    public final c<T> f6(long j11, TimeUnit timeUnit, c<? extends T> cVar) {
        return g6(j11, timeUnit, cVar, bc0.c.a());
    }

    public final <T1, T2, T3, R> c<R> f7(c<T1> cVar, c<T2> cVar2, c<T3> cVar3, s<? super T, ? super T1, ? super T2, ? super T3, R> sVar) {
        return I6(new e4(this, new c[]{cVar, cVar2, cVar3}, null, a0.i(sVar)));
    }

    public final <R> c<R> g0(wb0.o<R> oVar, wb0.c<R, ? super T> cVar) {
        return I6(new rx.internal.operators.x(this, oVar, cVar));
    }

    public final c<Boolean> g1(Object obj) {
        return U1(InternalObservableUtils.equalsWith(obj));
    }

    public final <U, R> c<R> g2(p<? super T, ? extends c<? extends U>> pVar, q<? super T, ? super U, ? extends R> qVar, int i11) {
        return i3(a3(new m2(pVar, qVar)), i11);
    }

    public final c<T> g4() {
        return w0.h(this);
    }

    public final c<T> g5(T t11, T t12) {
        return v0(N2(t11, t12), this);
    }

    public final c<T> g6(long j11, TimeUnit timeUnit, c<? extends T> cVar, d dVar) {
        return I6(new g1(this, j11, timeUnit, dVar, cVar));
    }

    public final <T1, T2, R> c<R> g7(c<T1> cVar, c<T2> cVar2, r<? super T, ? super T1, ? super T2, R> rVar) {
        return I6(new e4(this, new c[]{cVar, cVar2}, null, a0.h(rVar)));
    }

    public final c<Integer> h1() {
        return e4(0, InternalObservableUtils.COUNTER);
    }

    public final c<T> h2(p<? super T, ? extends rx.b> pVar) {
        return j2(pVar, false, Integer.MAX_VALUE);
    }

    public final c<T> h4(long j11) {
        return w0.j(this, j11);
    }

    public final c<T> h5(T t11, T t12, T t13) {
        return v0(O2(t11, t12, t13), this);
    }

    public final c<T> h6(long j11, TimeUnit timeUnit, d dVar) {
        return g6(j11, timeUnit, null, dVar);
    }

    public final <U, R> c<R> h7(c<? extends U> cVar, q<? super T, ? super U, ? extends R> qVar) {
        return a3(new d4(cVar, qVar));
    }

    public final c<Long> i1() {
        return e4(0L, InternalObservableUtils.LONG_COUNTER);
    }

    public final c<T> i2(p<? super T, ? extends rx.b> pVar, boolean z11) {
        return j2(pVar, z11, Integer.MAX_VALUE);
    }

    public final c<T> i4(long j11, d dVar) {
        return w0.l(this, j11, dVar);
    }

    public final c<T> i5(T t11, T t12, T t13, T t14) {
        return v0(P2(t11, t12, t13, t14), this);
    }

    public final <U, V> c<T> i6(wb0.o<? extends c<U>> oVar, p<? super T, ? extends c<V>> pVar) {
        return j6(oVar, pVar, null);
    }

    public final <R> c<R> i7(c<?>[] cVarArr, y<R> yVar) {
        return I6(new e4(this, cVarArr, null, yVar));
    }

    public final c<T> j2(p<? super T, ? extends rx.b> pVar, boolean z11, int i11) {
        return I6(new i0(this, pVar, z11, i11));
    }

    public final c<T> j4(d dVar) {
        return w0.m(this, dVar);
    }

    public final c<T> j5(T t11, T t12, T t13, T t14, T t15) {
        return v0(Q2(t11, t12, t13, t14, t15), this);
    }

    public final <U, V> c<T> j6(wb0.o<? extends c<U>> oVar, p<? super T, ? extends c<V>> pVar, c<? extends T> cVar) {
        if (pVar != null) {
            return I6(new f1(this, oVar != null ? r1(oVar) : null, pVar, cVar));
        }
        throw new NullPointerException("timeoutSelector is null");
    }

    public final <R> c<R> k2(p<? super T, ? extends Iterable<? extends R>> pVar) {
        return l2(pVar, j.f86718d);
    }

    public final c<T> k4(p<? super c<? extends Void>, ? extends c<?>> pVar) {
        return w0.n(this, InternalObservableUtils.createRepeatDematerializer(pVar));
    }

    public final c<T> k5(T t11, T t12, T t13, T t14, T t15, T t16) {
        return v0(R2(t11, t12, t13, t14, t15, t16), this);
    }

    public final <V> c<T> k6(p<? super T, ? extends c<V>> pVar) {
        return j6(null, pVar, null);
    }

    public final <R> c<R> l2(p<? super T, ? extends Iterable<? extends R>> pVar, int i11) {
        return k0.b(this, pVar, i11);
    }

    public final c<T> l4(p<? super c<? extends Void>, ? extends c<?>> pVar, d dVar) {
        return w0.o(this, InternalObservableUtils.createRepeatDematerializer(pVar), dVar);
    }

    public final c<T> l5(T t11, T t12, T t13, T t14, T t15, T t16, T t17) {
        return v0(S2(t11, t12, t13, t14, t15, t16, t17), this);
    }

    public final <V> c<T> l6(p<? super T, ? extends c<V>> pVar, c<? extends T> cVar) {
        return j6(null, pVar, cVar);
    }

    public final <U, R> c<R> m2(p<? super T, ? extends Iterable<? extends U>> pVar, q<? super T, ? super U, ? extends R> qVar) {
        return f2(m2.b(pVar), qVar);
    }

    public final <R> c<R> m4(p<? super c<T>, ? extends c<R>> pVar) {
        return w2.H7(InternalObservableUtils.createReplaySupplier(this), pVar);
    }

    public final c<T> m5(T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18) {
        return v0(T2(t11, t12, t13, t14, t15, t16, t17, t18), this);
    }

    public final c<T> n1(long j11, TimeUnit timeUnit) {
        return o1(j11, timeUnit, bc0.c.a());
    }

    public final <U, R> c<R> n2(p<? super T, ? extends Iterable<? extends U>> pVar, q<? super T, ? super U, ? extends R> qVar, int i11) {
        return g2(m2.b(pVar), qVar, i11);
    }

    public final <R> c<R> n4(p<? super c<T>, ? extends c<R>> pVar, int i11) {
        return w2.H7(InternalObservableUtils.createReplaySupplier(this, i11), pVar);
    }

    public final c<T> n5(T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18, T t19) {
        return v0(U2(t11, t12, t13, t14, t15, t16, t17, t18, t19), this);
    }

    public final c<T> o1(long j11, TimeUnit timeUnit, d dVar) {
        return (c<T>) a3(new w1(j11, timeUnit, dVar));
    }

    public final <R> c<R> o2(p<? super T, ? extends e<? extends R>> pVar) {
        return q2(pVar, false, Integer.MAX_VALUE);
    }

    public final <R> c<R> o4(p<? super c<T>, ? extends c<R>> pVar, int i11, long j11, TimeUnit timeUnit) {
        return p4(pVar, i11, j11, timeUnit, bc0.c.a());
    }

    public final c<T> o5(c<T> cVar) {
        return v0(cVar, this);
    }

    public final <U> c<T> p1(p<? super T, ? extends c<U>> pVar) {
        return (c<T>) a3(new v1(pVar));
    }

    public final <R> c<R> p2(p<? super T, ? extends e<? extends R>> pVar, boolean z11) {
        return q2(pVar, z11, Integer.MAX_VALUE);
    }

    public final <R> c<R> p4(p<? super c<T>, ? extends c<R>> pVar, int i11, long j11, TimeUnit timeUnit, d dVar) {
        if (i11 >= 0) {
            return w2.H7(InternalObservableUtils.createReplaySupplier(this, i11, j11, timeUnit, dVar), pVar);
        }
        throw new IllegalArgumentException("bufferSize < 0");
    }

    public final h p5() {
        return r5(new rx.internal.util.c(m.a(), InternalObservableUtils.ERROR_NOT_IMPLEMENTED, m.a()));
    }

    public final c<T> q1(T t11) {
        return y5(M2(t11));
    }

    public final <R> c<R> q2(p<? super T, ? extends e<? extends R>> pVar, boolean z11, int i11) {
        return I6(new j0(this, pVar, z11, i11));
    }

    public final <R> c<R> q4(p<? super c<T>, ? extends c<R>> pVar, int i11, d dVar) {
        return w2.H7(InternalObservableUtils.createReplaySupplier(this, i11), InternalObservableUtils.createReplaySelectorAndObserveOn(pVar, dVar));
    }

    public final h q5(qb0.c<? super T> cVar) {
        if (cVar instanceof g) {
            return r5((g) cVar);
        }
        if (cVar != null) {
            return r5(new rx.internal.util.g(cVar));
        }
        throw new NullPointerException("observer is null");
    }

    public final c<bc0.f<T>> q6() {
        return r6(bc0.c.a());
    }

    public final c<T> r(c<? extends T> cVar) {
        return e(this, cVar);
    }

    public final void r2(wb0.b<? super T> bVar) {
        t5(bVar);
    }

    public final <R> c<R> r4(p<? super c<T>, ? extends c<R>> pVar, long j11, TimeUnit timeUnit) {
        return s4(pVar, j11, timeUnit, bc0.c.a());
    }

    public final h r5(g<? super T> gVar) {
        return s5(gVar, this);
    }

    public final c<bc0.f<T>> r6(d dVar) {
        return (c<bc0.f<T>>) a3(new u3(dVar));
    }

    public <R> c<R> s0(InterfaceC1074c<? super T, ? extends R> interfaceC1074c) {
        return (c) interfaceC1074c.call(this);
    }

    public final c<T> s1(long j11, TimeUnit timeUnit) {
        return t1(j11, timeUnit, bc0.c.a());
    }

    public final void s2(wb0.b<? super T> bVar, wb0.b<Throwable> bVar2) {
        u5(bVar, bVar2);
    }

    public final <R> c<R> s4(p<? super c<T>, ? extends c<R>> pVar, long j11, TimeUnit timeUnit, d dVar) {
        return w2.H7(InternalObservableUtils.createReplaySupplier(this, j11, timeUnit, dVar), pVar);
    }

    public final <R> R s6(p<? super c<T>, R> pVar) {
        return pVar.call(this);
    }

    public final c<T> t1(long j11, TimeUnit timeUnit, d dVar) {
        return (c<T>) a3(new x1(j11, timeUnit, dVar));
    }

    public final void t2(wb0.b<? super T> bVar, wb0.b<Throwable> bVar2, wb0.a aVar) {
        v5(bVar, bVar2, aVar);
    }

    public final <R> c<R> t4(p<? super c<T>, ? extends c<R>> pVar, d dVar) {
        return w2.H7(InternalObservableUtils.createReplaySupplier(this), InternalObservableUtils.createReplaySelectorAndObserveOn(pVar, dVar));
    }

    public final h t5(wb0.b<? super T> bVar) {
        if (bVar != null) {
            return r5(new rx.internal.util.c(bVar, InternalObservableUtils.ERROR_NOT_IMPLEMENTED, m.a()));
        }
        throw new IllegalArgumentException("onNext can not be null");
    }

    public final yb0.b<T> t6() {
        return yb0.b.g(this);
    }

    public final <U, V> c<T> u1(wb0.o<? extends c<U>> oVar, p<? super T, ? extends c<V>> pVar) {
        return (c<T>) z1(oVar).a3(new y1(this, pVar));
    }

    public final yb0.c<T> u4() {
        return w2.C7(this);
    }

    public final h u5(wb0.b<? super T> bVar, wb0.b<Throwable> bVar2) {
        if (bVar == null) {
            throw new IllegalArgumentException("onNext can not be null");
        }
        if (bVar2 != null) {
            return r5(new rx.internal.util.c(bVar, bVar2, m.a()));
        }
        throw new IllegalArgumentException("onError can not be null");
    }

    public rx.b u6() {
        return rx.b.J(this);
    }

    public final <T2, R> c<R> u7(Iterable<? extends T2> iterable, q<? super T, ? super T2, ? extends R> qVar) {
        return a3(new g4(iterable, qVar));
    }

    public final <U> c<T> v1(p<? super T, ? extends c<U>> pVar) {
        return (c<T>) a3(new y1(this, pVar));
    }

    public final yb0.c<T> v4(int i11) {
        return w2.D7(this, i11);
    }

    public final h v5(wb0.b<? super T> bVar, wb0.b<Throwable> bVar2, wb0.a aVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("onNext can not be null");
        }
        if (bVar2 == null) {
            throw new IllegalArgumentException("onError can not be null");
        }
        if (aVar != null) {
            return r5(new rx.internal.util.c(bVar, bVar2, aVar));
        }
        throw new IllegalArgumentException("onComplete can not be null");
    }

    public final c<List<T>> v6() {
        return (c<List<T>>) a3(v3.b());
    }

    public final <T2, R> c<R> v7(c<? extends T2> cVar, q<? super T, ? super T2, ? extends R> qVar) {
        return r7(this, cVar, qVar);
    }

    public final c<T> w1(long j11, TimeUnit timeUnit) {
        return x1(j11, timeUnit, bc0.c.a());
    }

    public final yb0.c<T> w4(int i11, long j11, TimeUnit timeUnit) {
        return x4(i11, j11, timeUnit, bc0.c.a());
    }

    public final c<T> w5(d dVar) {
        return x5(dVar, !(this.f84992a instanceof rx.internal.operators.a0));
    }

    public final <K> c<Map<K, T>> w6(p<? super T, ? extends K> pVar) {
        return I6(new j1(this, pVar, o.c()));
    }

    public final c<T> x1(long j11, TimeUnit timeUnit, d dVar) {
        return I6(new c0(this, j11, timeUnit, dVar));
    }

    public final yb0.c<T> x4(int i11, long j11, TimeUnit timeUnit, d dVar) {
        if (i11 >= 0) {
            return w2.F7(this, j11, timeUnit, dVar, i11);
        }
        throw new IllegalArgumentException("bufferSize < 0");
    }

    public final c<T> x5(d dVar, boolean z11) {
        return this instanceof k ? ((k) this).A7(dVar) : I6(new j3(this, dVar, z11));
    }

    public final <K, V> c<Map<K, V>> x6(p<? super T, ? extends K> pVar, p<? super T, ? extends V> pVar2) {
        return I6(new j1(this, pVar, pVar2));
    }

    public final <U> c<T> y1(c<U> cVar) {
        cVar.getClass();
        return I6(new d0(this, cVar));
    }

    public final yb0.c<T> y4(int i11, d dVar) {
        return w2.I7(v4(i11), dVar);
    }

    public final c<T> y5(c<? extends T> cVar) {
        if (cVar != null) {
            return I6(new c1(this, cVar));
        }
        throw new NullPointerException("alternate is null");
    }

    public final <K, V> c<Map<K, V>> y6(p<? super T, ? extends K> pVar, p<? super T, ? extends V> pVar2, wb0.o<? extends Map<K, V>> oVar) {
        return I6(new j1(this, pVar, pVar2, oVar));
    }

    public final <U> c<T> z1(wb0.o<? extends c<U>> oVar) {
        return I6(new e0(this, oVar));
    }

    public final yb0.c<T> z4(long j11, TimeUnit timeUnit) {
        return A4(j11, timeUnit, bc0.c.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> c<R> z5(p<? super T, ? extends c<? extends R>> pVar) {
        return B5(c3(pVar));
    }

    public final <K> c<Map<K, Collection<T>>> z6(p<? super T, ? extends K> pVar) {
        return I6(new k1(this, pVar, o.c()));
    }
}
