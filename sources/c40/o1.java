package c40;

import com.tencent.ijk.media.player.IjkMediaMeta;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n1#2:548\n*E\n"})
/* loaded from: classes8.dex */
public abstract class o1 extends m0 {

    /* renamed from: a, reason: collision with root package name */
    public long f7896a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7897b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public a00.m<e1<?>> f7898c;

    public static /* synthetic */ void U(o1 o1Var, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        o1Var.L(z11);
    }

    public static /* synthetic */ void w(o1 o1Var, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        o1Var.q(z11);
    }

    public final long E(boolean z11) {
        if (z11) {
            return IjkMediaMeta.AV_CH_WIDE_RIGHT;
        }
        return 1L;
    }

    public final void H(@m80.k e1<?> e1Var) {
        a00.m<e1<?>> mVar = this.f7898c;
        if (mVar == null) {
            mVar = new a00.m<>();
            this.f7898c = mVar;
        }
        mVar.addLast(e1Var);
    }

    public long I() {
        a00.m<e1<?>> mVar = this.f7898c;
        return (mVar == null || mVar.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void L(boolean z11) {
        this.f7896a += E(z11);
        if (z11) {
            return;
        }
        this.f7897b = true;
    }

    public boolean a0() {
        return f0();
    }

    public final boolean d0() {
        return this.f7896a >= E(true);
    }

    public final boolean f0() {
        a00.m<e1<?>> mVar = this.f7898c;
        if (mVar != null) {
            return mVar.isEmpty();
        }
        return true;
    }

    public long h0() {
        return !i0() ? Long.MAX_VALUE : 0L;
    }

    public final boolean i0() {
        e1<?> s11;
        a00.m<e1<?>> mVar = this.f7898c;
        if (mVar == null || (s11 = mVar.s()) == null) {
            return false;
        }
        s11.run();
        return true;
    }

    public final boolean isActive() {
        return this.f7896a > 0;
    }

    public boolean k0() {
        return false;
    }

    @Override // c40.m0
    @m80.k
    public final m0 limitedParallelism(int i11, @m80.l String str) {
        h40.y.a(i11);
        return h40.y.b(this, str);
    }

    public final void q(boolean z11) {
        long E = this.f7896a - E(z11);
        this.f7896a = E;
        if (E <= 0 && this.f7897b) {
            shutdown();
        }
    }

    public void shutdown() {
    }
}
