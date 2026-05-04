package o40;

import kotlin.DeprecationLevel;
import yz.g2;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g extends c40.a<g2> implements d0 {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final d0 f75742d;

    public g(@m80.k d0 d0Var) {
        super(d0Var.getCoroutineContext(), true, true);
        this.f75742d = d0Var;
    }

    @Override // o40.d0
    @m80.k
    public b0 I() {
        return this.f75742d.I();
    }

    public final void e2() {
        this.f75742d.F0();
    }

    @Override // o40.d0
    @yz.n(level = DeprecationLevel.ERROR, message = "This deprecation is to prevent accidentally calling `cleanupTestCoroutines` in our own code.", replaceWith = @w0(expression = "this.cleanup()", imports = {}))
    @m80.k
    /* renamed from: f2, reason: merged with bridge method [inline-methods] */
    public Void F0() {
        throw new UnsupportedOperationException("Calling `cleanupTestCoroutines` inside `runTest` is prohibited: it will be called at the end of the test in any case.");
    }

    @m80.l
    public final Throwable g2() {
        return U0();
    }
}
