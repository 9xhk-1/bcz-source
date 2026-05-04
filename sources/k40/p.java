package k40;

import h40.x0;
import kotlin.jvm.internal.d0;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final int f65851b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f65852c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f65853d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f65854e = 3;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final x00.q<Object, Object, Object, Object> f65850a = a.f65860a;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final x0 f65855f = new x0("STATE_REG");

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final x0 f65856g = new x0("STATE_COMPLETED");

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final x0 f65857h = new x0("STATE_CANCELLED");

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final x0 f65858i = new x0("NO_RESULT");

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final x0 f65859j = new x0("PARAM_CLAUSE_0");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements x00.q {

        /* renamed from: a, reason: collision with root package name */
        public static final a f65860a = new a();

        @Override // x00.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    public static final TrySelectDetailedResult d(int i11) {
        if (i11 == 0) {
            return TrySelectDetailedResult.SUCCESSFUL;
        }
        if (i11 == 1) {
            return TrySelectDetailedResult.REREGISTER;
        }
        if (i11 == 2) {
            return TrySelectDetailedResult.CANCELLED;
        }
        if (i11 == 3) {
            return TrySelectDetailedResult.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i11).toString());
    }

    @m80.k
    public static final x0 l() {
        return f65859j;
    }

    @m80.l
    public static final <R> Object m(@m80.k x00.l<? super d<? super R>, g2> lVar, @m80.k j00.c<? super R> cVar) {
        m mVar = new m(cVar.getContext());
        lVar.invoke(mVar);
        return mVar.w(cVar);
    }

    public static final <R> Object n(x00.l<? super d<? super R>, g2> lVar, j00.c<? super R> cVar) {
        d0.e(3);
        throw null;
    }

    public static final boolean o(c40.n<? super g2> nVar, x00.q<? super Throwable, Object, ? super kotlin.coroutines.d, g2> qVar) {
        Object n11 = nVar.n(g2.f100423a, null, qVar);
        if (n11 == null) {
            return false;
        }
        nVar.s(n11);
        return true;
    }

    @c40.g2
    public static /* synthetic */ void a() {
    }

    @c40.g2
    public static /* synthetic */ void b() {
    }

    @c40.g2
    public static /* synthetic */ void c() {
    }
}
