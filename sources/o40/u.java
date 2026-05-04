package o40;

import c40.k1;
import c40.z0;
import kotlin.DeprecationLevel;
import kotlinx.coroutines.test.UncompletedCoroutinesError;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.n(level = DeprecationLevel.ERROR, message = "The execution order of `TestCoroutineDispatcher` can be confusing, and the mechanism of pausing is typically misunderstood. Please use `StandardTestDispatcher` or `UnconfinedTestDispatcher` instead.")
/* loaded from: classes8.dex */
public final class u extends k0 implements z0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final b0 f75848a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f75849b;

    /* JADX WARN: Multi-variable type inference failed */
    public u() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static final boolean f0(Runnable runnable) {
        return false;
    }

    public final long L() {
        long i02 = w().i0();
        w().U();
        return w().i0() - i02;
    }

    public final void U() {
        w().W0();
        if (!w().A0(false)) {
            throw new UncompletedCoroutinesError("Unfinished coroutines during tear-down. Ensure all coroutines are completed or cancelled by your test.");
        }
    }

    public final long a0() {
        return w().i0();
    }

    public final k1 d0(Runnable runnable, kotlin.coroutines.d dVar) {
        return w().N0(this, 0L, runnable, dVar, new x00.l() { // from class: o40.t
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean f02;
                f02 = u.f0((Runnable) obj);
                return Boolean.valueOf(f02);
            }
        });
    }

    @Override // c40.m0
    public void dispatch(@m80.k kotlin.coroutines.d dVar, @m80.k Runnable runnable) {
        c0.e(w(), dVar);
        if (!this.f75849b) {
            d0(runnable, dVar);
        } else {
            w().Y0(dVar);
            runnable.run();
        }
    }

    @Override // c40.m0
    public void dispatchYield(@m80.k kotlin.coroutines.d dVar, @m80.k Runnable runnable) {
        c0.e(w(), dVar);
        d0(runnable, dVar);
    }

    public final void h0() {
        w().W0();
    }

    public final void i0(boolean z11) {
        this.f75849b = z11;
        if (z11) {
            w().U();
        }
    }

    @Override // c40.m0
    @m80.k
    public String toString() {
        return "TestCoroutineDispatcher[scheduler=" + w() + l50.b.f69930l;
    }

    @Override // o40.k0
    @m80.k
    public b0 w() {
        return this.f75848a;
    }

    public /* synthetic */ u(b0 b0Var, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? new b0() : b0Var);
    }

    public u(@m80.k b0 b0Var) {
        this.f75848a = b0Var;
        this.f75849b = true;
    }
}
