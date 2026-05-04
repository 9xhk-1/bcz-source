package kx;

import ix.e1;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b0 extends u {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final e1 f68949c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final CharSequence f68950d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final CharSequence f68951e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(@m80.k e1 method, @m80.k CharSequence uri, @m80.k CharSequence version, @m80.k s headers, @m80.k lx.d builder) {
        super(headers, builder);
        g0.p(method, "method");
        g0.p(uri, "uri");
        g0.p(version, "version");
        g0.p(headers, "headers");
        g0.p(builder, "builder");
        this.f68949c = method;
        this.f68950d = uri;
        this.f68951e = version;
    }

    @m80.k
    public final e1 c() {
        return this.f68949c;
    }

    @m80.k
    public final CharSequence e() {
        return this.f68950d;
    }

    @m80.k
    public final CharSequence f() {
        return this.f68951e;
    }
}
