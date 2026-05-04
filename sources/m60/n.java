package m60;

import kotlin.jvm.internal.g0;
import l60.e1;
import l60.f1;
import l60.g1;
import l60.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class n implements f1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final y0 f72458a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final y0 f72459b;

    public n(@m80.k y0 sinkPipe, @m80.k y0 sourcePipe) {
        g0.p(sinkPipe, "sinkPipe");
        g0.p(sourcePipe, "sourcePipe");
        this.f72458a = sinkPipe;
        this.f72459b = sourcePipe;
    }

    @Override // l60.f1
    @m80.k
    public e1 a() {
        return this.f72458a.r();
    }

    @m80.k
    public final y0 b() {
        return this.f72458a;
    }

    @m80.k
    public final y0 c() {
        return this.f72459b;
    }

    @Override // l60.f1
    public void cancel() {
        this.f72459b.c();
        this.f72458a.c();
    }

    @Override // l60.f1
    @m80.k
    public g1 getSource() {
        return this.f72459b.s();
    }
}
