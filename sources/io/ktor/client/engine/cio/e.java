package io.ktor.client.engine.cio;

import kotlin.jvm.internal.g0;
import ux.d0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e extends ow.j {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final t f60871e = new t();

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final d0 f60872f = new d0();

    /* renamed from: g, reason: collision with root package name */
    public int f60873g = 1000;

    /* renamed from: h, reason: collision with root package name */
    public long f60874h = 15000;

    @m80.k
    public final t j() {
        return this.f60871e;
    }

    @m80.k
    public final d0 k() {
        return this.f60872f;
    }

    public final int l() {
        return this.f60873g;
    }

    public final long m() {
        return this.f60874h;
    }

    @m80.k
    public final d0 n(@m80.k x00.l<? super d0, g2> block) {
        g0.p(block, "block");
        d0 d0Var = this.f60872f;
        block.invoke(d0Var);
        return d0Var;
    }

    public final void o(int i11) {
        this.f60873g = i11;
    }

    public final void p(long j11) {
        this.f60874h = j11;
    }
}
