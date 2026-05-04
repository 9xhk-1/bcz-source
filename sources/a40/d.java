package a40;

import a40.m;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "AtomicFU")
/* loaded from: classes8.dex */
public final class d {
    @m80.k
    public static final b a(boolean z11) {
        return b(z11, m.a.f1932a);
    }

    @m80.k
    public static final b b(boolean z11, @m80.k m trace) {
        g0.p(trace, "trace");
        return new b(z11, trace);
    }

    @m80.k
    public static final f c(int i11) {
        return d(i11, m.a.f1932a);
    }

    @m80.k
    public static final f d(int i11, @m80.k m trace) {
        g0.p(trace, "trace");
        return new f(i11, trace);
    }

    @m80.k
    public static final h e(long j11) {
        return f(j11, m.a.f1932a);
    }

    @m80.k
    public static final h f(long j11, @m80.k m trace) {
        g0.p(trace, "trace");
        return new h(j11, trace);
    }

    @m80.k
    public static final <T> j<T> g(T t11) {
        return h(t11, m.a.f1932a);
    }

    @m80.k
    public static final <T> j<T> h(T t11, @m80.k m trace) {
        g0.p(trace, "trace");
        return new j<>(t11, trace);
    }

    public static /* synthetic */ b i(boolean z11, m mVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            mVar = m.a.f1932a;
        }
        return b(z11, mVar);
    }

    public static /* synthetic */ f j(int i11, m mVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            mVar = m.a.f1932a;
        }
        return d(i11, mVar);
    }

    public static /* synthetic */ h k(long j11, m mVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            mVar = m.a.f1932a;
        }
        return f(j11, mVar);
    }

    public static /* synthetic */ j l(Object obj, m mVar, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            mVar = m.a.f1932a;
        }
        return h(obj, mVar);
    }
}
