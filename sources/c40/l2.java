package c40;

import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.coroutines.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.c1(markerClass = {h2.class})
/* loaded from: classes8.dex */
public interface l2 extends d.b {

    /* renamed from: e0, reason: collision with root package name */
    @m80.k
    public static final b f7886e0 = b.f7887a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements d.c<l2> {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f7887a = new b();
    }

    @m80.k
    q30.m<l2> C();

    @g2
    @m80.k
    k1 G0(boolean z11, boolean z12, @m80.k x00.l<? super Throwable, yz.g2> lVar);

    @m80.l
    Object K0(@m80.k j00.c<? super yz.g2> cVar);

    @yz.n(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @m80.k
    l2 P0(@m80.k l2 l2Var);

    @yz.n(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean a(Throwable th2);

    @yz.n(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    void cancel(@m80.l CancellationException cancellationException);

    boolean e();

    @m80.l
    l2 getParent();

    boolean isActive();

    boolean isCancelled();

    @g2
    @m80.k
    u m0(@m80.k w wVar);

    @m80.k
    k40.f o0();

    boolean start();

    @g2
    @m80.k
    CancellationException y0();

    @m80.k
    k1 z0(@m80.k x00.l<? super Throwable, yz.g2> lVar);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public static /* synthetic */ void b(l2 l2Var, CancellationException cancellationException, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i11 & 1) != 0) {
                cancellationException = null;
            }
            l2Var.cancel(cancellationException);
        }

        public static /* synthetic */ boolean c(l2 l2Var, Throwable th2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i11 & 1) != 0) {
                th2 = null;
            }
            return l2Var.a(th2);
        }

        public static <R> R d(@m80.k l2 l2Var, R r11, @m80.k x00.p<? super R, ? super d.b, ? extends R> pVar) {
            return (R) d.b.a.a(l2Var, r11, pVar);
        }

        @m80.l
        public static <E extends d.b> E e(@m80.k l2 l2Var, @m80.k d.c<E> cVar) {
            return (E) d.b.a.b(l2Var, cVar);
        }

        public static /* synthetic */ k1 g(l2 l2Var, boolean z11, boolean z12, x00.l lVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            if ((i11 & 2) != 0) {
                z12 = true;
            }
            return l2Var.G0(z11, z12, lVar);
        }

        @m80.k
        public static kotlin.coroutines.d h(@m80.k l2 l2Var, @m80.k d.c<?> cVar) {
            return d.b.a.c(l2Var, cVar);
        }

        @m80.k
        public static kotlin.coroutines.d j(@m80.k l2 l2Var, @m80.k kotlin.coroutines.d dVar) {
            return d.b.a.d(l2Var, dVar);
        }

        @y1
        public static /* synthetic */ void f() {
        }

        @yz.n(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @m80.k
        public static l2 i(@m80.k l2 l2Var, @m80.k l2 l2Var2) {
            return l2Var2;
        }
    }
}
