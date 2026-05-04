package kotlinx.coroutines.flow;

import kotlin.jvm.internal.x0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final /* synthetic */ class u {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final x00.l<Object, Object> f68422a = new x00.l() { // from class: kotlinx.coroutines.flow.s
        @Override // x00.l
        public final Object invoke(Object obj) {
            Object d11;
            d11 = u.d(obj);
            return d11;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final x00.p<Object, Object, Boolean> f68423b = new x00.p() { // from class: kotlinx.coroutines.flow.t
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            boolean c11;
            c11 = u.c(obj, obj2);
            return Boolean.valueOf(c11);
        }
    };

    public static final boolean c(Object obj, Object obj2) {
        return kotlin.jvm.internal.g0.g(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final <T> i<T> e(@m80.k i<? extends T> iVar) {
        return iVar instanceof m0 ? iVar : h(iVar, f68422a, f68423b);
    }

    @m80.k
    public static final <T> i<T> f(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super T, Boolean> pVar) {
        x00.l<Object, Object> lVar = f68422a;
        kotlin.jvm.internal.g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>");
        return h(iVar, lVar, (x00.p) x0.q(pVar, 2));
    }

    @m80.k
    public static final <T, K> i<T> g(@m80.k i<? extends T> iVar, @m80.k x00.l<? super T, ? extends K> lVar) {
        return h(iVar, lVar, f68423b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> i<T> h(i<? extends T> iVar, x00.l<? super T, ? extends Object> lVar, x00.p<Object, Object, Boolean> pVar) {
        if (iVar instanceof g) {
            g gVar = (g) iVar;
            if (gVar.f68135b == lVar && gVar.f68136c == pVar) {
                return iVar;
            }
        }
        return new g(iVar, lVar, pVar);
    }

    public static final Object d(Object obj) {
        return obj;
    }
}
