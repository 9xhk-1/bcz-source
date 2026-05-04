package mx;

import ix.g1;
import mx.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c extends v.a {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final byte[] f73771b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final ix.k f73772c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final g1 f73773d;

    public /* synthetic */ c(byte[] bArr, ix.k kVar, g1 g1Var, int i11, kotlin.jvm.internal.v vVar) {
        this(bArr, (i11 & 2) != 0 ? null : kVar, (i11 & 4) != 0 ? null : g1Var);
    }

    @Override // mx.v
    @m80.k
    public Long a() {
        return Long.valueOf(this.f73771b.length);
    }

    @Override // mx.v
    @m80.l
    public ix.k b() {
        return this.f73772c;
    }

    @Override // mx.v
    @m80.l
    public g1 h() {
        return this.f73773d;
    }

    @Override // mx.v.a
    @m80.k
    public byte[] m() {
        return this.f73771b;
    }

    public c(@m80.k byte[] bytes, @m80.l ix.k kVar, @m80.l g1 g1Var) {
        kotlin.jvm.internal.g0.p(bytes, "bytes");
        this.f73771b = bytes;
        this.f73772c = kVar;
        this.f73773d = g1Var;
    }
}
