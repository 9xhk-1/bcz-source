package h40;

import c40.m3;
import kotlin.coroutines.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final x0 f58220a = new x0("NO_THREAD_ELEMENTS");

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final x00.p<Object, d.b, Object> f58221b = new x00.p() { // from class: h40.d1
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            Object d11;
            d11 = g1.d(obj, (d.b) obj2);
            return d11;
        }
    };

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final x00.p<m3<?>, d.b, m3<?>> f58222c = new x00.p() { // from class: h40.e1
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            m3 e11;
            e11 = g1.e((m3) obj, (d.b) obj2);
            return e11;
        }
    };

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final x00.p<m1, d.b, m1> f58223d = new x00.p() { // from class: h40.f1
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            m1 h11;
            h11 = g1.h((m1) obj, (d.b) obj2);
            return h11;
        }
    };

    public static final Object d(Object obj, d.b bVar) {
        if (!(bVar instanceof m3)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int intValue = num != null ? num.intValue() : 1;
        return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
    }

    public static final m3<?> e(m3<?> m3Var, d.b bVar) {
        if (m3Var != null) {
            return m3Var;
        }
        if (bVar instanceof m3) {
            return (m3) bVar;
        }
        return null;
    }

    public static final void f(@m80.k kotlin.coroutines.d dVar, @m80.l Object obj) {
        if (obj == f58220a) {
            return;
        }
        if (obj instanceof m1) {
            ((m1) obj).b(dVar);
            return;
        }
        Object fold = dVar.fold(null, f58222c);
        kotlin.jvm.internal.g0.n(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((m3) fold).restoreThreadContext(dVar, obj);
    }

    @m80.k
    public static final Object g(@m80.k kotlin.coroutines.d dVar) {
        Object fold = dVar.fold(0, f58221b);
        kotlin.jvm.internal.g0.m(fold);
        return fold;
    }

    public static final m1 h(m1 m1Var, d.b bVar) {
        if (bVar instanceof m3) {
            m3<?> m3Var = (m3) bVar;
            m1Var.a(m3Var, m3Var.updateThreadContext(m1Var.f58250a));
        }
        return m1Var;
    }

    @m80.l
    public static final Object i(@m80.k kotlin.coroutines.d dVar, @m80.l Object obj) {
        if (obj == null) {
            obj = g(dVar);
        }
        if (obj == 0) {
            return f58220a;
        }
        if (obj instanceof Integer) {
            return dVar.fold(new m1(dVar, ((Number) obj).intValue()), f58223d);
        }
        kotlin.jvm.internal.g0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((m3) obj).updateThreadContext(dVar);
    }
}
