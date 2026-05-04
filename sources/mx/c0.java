package mx;

import ix.g1;
import java.nio.charset.Charset;
import mx.v;
import u30.r0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c0 extends v.a {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f73774b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final ix.k f73775c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final g1 f73776d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final byte[] f73777e;

    public /* synthetic */ c0(String str, ix.k kVar, g1 g1Var, int i11, kotlin.jvm.internal.v vVar) {
        this(str, kVar, (i11 & 4) != 0 ? null : g1Var);
    }

    @Override // mx.v
    @m80.k
    public Long a() {
        return Long.valueOf(this.f73777e.length);
    }

    @Override // mx.v
    @m80.k
    public ix.k b() {
        return this.f73775c;
    }

    @Override // mx.v
    @m80.l
    public g1 h() {
        return this.f73776d;
    }

    @Override // mx.v.a
    @m80.k
    public byte[] m() {
        return this.f73777e;
    }

    @m80.k
    public final String n() {
        return this.f73774b;
    }

    @m80.k
    public String toString() {
        return "TextContent[" + b() + "] \"" + r0.A9(this.f73774b, 30) + '\"';
    }

    public c0(@m80.k String text, @m80.k ix.k contentType, @m80.l g1 g1Var) {
        kotlin.jvm.internal.g0.p(text, "text");
        kotlin.jvm.internal.g0.p(contentType, "contentType");
        this.f73774b = text;
        this.f73775c = contentType;
        this.f73776d = g1Var;
        Charset a11 = ix.m.a(b());
        this.f73777e = jz.s.l(text, a11 == null ? u30.d.f91599b : a11);
    }
}
