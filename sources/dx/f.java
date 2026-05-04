package dx;

import ix.j1;
import ix.k;
import ix.p1;
import kotlin.jvm.internal.g0;
import mx.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f extends v.a {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final p1 f48211b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final byte[] f48212c;

    /* renamed from: d, reason: collision with root package name */
    public final long f48213d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final ix.k f48214e;

    public f(@m80.k p1 formData) {
        g0.p(formData, "formData");
        this.f48211b = formData;
        this.f48212c = jz.s.m(j1.b(formData), null, 1, null);
        this.f48213d = r3.length;
        this.f48214e = ix.m.b(k.a.f62847a.e(), u30.d.f91599b);
    }

    @Override // mx.v
    @m80.k
    public Long a() {
        return Long.valueOf(this.f48213d);
    }

    @Override // mx.v
    @m80.k
    public ix.k b() {
        return this.f48214e;
    }

    @Override // mx.v.a
    @m80.k
    public byte[] m() {
        return this.f48212c;
    }

    @m80.k
    public final p1 n() {
        return this.f48211b;
    }
}
