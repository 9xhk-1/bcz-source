package kx;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f0 extends u {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final CharSequence f68966c;

    /* renamed from: d, reason: collision with root package name */
    public final int f68967d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final CharSequence f68968e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(@m80.k CharSequence version, int i11, @m80.k CharSequence statusText, @m80.k s headers, @m80.k lx.d builder) {
        super(headers, builder);
        g0.p(version, "version");
        g0.p(statusText, "statusText");
        g0.p(headers, "headers");
        g0.p(builder, "builder");
        this.f68966c = version;
        this.f68967d = i11;
        this.f68968e = statusText;
    }

    @m80.k
    public final CharSequence c() {
        return this.f68968e;
    }

    @m80.k
    public final CharSequence e() {
        return this.f68966c;
    }

    public final int getStatus() {
        return this.f68967d;
    }
}
