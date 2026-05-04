package zw;

import io.ktor.utils.io.b0;
import ix.k;
import ix.p0;
import ix.q0;
import ix.r0;
import ix.y0;
import kotlin.jvm.internal.g0;
import mx.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@b0
/* loaded from: classes8.dex */
public final class t extends v.b {

    /* renamed from: c, reason: collision with root package name */
    public final long f102986c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f102987d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f102988e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final q0 f102989f;

    public /* synthetic */ t(long j11, boolean z11, boolean z12, mx.v vVar, kotlin.jvm.internal.v vVar2) {
        this(j11, z11, z12, vVar);
    }

    @Override // mx.v.b, mx.v
    @m80.k
    public q0 d() {
        return this.f102989f;
    }

    @Override // mx.v.b
    @m80.k
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public t m(@m80.k mx.v delegate) {
        g0.p(delegate, "delegate");
        return new t(this.f102986c, this.f102987d, this.f102988e, delegate, null);
    }

    public final long p() {
        return this.f102986c;
    }

    public final boolean r() {
        return this.f102987d;
    }

    public final boolean s() {
        return this.f102988e;
    }

    @m80.k
    public String toString() {
        return "SSEClientContent";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(long j11, boolean z11, boolean z12, mx.v requestBody) {
        super(requestBody);
        g0.p(requestBody, "requestBody");
        this.f102986c = j11;
        this.f102987d = z11;
        this.f102988e = z12;
        r0 r0Var = new r0(0, 1, null);
        r0Var.j(requestBody.d());
        y0 y0Var = y0.f63006a;
        p0.b(r0Var, y0Var.d(), k.h.f62902a.d());
        r0Var.k(y0Var.u(), fx.d.f52400g);
        this.f102989f = r0Var.build();
    }
}
