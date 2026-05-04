package d40;

import android.os.Handler;
import android.os.Looper;
import c40.h1;
import c40.k1;
import c40.n;
import c40.n2;
import c40.y2;
import c40.z0;
import g10.u;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHandlerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n1#2:213\n*E\n"})
/* loaded from: classes8.dex */
public final class d extends e implements z0 {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Handler f47225a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f47226b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f47227c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final d f47228d;

    public d(Handler handler, String str, boolean z11) {
        super(null);
        this.f47225a = handler;
        this.f47226b = str;
        this.f47227c = z11;
        this.f47228d = z11 ? this : new d(handler, str, true);
    }

    public static final void d0(d dVar, Runnable runnable) {
        dVar.f47225a.removeCallbacks(runnable);
    }

    public static final void f0(n nVar, d dVar) {
        nVar.l(dVar, g2.f100423a);
    }

    public static final g2 h0(d dVar, Runnable runnable, Throwable th2) {
        dVar.f47225a.removeCallbacks(runnable);
        return g2.f100423a;
    }

    public final void U(kotlin.coroutines.d dVar, Runnable runnable) {
        n2.g(dVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        h1.c().dispatch(dVar, runnable);
    }

    @Override // c40.v2
    @k
    /* renamed from: a0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public d q() {
        return this.f47228d;
    }

    @Override // c40.m0
    public void dispatch(@k kotlin.coroutines.d dVar, @k Runnable runnable) {
        if (this.f47225a.post(runnable)) {
            return;
        }
        U(dVar, runnable);
    }

    public boolean equals(@l Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f47225a == this.f47225a && dVar.f47227c == this.f47227c;
    }

    @Override // d40.e, c40.z0
    @k
    public k1 f(long j11, @k final Runnable runnable, @k kotlin.coroutines.d dVar) {
        if (this.f47225a.postDelayed(runnable, u.C(j11, 4611686018427387903L))) {
            return new k1() { // from class: d40.a
                @Override // c40.k1
                public final void dispose() {
                    d.d0(d.this, runnable);
                }
            };
        }
        U(dVar, runnable);
        return y2.f8014a;
    }

    public int hashCode() {
        return System.identityHashCode(this.f47225a) ^ (this.f47227c ? 1231 : 1237);
    }

    @Override // c40.m0
    public boolean isDispatchNeeded(@k kotlin.coroutines.d dVar) {
        return (this.f47227c && g0.g(Looper.myLooper(), this.f47225a.getLooper())) ? false : true;
    }

    @Override // c40.z0
    public void j(long j11, @k final n<? super g2> nVar) {
        final Runnable runnable = new Runnable() { // from class: d40.b
            @Override // java.lang.Runnable
            public final void run() {
                d.f0(n.this, this);
            }
        };
        if (this.f47225a.postDelayed(runnable, u.C(j11, 4611686018427387903L))) {
            nVar.p(new x00.l() { // from class: d40.c
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 h02;
                    h02 = d.h0(d.this, runnable, (Throwable) obj);
                    return h02;
                }
            });
        } else {
            U(nVar.getContext(), runnable);
        }
    }

    @Override // c40.v2, c40.m0
    @k
    public String toString() {
        String w11 = w();
        if (w11 != null) {
            return w11;
        }
        String str = this.f47226b;
        if (str == null) {
            str = this.f47225a.toString();
        }
        if (!this.f47227c) {
            return str;
        }
        return str + ".immediate";
    }

    public /* synthetic */ d(Handler handler, String str, int i11, v vVar) {
        this(handler, (i11 & 2) != 0 ? null : str);
    }

    public d(@k Handler handler, @l String str) {
        this(handler, str, false);
    }
}
