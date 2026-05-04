package e40;

import h40.c1;
import h40.x0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class n {

    @m80.k
    public static final x0 A;
    public static final int B = 0;
    public static final int C = 1;
    public static final int D = 2;
    public static final int E = 3;
    public static final int F = 60;
    public static final long G = 1152921504606846975L;
    public static final long H = 4611686018427387904L;
    public static final long I = 4611686018427387903L;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final t<Object> f49114a = new t<>(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public static final int f49115b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f49116c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f49117d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final long f49118e = Long.MAX_VALUE;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final x0 f49119f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final x0 f49120g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final x0 f49121h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final x0 f49122i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final x0 f49123j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final x0 f49124k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public static final x0 f49125l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public static final x0 f49126m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public static final x0 f49127n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public static final x0 f49128o;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public static final x0 f49129p;

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public static final x0 f49130q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f49131r = 0;

    /* renamed from: s, reason: collision with root package name */
    public static final int f49132s = 1;

    /* renamed from: t, reason: collision with root package name */
    public static final int f49133t = 2;

    /* renamed from: u, reason: collision with root package name */
    public static final int f49134u = 3;

    /* renamed from: v, reason: collision with root package name */
    public static final int f49135v = 4;

    /* renamed from: w, reason: collision with root package name */
    public static final int f49136w = 5;

    /* renamed from: x, reason: collision with root package name */
    @m80.k
    public static final x0 f49137x;

    /* renamed from: y, reason: collision with root package name */
    @m80.k
    public static final x0 f49138y;

    /* renamed from: z, reason: collision with root package name */
    @m80.k
    public static final x0 f49139z;

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a<E> extends FunctionReferenceImpl implements x00.p<Long, t<E>, t<E>> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f49140a = new a();

        public a() {
            super(2, n.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final t<E> a(long j11, t<E> tVar) {
            return n.x(j11, tVar);
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(Long l11, Object obj) {
            return a(l11.longValue(), (t) obj);
        }
    }

    static {
        int e11;
        int e12;
        e11 = c1.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
        f49115b = e11;
        e12 = c1.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
        f49116c = e12;
        f49119f = new x0("BUFFERED");
        f49120g = new x0("SHOULD_BUFFER");
        f49121h = new x0("S_RESUMING_BY_RCV");
        f49122i = new x0("RESUMING_BY_EB");
        f49123j = new x0("POISONED");
        f49124k = new x0("DONE_RCV");
        f49125l = new x0("INTERRUPTED_SEND");
        f49126m = new x0("INTERRUPTED_RCV");
        f49127n = new x0("CHANNEL_CLOSED");
        f49128o = new x0("SUSPEND");
        f49129p = new x0("SUSPEND_NO_WAITER");
        f49130q = new x0("FAILED");
        f49137x = new x0("NO_RECEIVE_RESULT");
        f49138y = new x0("CLOSE_HANDLER_CLOSED");
        f49139z = new x0("CLOSE_HANDLER_INVOKED");
        A = new x0("NO_CLOSE_CAUSE");
    }

    public static final long A(long j11) {
        return j11 & 4611686018427387903L;
    }

    public static final boolean B(long j11) {
        return (j11 & 4611686018427387904L) != 0;
    }

    public static final int C(long j11) {
        return (int) (j11 >> 60);
    }

    public static final long D(long j11) {
        return j11 & G;
    }

    public static final long E(int i11) {
        if (i11 == 0) {
            return 0L;
        }
        if (i11 != Integer.MAX_VALUE) {
            return i11;
        }
        return Long.MAX_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean F(c40.n<? super T> nVar, T t11, x00.q<? super Throwable, ? super T, ? super kotlin.coroutines.d, g2> qVar) {
        Object n11 = nVar.n(t11, null, qVar);
        if (n11 == null) {
            return false;
        }
        nVar.s(n11);
        return true;
    }

    public static /* synthetic */ boolean G(c40.n nVar, Object obj, x00.q qVar, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            qVar = null;
        }
        return F(nVar, obj, qVar);
    }

    public static final long v(long j11, boolean z11) {
        return (z11 ? 4611686018427387904L : 0L) + j11;
    }

    public static final long w(long j11, int i11) {
        return (i11 << 60) + j11;
    }

    public static final <E> t<E> x(long j11, t<E> tVar) {
        return new t<>(j11, tVar, tVar.G(), 0);
    }

    @m80.k
    public static final <E> h10.i<t<E>> y() {
        return a.f49140a;
    }

    @m80.k
    public static final x0 z() {
        return f49127n;
    }
}
